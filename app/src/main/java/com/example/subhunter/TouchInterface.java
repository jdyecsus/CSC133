package com.example.subhunter;

import android.util.Log;
import android.view.MotionEvent;

public class TouchInterface extends SubHunter{
    /*
        The code here will execute when
        the player taps the screen It will
        calculate distance from the sub'
        and determine a hit or miss
     */
    static void takeShot(float touchX, float touchY){
        Log.d("Debugging", "In takeShot");

        // Add one to the shotsTaken variable
        shotsTaken ++;

        // Convert the float screen coordinates
        // into int grid coordinates
        horizontalTouched = (int)touchX/ blockSize;
        verticalTouched = (int)touchY/ blockSize;

        // Did the shot hit the sub?
        hit = horizontalTouched == subHorizontalPosition
                && verticalTouched == subVerticalPosition;

        // How far away horizontally and vertically
        // was the shot from the sub
        int horizontalGap = (int)horizontalTouched -
                subHorizontalPosition;
        int verticalGap = (int)verticalTouched -
                subVerticalPosition;

        // Use Pythagoras's theorem to get the
        // distance travelled in a straight line
        distanceFromSub = (int)Math.sqrt(
                ((horizontalGap * horizontalGap) +
                        (verticalGap * verticalGap)));

        // If there is a hit call boom
        if(hit)
            EndGame.boom();
            // Otherwise call draw as usual
        else View.draw();
    }
}
