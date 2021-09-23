package aufgaben.glava8.A170PatterStrategy;

public class WhitespacesRemover implements RemoveStrategy {
    @Override
    public String execute(String s) {
        return s.replaceAll("\\s", "");
    }
}
