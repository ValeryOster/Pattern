package interview.khorstmann.innerclass;

import java.util.ArrayList;

public class TestArryListAdd {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<String>() {{
            add("Harry");
            add("Tony");
        }};

        System.out.println(new Object(){}.getClass().getEnclosingClass());

        //so ist falsch in static -> System.out.println(getClass());

    }
    public void classPrint(){
        //hier ist möchglich
        System.out.println(getClass());

    }

}
