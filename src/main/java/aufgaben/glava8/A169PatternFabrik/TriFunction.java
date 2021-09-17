package aufgaben.glava8.A169PatternFabrik;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
