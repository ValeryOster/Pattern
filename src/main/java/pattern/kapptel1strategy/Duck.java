package pattern.kapptel1strategy;

import pattern.kapptel1strategy.behavior.FlyBehavior;
import pattern.kapptel1strategy.behavior.QuackBehavior;

abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void swimm() {
        System.out.println("I swim ");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void  display();

}
