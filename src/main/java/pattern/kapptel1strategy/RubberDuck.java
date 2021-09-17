package pattern.kapptel1strategy;

import pattern.kapptel1strategy.behavior.FlyNoWay;
import pattern.kapptel1strategy.behavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.print("I am RubberDuck. ");
    }
}
