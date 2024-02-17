package com.example.subhunter;

public class DebugTexts extends TouchInterface implements IPrintText{

    //Testing push
    private static final int size=50;

    // This code prints the debugging text
    static void draw() {
        paint.setTextSize(blockSize);

        String[] variableNames={"numberHorizontalPixels","numberVerticalPixels","blockSize",
                "gridWidth","gridHeight","horizontalTouched","verticalTouched",
                "subHorizontalPosition","subVerticalPosition","shotsTaken"};

        float[] variableNumbers={numberHorizontalPixels,numberVerticalPixels,blockSize,
                gridWidth,gridHeight,horizontalTouched,verticalTouched,
                subHorizontalPosition,subVerticalPosition,shotsTaken};

        float[] blockMultiply={3,4,5,6,7,8,9,10,11,13};

        //printing out all of the float variables
        for(int i=0; i<variableNames.length;i++) {
            debugFormula(variableNames[i], variableNumbers[i], blockMultiply[i]);
        }

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
