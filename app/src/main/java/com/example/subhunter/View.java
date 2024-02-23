package com.example.subhunter;

//import static com.example.subhunter.TouchInterface.shotsTaken;

import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

public class View extends Game{
    /*
        Here we will do all the drawing.
        The grid lines, the HUD and
        the touch indicator
     */
    static boolean debugging = true;
    static Paint paint=new Paint();
    static int distanceFromSub;
    static float horizontalTouched, verticalTouched = -100;



// draws the background grid, player shot, and score on top of screen
    static void draw() {
        gameView.setImageBitmap(blankBitmap);
        //background
        canvas.drawColor(Color.argb(255, 255, 255, 255));

        paint.setColor(Color.argb(255, 0, 0, 0));


        //grid
        for(int i = 0; i < gridWidth; i++){
            canvas.drawLine(blockSize * i, 0,
                    blockSize * i, numberVerticalPixels,
                    paint);
        }

        for(int i = 0; i < gridHeight; i++){
            canvas.drawLine(0, blockSize * i,
                    numberHorizontalPixels, blockSize * i,
                    paint);
        }


        canvas.drawRect(horizontalTouched * blockSize,
                verticalTouched * blockSize,
                (horizontalTouched * blockSize) + blockSize,
                (verticalTouched * blockSize)+ blockSize,
                paint );


        //score
        paint.setTextSize(blockSize * 2);
        paint.setColor(Color.argb(255, 0, 0, 255));
        canvas.drawText(
                "Shots Taken: " + TouchInterface.getShotsTaken() +
                        "  Distance: " + distanceFromSub,
                blockSize, blockSize * 1.75f,
                paint);


        Log.d("Debugging", "In draw");
        if (debugging) {
            DebugTexts.printDebuggingText();
        }
    }



}