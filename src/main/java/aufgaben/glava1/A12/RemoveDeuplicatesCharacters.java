package aufgaben.glava1.A12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDeuplicatesCharacters {
    public static void main(String[] args) {
        System.out.println(removeDuplicates3("hallo du hallo du Hallo , hahah"));
    }

    public static String removeDuplicates3(String str) {
        return Arrays.stream(str.toLowerCase().split("")).distinct().collect(Collectors.joining(" "));
    }
    public static String removeDuplicates2(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> characterSet = new HashSet<>();

        for (char ch : chArray) {
            if (characterSet.add(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String removeDuplicates(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch : chArray) {
            if (sb.indexOf(String.valueOf(ch)) != -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }


}
