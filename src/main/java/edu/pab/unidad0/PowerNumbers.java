package edu.pab.unidad0;

import java.util.Random;

public class PowerNumbers {

    private void fillRandom(int array[][]) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i][0] = random.nextInt(10);
        }
    }

    private void fillPowerNumbers(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            int n = array[i][0];
            int p = n;
            for (int j = 1; j < array[i].length; j++) {
                n = n * p;
                array[i][j] = n;
            }
        }
    }

    private void displayArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[i].length - 1) {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {        
        PowerNumbers powerNumbers = new PowerNumbers();

        int[][] powerArray = new int[5][6];
        powerNumbers.fillRandom(powerArray);
        powerNumbers.fillPowerNumbers(powerArray);
        powerNumbers.displayArray(powerArray);
    }
}