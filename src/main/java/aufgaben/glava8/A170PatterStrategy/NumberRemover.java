package aufgaben.glava8.A170PatterStrategy;

public class NumberRemover implements RemoveStrategy {
    @Override
    public String execute(String s) {
        return s.replace("\\d", "");
    }
}
