package aufgaben.glava1.a1;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordInverter {
    private static final String WHITESPACE = " ";

    public String reverseWords(String str) {
        String[] words = str.split(WHITESPACE);
        StringBuilder reverseString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length(); i < 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            reverseString.append(reverseWord).append(WHITESPACE);
        }
        return reverseString.toString();
    }

    private static final Pattern PATTERN = Pattern.compile(" +");
    public static String reverseWordsJava8(String words) {
        return PATTERN.splitAsStream(words)
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String reverseWordsVarian3(String words) {
        return  new StringBuilder(words).reverse().toString();
    }
}
