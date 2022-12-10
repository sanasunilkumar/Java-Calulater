import javax.swing.*;

public class Calculater {
    private JPanel Calculater;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculater");
        frame.setContentPane(new Calculater().Calculater);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
