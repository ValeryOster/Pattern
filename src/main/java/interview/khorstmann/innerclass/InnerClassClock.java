package interview.khorstmann.innerclass;

import javax.swing.*;

public class InnerClassClock {

    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(60000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit programm ?");
        System.exit(0);
    }
}
