
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BorderButton{
    private int northCtr = 0;
    private int eastCtr = 0;
    private static int westCtr = 0;

    public BorderButton(){
        JFrame frame = new JFrame("BorderButton");
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton northBtn = new JButton("North");
        JButton eastBtn = new JButton("East");
        JButton westBtn = new JButton("West");
        JButton resetBtn = new JButton("Reset");
        JLabel centerLabel = new JLabel("Press any button", SwingConstants.CENTER);

        frame.add(northBtn, BorderLayout.NORTH);
        frame.add(eastBtn, BorderLayout.EAST);
        frame.add(westBtn, BorderLayout.WEST);
        frame.add(resetBtn, BorderLayout.SOUTH);
        frame.add(centerLabel, BorderLayout.CENTER);
        frame.setVisible(true);

        northBtn.addActionListener(e  -> {
            northCtr++;
            eastCtr = 0;
            westCtr = 0;
            centerLabel.setText("North button was pressed: " + northCtr);
        });
        eastBtn.addActionListener(e  -> {
            northCtr = 0;
            eastCtr++;
            westCtr = 0;
            centerLabel.setText("East button was pressed: " + eastCtr);
        });
        westBtn.addActionListener(e  -> {
            northCtr = 0;
            eastCtr = 0;
            westCtr++;
            centerLabel.setText("West button was pressed: " + westCtr);
        });
        resetBtn.addActionListener(e  -> {
            northCtr = 0;
            eastCtr = 0;
            westCtr = 0;
            centerLabel.setText("Press any button");
        });

    }

    public static void main(String[] args) {
        new BorderButton();
    }
}