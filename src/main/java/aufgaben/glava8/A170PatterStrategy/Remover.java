package aufgaben.glava8.A170PatterStrategy;

public final class Remover {
    private Remover() {
        throw new AssertionError("cann't crate new object");
    }

    public static String remove(String s, RemoveStrategy strategy) {
        return strategy.execute(s);
    }
}
