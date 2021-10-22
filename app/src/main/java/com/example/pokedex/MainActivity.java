package com.example.pokedex;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import static android.database.sqlite.SQLiteDatabase.openDatabase;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener{
    Button searchButton;
    TextView dataTextView;
    SQLiteDatabase mydb;
    List<String> types;
    Spinner type1Spinner;
    Spinner type2Spinner;
    Switch typeSwitch;

    private void initButtons(){
        searchButton = findViewById(R.id.SearchButton);
        dataTextView = findViewById(R.id.dataTextView);
        type1Spinner = findViewById(R.id.type1Spinner);
        type2Spinner = findViewById(R.id.type2Spinner);
        typeSwitch = findViewById(R.id.typeSwitch);
        Pokedex pokedex = new Pokedex(this);
        mydb = pokedex.getReadableDatabase();
        types = new ArrayList();
        Cursor typeCursor = mydb.rawQuery("Select name from type;",null);
        while(typeCursor.moveToNext()){
            String type = typeCursor.getString(0);
            if (type!=null)
                types.add(typeCursor.getString(0));
            else
                types.add("");
        }
        System.out.println(types);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,types.toArray());
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        type1Spinner.setAdapter(aa);
        type1Spinner.setOnItemSelectedListener(this);
        type2Spinner.setAdapter(aa);
        type2Spinner.setOnItemSelectedListener(this);
        searchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Cursor cursor = mydb.rawQuery(buildQuery(),null);
                String res = "Result:";
                while (cursor.moveToNext()){
                    res += "\n" + cursor.getString(0);
                    if (typeSwitch.isChecked()){
                        res+=": " + types.get(cursor.getInt(1));
                        if (cursor.getInt(2) != 0){
                            res+="/" + types.get(cursor.getInt(2));
                        };
                    }
                }
                dataTextView.setText(res);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtons();
    }

    public String buildQuery(){
        String result = "Select name";
        if (typeSwitch.isChecked()){
            result+=",type1,type2";
        }
        result += " from pokedex";
        boolean cond = false;
        int type1 = types.indexOf((String) type1Spinner.getSelectedItem());
        if (type1 > 0){
            result += " where (type1="+type1+" or type2="+type1+")";
            cond = true;
        }
        int type2 = types.indexOf((String) type2Spinner.getSelectedItem());
        if (type2 > 0){
            if (cond)
                result += " and (type1="+type2+" or type2="+type2+")";
            else {
                result += " where (type1=" + type2 + " or type2=" + type2 + ")";
                cond = true;
            }
        }
        System.out.println(result);
        return result+';';
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), types.get(i), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
