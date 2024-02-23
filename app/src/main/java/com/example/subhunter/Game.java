package com.example.subhunter;

import android.util.Log;

import java.util.Random;

public class Game extends  SubHunter{

    static Random random = new Random();
    static Submarine sub= new Submarine(random.nextInt(gridWidth),random.nextInt(gridHeight));

    static void newGame(){
        TouchInterface.resetCount();
        sub.setSubHorizontalPosition(random.nextInt(gridWidth));
        sub.setSubVerticalPosition(random.nextInt(gridHeight));

        Log.d("Debugging", "In newGame");
    }
}