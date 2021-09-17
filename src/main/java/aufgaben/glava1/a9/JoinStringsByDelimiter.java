package aufgaben.glava1.a9;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinStringsByDelimiter {
    public static String joinByDelimiter(char delimiter, String... ar) {
        return Arrays.stream(ar, 0, ar.length).collect(Collectors.joining(String.valueOf(delimiter)));
    }

}
