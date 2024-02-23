package com.example.subhunter;

public class DebugTexts extends EndGame{

    private final int size=50;
    Submarine submarine;
    SubHunter subHunter;
    shotCount shot;
    TouchInterface touchInterface;

    int blockSize= subHunter.getBlockSize();


    // This code prints the debugging text
    public void printDebuggingText() {
        paint.setTextSize(blockSize);

        debugFormula("numberHorizontalPixels", subHunter.getNumberHorizontalPixels(),3);
        debugFormula("numberVerticalPixels", subHunter.getNumberVerticalPixels(), 4);

        debugFormula("blockSize", blockSize, 5);

        debugFormula("gridWidth", subHunter.getGridWidth(),6);
        debugFormula("gridHeight", subHunter.getGridHeight(), 7);

        debugFormula("horizontalTouched", shot.getHorizontalTouched(), 8);
        debugFormula("verticalTouched", shot.getVerticalTouched(),  9);

        debugFormula("subHorizontalPosition", submarine.getSubHorizontalPosition(),  10);
        debugFormula("subVerticalPosition",  submarine.getSubVerticalPosition(),  11);

        debugFormula("shotsTaken", touchInterface.getShotsTaken(), 13);

        debugBoolean("hit", touchInterface.isHit(), 12);
        debugBoolean("debugging", View.debugging,  14);
    }

    public void debugFormula(String variableName, float variableValue, float blockMultiply){
        canvas.drawText(variableName +" = " + variableValue, size, blockSize * blockMultiply, paint);
    }

    public void debugBoolean(String variableName, boolean booleanValue, float blockMultiply){
        canvas.drawText(variableName +" = " + booleanValue, size, blockSize * blockMultiply, paint);
    }
}