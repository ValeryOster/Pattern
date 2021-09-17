package pattern.kapitel2observer.java;

import pattern.kapitel2observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public void display() {
        System.out.println("I am CCD. I got: "+temperature
                + "F degrees and "+humidity + "%humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
