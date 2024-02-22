package com.example.subhunter;

import android.util.Log;

public class TouchInterface extends Game{

    private int shotsTaken, distanceFromSub;
    private boolean hit;


    public int getShotsTaken() {

        return shotsTaken;
    }

    public void setShotsTaken(int shotsTaken) {
        this.shotsTaken = shotsTaken;
    }

    public int getDistanceFromSub() {

        return distanceFromSub;
    }

    public void setDistanceFromSub(int distanceFromSub) {

        this.distanceFromSub = distanceFromSub;
    }

    public boolean isHit() {

        return hit;
    }

    public void setHit(boolean hit) {

        this.hit = hit;
    }

     public void resetCount() {
        setShotsTaken(0);
    }


    /*
    The code here will execute when
    the player taps the screen It will
    calculate distance from the sub'
    and determine a hit or miss
 */
     void takeShot(float touchX, float touchY){
        Log.d("Debugging", "In takeShot");

        // Add one to the shotsTaken variable
        shotsTaken++;


        // Convert the float screen coordinates
        // into int grid coordinates
         shotCount shot=new shotCount();
         shot.setHorizontalTouched((int)(touchX/ blockSize));
        shot.setverticalTouched( (int)(touchY/ blockSize));

         // Did the shot hit the sub?
        setHit(horizontalTouched == sub.getSubHorizontalPosition()
                && verticalTouched == sub.getSubVerticalPosition());

        // How far away horizontally and vertically
        // was the shot from the sub
        int horizontalGap = horizontalTouched -
                sub.getSubHorizontalPosition();
        int verticalGap = verticalTouched -
                sub.getSubVerticalPosition();

        // Use Pythagoras's theorem to get the
        // distance travelled in a straight line
        distanceFromSub = (int)Math.sqrt(
                Math.pow(horizontalGap,2)+
                        (Math.pow(verticalGap,2)));

//        while(!hit){ View.draw(); }
//        EndGame.boom();

        // If there is a hit call boom
        if(isHit()==true)
            EndGame.boom();
            // Otherwise call draw as usual
        else View.draw();
    }
}