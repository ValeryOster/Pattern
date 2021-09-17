package aufgaben.glava1.a1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Aufgabe {
    public static void main(String[] args) {
//        Map<String, Long> chchch = new Aufgabe().countDuplicateCharacters("chchchbab");
//        for (Map.Entry<String, Long> entry : chchch.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        allCharacters();

    }

    private static void allCharacters() {
        for (int i = 0; i < 11141; i++) {
            String str = String.valueOf(Character.toChars(i));
            System.out.print(str + ",  ");
        }
    }

    private static void generateNumberInString() {
        String a = "a";
        IntStream stream = IntStream.range(0, 65556);
        String collect = stream.mapToObj(Integer::toString)
                .collect(Collectors.joining(" "));

        for (int i = 65_525; i < 65_555; i++) {
            System.out.print(collect.charAt(i));
        }
    }

    public Map<String, Long> countDuplicateCharacters(String str) {
//        Map<Character, Integer> result = new HashMap<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            result.compute(ch, (character, integer) -> (integer == null) ? 1 : ++integer);
//        }

//        Stream<Character> characterStream = str.chars()
//                .mapToObj(value -> (char) value);
//        Map<Character, Long> result = characterStream
//                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));

        //all possible characters
        Map<String, Long> result = str.codePoints()
                .mapToObj (c -> String.valueOf(Character.toChars (c))) .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
}
