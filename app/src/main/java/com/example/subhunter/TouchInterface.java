package com.example.subhunter;

import android.util.Log;

public class TouchInterface extends View{

    static int shotsTaken=0;
    /*
        The code here will execute when
        the player taps the screen It will
        calculate distance from the sub'
        and determine a hit or miss
     */
    static boolean hit = false;

    public static void resetCount() { shotsTaken=0; }

    static void takeShot(float touchX, float touchY){
        Log.d("Debugging", "In takeShot");

        // Add one to the shotsTaken variable
        shotsTaken ++;

        // Convert the float screen coordinates
        // into int grid coordinates
        horizontalTouched = (int)(touchX/ blockSize);
        verticalTouched = (int)(touchY/ blockSize);

        // Did the shot hit the sub?
        hit = horizontalTouched == sub.getSubHorizontalPosition()
                && verticalTouched == sub.getSubVerticalPosition();

        // How far away horizontally and vertically
        // was the shot from the sub
        int horizontalGap = (int)horizontalTouched -
                sub.getSubHorizontalPosition();
        int verticalGap = (int)verticalTouched -
                sub.getSubVerticalPosition();

        // Use Pythagoras's theorem to get the
        // distance travelled in a straight line
        distanceFromSub = (int)Math.sqrt(
                Math.pow(horizontalGap,2)+
                        (Math.pow(verticalGap,2)));

//        while(!hit){ View.draw(); }
//        EndGame.boom();

        // If there is a hit call boom
        if(hit)
            EndGame.boom();
            // Otherwise call draw as usual
        else View.draw();
    }
}