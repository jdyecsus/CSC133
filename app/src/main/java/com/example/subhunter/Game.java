package com.example.subhunter;

import android.util.Log;

import java.util.Random;

public class Game extends  SubHunter{
    /*
        This code will execute when a new
        game needs to be started. It will
        happen when the app is first started
        and after the player wins a game.
     */
    SubHunter subHunter= new SubHunter();
    TouchInterface touchInterface= new TouchInterface();
    Random random = new Random();

    int gridWidth= subHunter.getGridWidth();
    int gridHeight= subHunter.getGridHeight();

    Submarine sub= new Submarine(random.nextInt(gridWidth), random.nextInt(gridHeight));

     void newGame(){

         touchInterface.resetCount();
        sub.setSubHorizontalPosition(
                random.nextInt(
                        subHunter.getGridWidth()));

        sub.setSubVerticalPosition(
                random.nextInt(
                        subHunter.getGridHeight()));

        Log.d("Debugging", "In newGame");
    }
}