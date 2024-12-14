
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Milfrance {
    public Milfrance(){
        JFrame frame = new JFrame("Milfrannnnceeee");
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel centerPanel = new JPanel(new GridLayout(3,2,20,20));
        centerPanel.setBorder(new EmptyBorder(15,15,15,15));
        JLabel firstName = new JLabel("First name: ");
        JLabel lastName = new JLabel("Last name: ");
        JTextField firstField = new JTextField();
        JTextField lastField = new JTextField();
        JButton subBtn = new JButton("Submit");
        JButton clrBtn = new JButton("Clear");

        centerPanel.add(firstName);
        centerPanel.add(firstField);
        centerPanel.add(lastName);
        centerPanel.add(lastField);
        centerPanel.add(subBtn);
        centerPanel.add(clrBtn);

        frame.add(centerPanel, BorderLayout.CENTER);
        frame.setVisible(true);

        clrBtn.addActionListener(e -> {
           firstField.setText("");
           lastField.setText(""); 
        });

        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String firstTxt = firstField.getText().trim();
                String lastTxt = lastField.getText().trim();
                
                if (!firstTxt.isEmpty() || !lastTxt.isEmpty()){
                        JOptionPane.showMessageDialog(frame, 
                            "Welcome to my app, " + firstTxt + " " + lastTxt + "!",
                            "Welcome",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                        JOptionPane.showMessageDialog(frame,
                            "Please enter a text!",
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Milfrance();
    }
}
