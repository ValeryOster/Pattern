package aufgaben.glava1.a5;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountVowelsAndConsonants {
    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static void main(String[] args) {
        Pair<Integer, Integer> aaccii = count2("aaccii");
        System.out.println(aaccii.getKey() + " , " + aaccii.getValue());
    }

    public static Pair<Integer, Integer> count(String str) {
        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (allVowels.contains(ch)) {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        return new Pair(vowels, consonants);
    }

    public static Pair<Integer, Integer> count2(String str) {
        Map<Boolean, Long> result = str.chars().mapToObj(value -> (char) value).filter(ch -> (ch >= 'a' && ch <= 'z'))
                .collect(Collectors.partitioningBy(allVowels::contains, Collectors.counting()));

        return new Pair(result.get(true), result.get(false));
    }
}
