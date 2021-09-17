package pattern.kapptel1strategy;

import pattern.kapptel1strategy.behavior.FlyWithWings;
import pattern.kapptel1strategy.behavior.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.print("I am RedheadDuck.");
    }
}
