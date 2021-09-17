package aufgaben.glava8.A166PatterStrategie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPatter {
    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(1, 13, 15, 2, 67);

        Filters.filter(melons, (melon)->"erope".equalsIgnoreCase(melon.getOrigin()));
        List<Integer> filter = Filters.filter(numbers, (n) -> n < 10);

        filter.forEach(System.out::println);
    }
}
