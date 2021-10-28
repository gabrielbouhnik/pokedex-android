package com.example.pokedex;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Pokedex extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "POKEDEX_ANDROID";
    private static final String POKEDEX_TABLE = "POKEDEX";
    private static final String TYPE_TABLE = "TYPE";

    public Pokedex(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void insertType(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL("INSERT INTO type VALUES(NULL,0);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Grass',1);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Fire',2);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Water',3);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Electric',4);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Normal',5);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Flying',6);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Bug',7);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Poison',8);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Rock',9);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Ground',10);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Fighting',11);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Psychic',12);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Ghost',13);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Ice',14);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Dragon',15);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Steel',16);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Dark',17);");
        sqLiteDatabase.execSQL("INSERT INTO type VALUES('Fairy',18);");
    }

    public void insertPokemon(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Bulbasaur',1,1,8,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Ivysaur',2,1,8,1);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Venusaur',3,1,8,2);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Charmander',4,2,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Charmeleon',5,2,0,4);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Charizard',6,2,6,5);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Squirtle',7,3,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Wartortle',8,3,0,7);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Blastoise',9,3,0,8);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Pikachu',25,4,0,172);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Raichu',26,4,0,25);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Sandshrew',27,10,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Sandslash',28,10,0,27);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Meowth',52,5,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Persian',53,5,0,52);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Mankey',56,11,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Primeape',57,11,0,56);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Drowzee',96,12,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Hypno',97,12,0,96);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Koffing',109,8,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Weezing',110,8,0,109);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Staryu',120,3,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Starmie',121,3,12,120);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Mr.Mime',122,12,18,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Jynx',124,14,12,238);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Pinsir',127,7,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Tauros',128,5,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Lapras',131,3,14,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Dratini',147,15,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Dragonair',148,15,0,147);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Dragonite',149,15,6,148);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Chikorita',152,1,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Bayleaf',153,1,0,152);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Meganium',154,1,0,153);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Cyndaquil',155,2,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Quilava',156,2,0,155);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Typhlosion',157,2,0,156);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Totodile',158,3,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Croconaw',159,3,0,158);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Feligatr',160,3,0,159);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Pichu',172,4,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Togepi',175,18,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Togetic',176,18,6,175);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Marill',183,3,18,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Azumarill',184,3,18,183);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Sudowoodo',185,9,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Sunkern',191,1,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Sunflora',192,1,0,191);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Murkrow',198,17,6,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Misdreavus',200,13,NULL,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Shuckle',213,9,7,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Heracross',214,11,7,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Sneasel',215,17,14,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Slugma',218,2,0,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Magcargot',219,2,9,218);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Corsola',222,3,9,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Delibird',225,14,6,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Skarmory',227,16,6,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Smoochum',238,14,12,NULL);");
        sqLiteDatabase.execSQL("INSERT INTO pokedex VALUES('Miltank',241,5,0,NULL);");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE type ( Name varchar(255), ID int ) ;");
        sqLiteDatabase.execSQL("CREATE TABLE pokedex ( Name varchar(255), ID int, Type1 int, Type2 int, PrevEvolution int ) ;");
        insertPokemon(sqLiteDatabase);
        insertType(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS type");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS pokedex");
        onCreate(sqLiteDatabase);
    }
}
