package aufgaben.glava1.a4;

public class AufgabeMain {

    //Следует избегать решение этой задачи посредством методов parseInt() или parseLong().
    //Best speed
    public static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyDigitsJava8(String str) {
        return !str.chars().anyMatch(value -> !Character.isDigit(value));
    }

    public static boolean containsOnlyDigitsRegex(String str) {
        return str.matches("[0-9]+");
    }
}
