package aufgaben.glava8.A169PatternFabrik;

import aufgaben.glava8.A169PatternFabrik.helperclasses.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class MainClass {
    public static final Map<String, Supplier<Fruit>> MELONES = new HashMap<String, Supplier<Fruit>>() {
        {
            put("Gac", Gac::new);
            put("Hemi", Hemi::new);
            put("Cantaloupe", Cantaloupe::new);
        }};

    public static void main(String[] args) {

        Gac gac = (Gac) MeloneFactory.newInstance(Gac.class);
        Supplier<Gac> gacSupplier = Gac::new;

        Hemi hemi = (Hemi) MeloneFactory.newInstance2(Hemi.class);


    }
}
