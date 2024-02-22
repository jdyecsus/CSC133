package com.example.subhunter;

public class Submarine {
    private int subHorizontalPosition;
    private int subVerticalPosition;
//Constructor
    Submarine(int subHorizontalPosition, int subVerticalPosition){
        this.subHorizontalPosition=subHorizontalPosition;
        this.subVerticalPosition=subVerticalPosition;
    }
//Setters
    public void setSubHorizontalPosition(int subHorizontalPosition) {
        this.subHorizontalPosition = subHorizontalPosition;
    }

    public void setSubVerticalPosition(int subVerticalPosition) {
        this.subVerticalPosition = subVerticalPosition;
    }
//Getters
    public int getSubHorizontalPosition() {
        return subHorizontalPosition;
    }

    public int getSubVerticalPosition() {
        return subVerticalPosition;
    }
}
