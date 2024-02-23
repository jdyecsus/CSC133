package com.example.subhunter;

import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

public class View extends SubHunter{
    /*
        Here we will do all the drawing.
        The grid lines, the HUD and
        the touch indicator
     */
     boolean debugging = true;
     Paint paint=new Paint();
     shotCount shot=new shotCount();

    TouchInterface touchInterface;

    DebugTexts debugTexts;

    SubHunter subHunter;

    int blockSize=subHunter.getBlockSize();

     void draw() {
        gameView.setImageBitmap(blankBitmap);

        // Wipe the screen with a white color
        canvas.drawColor(Color.argb(255, 255, 255, 255));

        // Change the paint color to black
        paint.setColor(Color.argb(255, 0, 0, 0));

        // Draw the vertical lines of the grid
        for(int i = 0; i < gridWidth; i++){
            canvas.drawLine(blockSize * i, 0,
                    blockSize * i, numberVerticalPixels,
                    paint);
        }

        // Draw the horizontal lines of the grid
        for(int i = 0; i < gridHeight; i++){
            canvas.drawLine(0, blockSize * i,
                    numberHorizontalPixels, blockSize * i,
                    paint);
        }

        // Draw the player's shot
        canvas.drawRect(shot.getHorizontalTouched() * blockSize,
                shot.getVerticalTouched() * blockSize,
                (shot.getHorizontalTouched() * blockSize) + blockSize,
                (shot.getVerticalTouched() * blockSize)+ blockSize,
                paint );


        // Re-size the text appropriate for the
        // score and distance text
        paint.setTextSize(blockSize * 2);
        paint.setColor(Color.argb(255, 0, 0, 255));
        canvas.drawText(
                "Shots Taken: " + touchInterface.getShotsTaken() +
                        "  Distance: " + touchInterface.getDistanceFromSub(),
                blockSize, blockSize * 1.75f,
                paint);


        Log.d("Debugging", "In draw");
        if (debugging) {
            debugTexts.printDebuggingText();
        }
    }



}