import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorLambda {
    public CalculatorLambda(){
        JFrame frame = new JFrame("Calculator");
        JPanel panelNorth = new JPanel(new GridLayout(2,2));
        JPanel panelCenter = new JPanel(new GridLayout(2,1));
        JPanel panelSouth = new JPanel(new GridLayout(1,2));

        frame.setLayout(new BorderLayout());
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        //---components for panel north---///
        JLabel num1Label = new JLabel("Number 1: ");
        JLabel num2Label = new JLabel("Number 2: ");
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();

        panelNorth.add(num1Label);
        panelNorth.add(num2Label);
        panelNorth.add(num1Field);
        panelNorth.add(num2Field);
        frame.add(panelNorth, BorderLayout.NORTH);
        //---END---//

        //---Components for panel center---//
        JLabel operationsLabel = new JLabel("Operations");
        String[] operationStrings = {"Add", "Minus", "Multiply", "Divide"};
        JComboBox<String> operations = new JComboBox<>(operationStrings);

        panelCenter.add(operationsLabel);
        panelCenter.add(operations);
        frame.add(panelCenter, BorderLayout.CENTER);
        //---END---//

        //---Components for panel south---//
        JButton solveBtn = new JButton("Solve");
        JLabel answerLabel = new JLabel("Answer: ");
        
        panelSouth.add(solveBtn);
        panelSouth.add(answerLabel);
        frame.add(panelSouth, BorderLayout.SOUTH);

        frame.setVisible(true);

        solveBtn.addActionListener(event -> {
            try {
                int n1 = Integer.parseInt(num1Field.getText());
                int n2 = Integer.parseInt(num2Field.getText());

                String op = (String) operations.getSelectedItem();
                switch (op) {
                    case "Add": answerLabel.setText("Answer: " + (n1 + n2)); break;
                    case "Minus": answerLabel.setText("Answer: " + (n1 - n2)); break;
                    case "Multiply": answerLabel.setText("Answer: " + (n1 * n2)); break;
                    case "Divide":
                        if (n2 != 0){
                            answerLabel.setText("Answer: " + (double) ((double)n1 / (double)n2));
                        }
                        else {
                            JOptionPane.showMessageDialog(frame,
                             "Cannot divide by zero",
                              "Error", 
                              JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        break;
                    default:
                        answerLabel.setText("Invalid Operation"); break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame,
                 "Invalid input",
                 "Error", 
                 JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new CalculatorLambda();
    }
}
