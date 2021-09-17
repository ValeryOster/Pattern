package anderes;

import javax.swing.*;

public class HelloJava {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hallo");
        JLabel label = new JLabel("Hello Java", 0);
        jFrame.add(label);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }
}
