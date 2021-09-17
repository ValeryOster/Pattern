package interview.khorstmann.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class TestLambdaComparator {
    public static void main(String[] args) {

        String[] planets = new String[] { "Mercury", "Venus","Earth",
                "Mars","Jupiter",
                "Saturn",
                "Uranus",
                "Neptune" };

        test1(planets);
        //Arrays.sort(people , Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
    }

    private static void test1(String[] planets) {
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(planets));


//        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
//        t.start();
//        // выполнять программу до тех пор, пока пользователь
//        // не выберет кнопку "Ok"
//        JOptionPane.showMessageDialog(null, "Quit program?");
//
//        System.exit(0);
    }

}
