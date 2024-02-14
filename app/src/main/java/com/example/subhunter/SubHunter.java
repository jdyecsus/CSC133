// This is our package
// If you are copy & pasting the code then this line will probably be different to yours
// If so, keep YOUR line- not this one
package com.example.subhunter;

// These are all the classes of other people's
// (Android) code that we use in Sub Hunt
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.util.Log;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.Display;
import android.widget.ImageView;


public class SubHunter extends Activity {

    // These variables can be "seen"
    // throughout the SubHunter class
    static int numberHorizontalPixels;
    static int numberVerticalPixels;
    static int blockSize;
    static int gridWidth = 40;
    static int gridHeight;
    static float horizontalTouched = -100;
    static float verticalTouched = -100;
    static int subHorizontalPosition;
    static int subVerticalPosition;
    static boolean hit = false;
    static int shotsTaken;
    static int distanceFromSub;
    static boolean debugging = true;
    int size = 50;


    // Here are all the objects(instances)
    // of classes that we need to do some drawing
    static ImageView gameView;
    static Bitmap blankBitmap;
    static Canvas canvas;
    static Paint paint;



    /*
        Android runs this code just before
        the app is seen by the player.
        This makes it a good place to add
        the code that is needed for
        the one-time setup.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the current device's screen resolution
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);


        // Initialize our size based variables based on the screen resolution
        numberHorizontalPixels = size.x;
        numberVerticalPixels = size.y;
        blockSize = numberHorizontalPixels / gridWidth;
        gridHeight = numberVerticalPixels / blockSize;

        // Initialize all the objects ready for drawing
        blankBitmap = Bitmap.createBitmap(numberHorizontalPixels,
                numberVerticalPixels,
                Bitmap.Config.ARGB_8888);



        canvas = new Canvas(blankBitmap);
        gameView = new ImageView(this);
        paint = new Paint();

        // Tell Android to set our drawing
        // as the view for this app
        setContentView(gameView);

        Log.d("Debugging", "In onCreate");
        Game.newGame();
        View.draw();
    }





    /*
        This part of the code will
        handle detecting that the player
        has tapped the screen
     */
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.d("Debugging", "In onTouchEvent");
        // Has the player removed their finger from the screen?
        if((motionEvent.getAction() & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_UP) {

            // Process the player's shot by passing the
            // coordinates of the player's finger to takeShot
            TouchInterface.takeShot(motionEvent.getX(), motionEvent.getY());
        }

        return true;
    }
}
