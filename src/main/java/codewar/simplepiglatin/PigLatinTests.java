package codewar.simplepiglatin;

import org.junit.Test;

public class PigLatinTests {

    @Test
    public void FixedTests() {
//        assertEquals("igPay atinlay siay oolcay ![]", PigLatinTests.bestPigIt("Pig latin is cool ![]"));
//        assertEquals("hisTay siay ymay tringsay", PigLatinTests.bestPigIt("This is my string"));
        PigLatinTests.bestPigIt("Pig latin is cool ![]");
    }

    private static String pigIt(String text) {
        String[] strings = text.split(" ");
        String result = "";
        for (int a = 0; a < strings.length; a++) {
            String word = strings[a];
            char c = word.charAt(0);
            if (Character.isLetter(c)) {
                String substring = word.substring(1) + c + "ay";
                if (a != 0) {
                    result = result + " " + substring;
                }else {
                    result = substring;
                }
            }else {
                result = result + " " + word;
            }
        }
        return result;
    }

    //Lösung
    public static String bestPigIt(String str) {
        System.out.println(str.replaceAll("(\\w)(\\w*)", "$2$1ay"));
        return null;
    }
}
