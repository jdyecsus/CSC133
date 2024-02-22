package com.example.subhunter;

public class Submarine {
    private int subHorizontalPosition;
    private int subVerticalPosition;

    Submarine(int subHorizontalPosition, int subVerticalPosition){
        this.subHorizontalPosition=subHorizontalPosition;
        this.subVerticalPosition=subVerticalPosition;
    }

    public void setSubHorizontalPosition(int subHorizontalPosition) {
        this.subHorizontalPosition = subHorizontalPosition;
    }

    public void setSubVerticalPosition(int subVerticalPosition) {
        this.subVerticalPosition = subVerticalPosition;
    }

    public int getSubHorizontalPosition() {
        return subHorizontalPosition;
    }

    public int getSubVerticalPosition() {
        return subVerticalPosition;
    }
}
