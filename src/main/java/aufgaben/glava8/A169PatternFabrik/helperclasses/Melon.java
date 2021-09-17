package aufgaben.glava8.A169PatternFabrik.helperclasses;

import lombok.Data;

@Data
public class Melon implements Fruit {
    private final String type;
    private final int weight;
    private final String color;

    public Melon(String type, int weight, String color, String str) {
        this.type = type;
        this.weight = weight;
        this.color = color;
    }

}
