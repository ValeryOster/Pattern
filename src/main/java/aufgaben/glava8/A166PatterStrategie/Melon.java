package aufgaben.glava8.A166PatterStrategie;

import lombok.Data;

@Data
public class Melon {
    private final String type;
    private final int weight;
    private final String origin;

    public Melon(String type, int weight, String origin) {
        this.type = type;
        this.weight = weight;
        this.origin = origin;
    }
}
