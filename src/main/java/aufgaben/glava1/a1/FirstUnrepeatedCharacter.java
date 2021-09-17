package aufgaben.glava1.a1;

public class FirstUnrepeatedCharacter {
    private static final int EXTENDED_ASCII_CODES = 256;

    public Character firstNonRepeatedCharacter(String str) {
        int[] flags = new int[EXTENDED_ASCII_CODES];

        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

        }
        return null;
    }

    public static void main(String[] args) {

    }
}
