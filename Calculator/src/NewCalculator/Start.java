package NewCalculator;

import javax.swing.JFrame;

public class Start {

    public static void main(String args[]) {
        MyCalculator calculator1 = new MyCalculator();
        calculator1.setVisible(true);
        calculator1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
