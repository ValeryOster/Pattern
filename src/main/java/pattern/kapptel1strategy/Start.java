package pattern.kapptel1strategy;

import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(new MallardDuck(), new RedheadDuck(), new RubberDuck());

        ducks.forEach(duck -> {
            duck.display();
            duck.performQuack();
        });
    }
}
