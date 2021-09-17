package codewar.BitCod;

import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char[] chars = in.nextLine().toCharArray();
        String x = "", finalCoded = "";
        for (char aChar : chars) {
            x += Integer.toBinaryString(aChar);

        }

        Character prefix = '0';
        for (Character aChar : x.toCharArray()) {
            if (aChar.equals('1')) {
                if (!prefix.equals('1')) {
                    finalCoded += " 0 0";
                    prefix = '1';
                }else {
                    finalCoded += "0";
                }
            }
            if (aChar.equals('0')) {
                if (!prefix.equals('0')) {
                    finalCoded += " 00 0";
                    prefix = '0';
                }else {
                    finalCoded += "0";
                }
            }
        }

        System.out.println(finalCoded.trim());
    }
}

