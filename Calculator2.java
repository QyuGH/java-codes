import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Calculator2 implements ActionListener{
    private JPanel panelNorth, panelCenter, panelSouth;
    private JTextField num1Field = new JTextField();
    private JTextField num2Field = new JTextField();
    private JButton solveBtn = new JButton("Solve");
    private JLabel answerLabel = new JLabel("Answer: ");
    private String[] operators = {"Add", "Subtract", "Multiply", "Divide"};
    private JComboBox<String> operatorComboBox = new JComboBox<>(operators);
    JFrame frame = new JFrame("Ultimate Calculator");

    public Calculator2() {
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        //---layout of north panel
        panelNorth = new JPanel(new GridLayout(2,2, 8, 8));
        panelNorth.setBorder(new EmptyBorder(10,10,10,10));

        JLabel num1Label = new JLabel("Number 1");        
        JLabel num2Label = new JLabel("Number 2");

        num1Field.setPreferredSize(new Dimension(10,30));
        num2Field.setPreferredSize(new Dimension(10,30));
        //---end of panel north

        //---layout of center panel
        panelCenter = new JPanel(new GridLayout(2, 1, 8, 8));
        panelCenter.setBorder(new EmptyBorder(10,10,10,10));
        JLabel operationLabel = new JLabel("Operation");
        //---end of center panel

        //layout of south panel
        panelSouth = new JPanel(new GridLayout(1, 2));
        panelSouth.setBorder(new EmptyBorder(10,10,10,10));

        solveBtn.addActionListener(this);
        answerLabel.setBorder(new EmptyBorder(8, 8, 8, 8));
        //---end of south panel

        panelNorth.add(num1Label);
        panelNorth.add(num2Label);
        panelNorth.add(num1Field);
        panelNorth.add(num2Field);
        panelCenter.add(operationLabel);
        panelCenter.add(operatorComboBox);
        panelSouth.add(solveBtn);
        panelSouth.add(answerLabel);

        frame.add(panelNorth, BorderLayout.NORTH);
        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(panelSouth, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == solveBtn) {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
    
                String operator = (String) operatorComboBox.getSelectedItem();
                int result = 0;
    
                switch (operator) {
                    case "Add":
                        result = num1 + num2;
                        break;
                    case "Subtract":
                        result = num1 - num2;
                        break;
                    case "Multiply":
                        result = num1 * num2;
                        break;
                    case "Divide":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            JOptionPane.showMessageDialog(frame, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        break;
                    default:
                        answerLabel.setText("Invalid operation");
                        return;
                }
                answerLabel.setText("Answer: " + result);
    
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid or Empty Input", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Calculator2();
    }
}
