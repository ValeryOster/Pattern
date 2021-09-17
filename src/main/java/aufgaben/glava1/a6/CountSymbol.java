package aufgaben.glava1.a6;

public class CountSymbol {

    public static int countOccurrencesOfACertainCharacter(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    public static int countOccurrencesOfACertainCharacterUnicode(String str, String ch) {
        if (ch.codePointCount(0, ch.length()) > 1) {
            return -1;
        }
        int result = str.length() - str.replace(ch, "").length();
        return ch.length() == 2 ? result / 2 : result;
    }

    public static long countOccurrencesOfACertainCharacterJava8(String str, char ch) {
        return str.chars().filter(c -> c == ch).count();
    }
}
