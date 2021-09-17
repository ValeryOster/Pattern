package jetbrainsacademi;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        String replace = scanner.nextLine()
                .replace("a", "b");

        System.out.println(replace);

    }
}
