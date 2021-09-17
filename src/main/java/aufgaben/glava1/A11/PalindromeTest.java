package aufgaben.glava1.A11;

import java.util.stream.IntStream;

public class PalindromeTest {
    public static void main(String[] args) {
        isPalindrome("word");
    }

    private static Boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (right > left) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right++;
        }
        return true;
    }

    private static Boolean isPalindrome2(String word) {
        int n = word.length();

        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    private static Boolean isPalindrome3(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    private static Boolean isPalindrome4(String word) {
        return IntStream.range(0, word.length() / 2)
                .noneMatch(value -> word.charAt(value) != word.charAt(word.length() - value - 1));
    }

}
