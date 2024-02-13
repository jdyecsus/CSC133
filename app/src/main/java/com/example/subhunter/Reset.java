//package com.example.subhunter;
//
//import android.graphics.Bitmap;
//import android.graphics.Canvas;
//import android.graphics.Paint;
//import android.graphics.Point;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.Display;
//import android.widget.ImageView;
//
//import java.util.Random;
//
//public class Reset extends SubHunter{
//    /*
//        Android runs this code just before
//        the app is seen by the player.
//        This makes it a good place to add
//        the code that is needed for
//        the one-time setup.
//     */
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Get the current device's screen resolution
//        Display display = getWindowManager().getDefaultDisplay();
//        Point size = new Point();
//        display.getSize(size);
//
//
//        // Initialize our size based variables based on the screen resolution
//        numberHorizontalPixels = size.x;
//        numberVerticalPixels = size.y;
//        blockSize = numberHorizontalPixels / gridWidth;
//        gridHeight = numberVerticalPixels / blockSize;
//
//        // Initialize all the objects ready for drawing
//        blankBitmap = Bitmap.createBitmap(numberHorizontalPixels,
//                numberVerticalPixels,
//                Bitmap.Config.ARGB_8888);
//
//
//        canvas = new Canvas(blankBitmap);
//        gameView = new ImageView(this);
//        paint = new Paint();
//
//        // Tell Android to set our drawing
//        // as the view for this app
//        setContentView(gameView);
//
//        Log.d("Debugging", "In onCreate");
//        SubHunter.newGame();
//        SubHunter.draw();
//    }
//
//
//}
