package codewar.rectanglerotation;

import java.util.Scanner;

public class Solution {
    public static void main(final String args[]) {
        int nextToZero = 5526;
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt(); // the number of temperatures to analyse
        for (int i = 0; i < n; i++) {
            final int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            System.out.println(t + ", " + nextToZero);
            if(!getNextToZero(nextToZero, t)){
                nextToZero = t;
            }
            System.out.println(t + ", " + nextToZero);
        }
        if(n == 0){
            nextToZero = 0;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(nextToZero);
    }

    private static boolean getNextToZero( int a, int b){

        if(a < 0){
            if(a + -1 == b){
                return false;
            }
            a = a * -1;
        }
        if(b < 0){
            b = b * -1;
        }
        return a <= b ;
    }
}
