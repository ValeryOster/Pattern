package aufgaben.glava8.A166PatterStrategie;

import java.util.ArrayList;
import java.util.List;

public class Filters {
    public static <T> List<T> filter(List<T> list, Predicate<T> melonPredicate) {
        List<T> result = new ArrayList<>();

        for (T t : list) {
            if (t != null && melonPredicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static List<Melon> filterByType(List<Melon> melons, String type) {

        List<Melon> result = new ArrayList<>();

        for (Melon melon : melons) {
            if (melon != null && type.equalsIgnoreCase(melon.getType())) {
                result.add(melon);
            }
        }
        return result;
    }

    public static List<Melon> filterByWeight(List<Melon> melons, int weight) {
        List<Melon> result = new ArrayList<>();

        for (Melon melon : melons) {
            if (melon != null && melon.getWeight() == weight) {
                result.add(melon);
            }
        }

        return result;
    }
}
