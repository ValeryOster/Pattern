package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestPredicatUndMore {

    private static <T> Function<T, T> compose(Function<T, T>... functions) {
        Function<T, T> result = Function.identity();

        for (Function<T, T> f : functions) {
            result = result.andThen(f);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = Stream.of("Now let's create a function which would split".split(" "))
                .collect(Collectors.toList());

        Function<String, String> exclaim = z -> z + ",,,";
        Function<String, String> toUpper = z -> z.toUpperCase();

        Function<String, String> compose = compose(toUpper, exclaim);
        String hallo = compose.apply("Hallo");

        System.out.println(hallo);


    }
}
