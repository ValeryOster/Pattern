package aufgaben.glava8.A169PatternFabrik;

import aufgaben.glava8.A169PatternFabrik.helperclasses.*;

import java.util.function.Supplier;

public class MeloneFactory {
    static final TriFunction<String,Integer,String, Melon> melon = Melon::new;
    public static Fruit newInstance(Class<?> clazz) {
        switch (clazz.getSimpleName()) {
            case "Gac":
                return new Gac();
            case "Hemi":
                return new Hemi();
            case "Cantaloupe":
                return new Cantaloupe();
            default:
                throw new IllegalArgumentException("Non legal argument clazz: " + clazz);
        }
    }

    public static Fruit newInstance2(Class<?> clazz) {
        Supplier<Fruit> supplier = MainClass.MELONES.get(clazz.getSimpleName());

        if (supplier == null) {
            throw new IllegalArgumentException("Non legal argument clazz: " + clazz);
        }
        return supplier.get();
    }

    public static Fruit newInstaceMelone(String name, Integer weight, String color) {
        return melon.apply(name,weight,color);
    }
}
