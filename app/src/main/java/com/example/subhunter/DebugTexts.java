package com.example.subhunter;

public class DebugTexts extends TouchInterface{

    private static final int size=50;
    public static void printDebuggingText() {
        paint.setTextSize(blockSize);

        debugFormula("numberHorizontalPixels", numberHorizontalPixels,3);
        debugFormula("numberVerticalPixels", numberVerticalPixels, 4);

        debugFormula("blockSize", blockSize, 5);

        debugFormula("gridWidth", gridWidth,6);
        debugFormula("gridHeight", gridHeight, 7);

        debugFormula("horizontalTouched", horizontalTouched, 8);
        debugFormula("verticalTouched", verticalTouched,  9);

        debugFormula("subHorizontalPosition", sub.getSubHorizontalPosition(),  10);
        debugFormula("subVerticalPosition",  sub.getSubVerticalPosition(),  11);

        debugFormula("shotsTaken", TouchInterface.getShotsTaken(), 13);

        debugBoolean("hit", hit, 12);
        debugBoolean("debugging", debugging,  14);
    }

    public static void debugFormula(String variableName, float variableValue, float blockMultiply){
        canvas.drawText(variableName +" = " + variableValue, size, blockSize * blockMultiply, paint);
    }

    public static void debugBoolean(String variableName, boolean booleanValue, float blockMultiply){
        canvas.drawText(variableName +" = " + booleanValue, size, blockSize * blockMultiply, paint);
    }
}