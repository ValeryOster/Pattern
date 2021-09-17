package interview.khorstmann.anderes;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.function.IntConsumer;

public class Test1 {
    public static void main(String[] args) {
//        AA aa = new BB();
//        BB bb = new BB((BB) aa);
//
//        System.out.println(aa.AAstring());


        //enabled -ea option on the java command
//        int a = 3;
//        assert a < 2;
//        System.out.println("a ist grösser 2 ?" +
//                "" + (a > 2));

        repeat(10, i -> System.out.println("Countdown: " + (9-i)));

    }

    private static void repeat(int i, IntConsumer iam) {
        for (int j = 0; j < i; j++) {
            iam.accept(j);
        }
    }

    private static void HalloBeep(int text, int delay) {

        new Timer(delay, e -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        }
        ).start();
    }

    private static void timeTest() {
        Timer t = new Timer(1000, Test1::pr);
        t.start();
        Toolkit.getDefaultToolkit()
                .beep();
    }

    private static void pr(ActionEvent actionEvent) {
        System.out.println("halooooo");
    }

    public static void pr() {
        System.out.println("ichbinstatisch");
    }
}
