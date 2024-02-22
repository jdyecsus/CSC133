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


    static void newGame(){
        TouchInterface.resetCount();
        Random random = new Random();
        subHorizontalPosition = random.nextInt(gridWidth);
        subVerticalPosition = random.nextInt(gridHeight);

        Log.d("Debugging", "In newGame");

    }
}