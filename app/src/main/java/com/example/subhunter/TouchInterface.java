package com.example.subhunter;

import android.util.Log;

public class TouchInterface extends View{

    static int shotsTaken=0;
    static boolean hit = false;

    public static void resetCount() { shotsTaken=0; }

    public static int getShotsTaken() { return shotsTaken;}

    /*
      The code here will execute when
      the player taps the screen It will
      calculate distance from the sub'
      and determine a hit or miss
   */
    static void takeShot(float touchX, float touchY){
        Log.d("Debugging", "In takeShot");

        shotsTaken ++;

        // Convert the float screen coordinates
        // into int grid coordinates
        horizontalTouched = (int)(touchX/ blockSize);
        verticalTouched = (int)(touchY/ blockSize);

        hit = horizontalTouched == sub.getSubHorizontalPosition()
                && verticalTouched == sub.getSubVerticalPosition();

        int horizontalGap = (int)horizontalTouched -
                sub.getSubHorizontalPosition();
        int verticalGap = (int)verticalTouched -
                sub.getSubVerticalPosition();

        // Use Pythagoras's theorem to get the
        // distance travelled in a straight line
        distanceFromSub = (int)Math.sqrt(
                Math.pow(horizontalGap,2)+
                        (Math.pow(verticalGap,2)));


        if(hit)
            EndGame.boom();
        else View.draw();
    }
}