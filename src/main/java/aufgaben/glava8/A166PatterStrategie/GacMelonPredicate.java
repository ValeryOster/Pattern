package aufgaben.glava8.A166PatterStrategie;

public class GacMelonPredicate implements MelonPredicate {
    @Override
    public boolean test(Melon melon) {
        return "gac".equalsIgnoreCase(melon.getType());
    }
}
