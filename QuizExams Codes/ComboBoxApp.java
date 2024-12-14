import java.awt.*;
import javax.swing.*;

public class ComboBoxApp{
    public ComboBoxApp(){
        JFrame frame = new JFrame("Sample");
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel(new GridLayout(2,2,10,10));
        JLabel inLabel = new JLabel("Enter a text: ");
        JTextField inField = new JTextField();
        JButton addBtn = new JButton("Add to Combo");
        JComboBox<String> combo = new JComboBox<>();

        topPanel.add(inLabel);
        topPanel.add(inField);
        topPanel.add(addBtn);
        topPanel.add(combo);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.setVisible(true);

        addBtn.addActionListener(e -> {
            String text = inField.getText().trim();
            if (!text.isEmpty()){
                combo.addItem(text);
                inField.setText("");
            }
            else {
                JOptionPane.showMessageDialog(frame, "Please enter a text", "Input Error", JOptionPane.WARNING_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new ComboBoxApp();
    }
}