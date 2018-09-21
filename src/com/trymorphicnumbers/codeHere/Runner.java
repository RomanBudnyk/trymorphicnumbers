package com.trymorphicnumbers.codeHere;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    public void run() {
        System.out.print("Please enter your number here: ");
        int input = 0;
        boolean check = false;
        while (!check) {
            Scanner scanner = new Scanner(System.in);
            try {
                input = scanner.nextInt();
                check = true;
            } catch (InputMismatchException e) {
                System.out.print("Error! Please enter a valid number here: ");
            }
        }
        long inputCubbed = toCube(input);
        System.out.println(checkForTrimorphic(input, inputCubbed) + " (" + input + "^3" + " = " + inputCubbed + ")");
    }

    private long toCube(int number) {
        return (long) Math.pow(number, 3);
    }

    private boolean checkForTrimorphic(int myNum, long cubbed) {
        String myNumS = String.valueOf(myNum);
        String cubbedS = String.valueOf(cubbed);
        return cubbedS.substring(cubbedS.length() - myNumS.length()).equals(myNumS);

    }
}
