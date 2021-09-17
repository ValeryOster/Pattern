package pattern.kapptel1strategy.behavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I quack");
    }
}
