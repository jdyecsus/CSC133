package com.example.subhunter;

import android.graphics.Color;

public class EndGame extends View{

    // Wipe the screen with a red color and prompt new game
    static void boom(){

        gameView.setImageBitmap(blankBitmap);

        canvas.drawColor(Color.argb(255, 255, 0, 0));

        paint.setColor(Color.argb(255, 255, 255, 255));
        paint.setTextSize(blockSize * 10);

        canvas.drawText("BOOM!", blockSize * 4,
                blockSize * 14, paint);

        paint.setTextSize(blockSize * 2);
        canvas.drawText("Take a shot to start again",
                blockSize * 8,
                blockSize * 18, paint);

        Game.newGame();
    }
}