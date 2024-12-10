import java.awt.*;
import javax.swing.*;

public class Increment {
    public static int result = 0;

    public Increment() {
        JFrame frame = new JFrame("Increment and Decrement");
        JPanel panelNorth = new JPanel();
        JPanel panelSouth = new JPanel(new GridLayout(1,3));
        
        frame.setLayout(new BorderLayout());
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JLabel answer = new JLabel();
        answer.setText("" + result);

        panelNorth.add(answer);
        frame.add(panelNorth, BorderLayout.NORTH);

        JButton inc = new JButton("Increment");
        JButton dec = new JButton("Decrement");
        JButton reset = new JButton("Reset");

        panelSouth.add(inc);
        panelSouth.add(dec);
        panelSouth.add(reset);
        frame.add(panelSouth, BorderLayout.SOUTH);

        inc.addActionListener(e -> {
            result++;
            answer.setText(result + "");
        });

        dec.addActionListener(e -> {
            result--;
            answer.setText(result + "");
        });

        reset.addActionListener(e -> {
            result = 0;
            answer.setText(result + "");
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Increment();
    }
}
