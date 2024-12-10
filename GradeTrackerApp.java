import java.awt.*;
import javax.swing.*;

public class GradeTrackerApp {
    public GradeTrackerApp(){
        JFrame frame = new JFrame("Grade Tracker App");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));

        //---input components to add in input panel---//
        JLabel nameLabel = new JLabel("Student Name: ", SwingConstants.CENTER);
        JLabel subjectLabel = new JLabel("Subject: ", SwingConstants.CENTER);
        JLabel gradeLabel = new JLabel("Grade: ", SwingConstants.CENTER);
        JTextField nameField = new JTextField();
        JTextField subjectField = new JTextField();
        JTextField gradeField = new JTextField();
        //---buttons---//
        JButton addBtn = new JButton("Add Entry");
        JButton clrBtn = new JButton("Clear List");
        //---END---//

        JPanel resultPanel = new JPanel(new BorderLayout());
        
        //---components for result panel---//
        JTextArea resultArea = new JTextArea("Entries: \n\n");
        resultArea.setEditable(false);
        resultPanel.add(resultArea);
        resultPanel.add(new JScrollPane(resultArea), BorderLayout.CENTER);
        //---END---//
        
        //---adding components of input field---//
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(subjectLabel);
        inputPanel.add(subjectField);
        inputPanel.add(gradeLabel);
        inputPanel.add(gradeField);
        inputPanel.add(addBtn);
        inputPanel.add(clrBtn);
        //---END---//

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(resultPanel, BorderLayout.CENTER);
        frame.setVisible(true);

        addBtn.addActionListener(e -> {
            String name = nameField.getText().trim();
            String subject = subjectField.getText().trim();
            String gradeInput = gradeField.getText().trim();

            if (name.isEmpty() || subject.isEmpty() || gradeInput.isEmpty()){
                JOptionPane.showMessageDialog(frame, 
                "All fields must be filled!", 
                "Input Error", 
                JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                double grade = Double.parseDouble(gradeField.getText());
                resultArea.append(name + " - " + subject + ": " + grade + "\n");
                nameField.setText("");
                subjectField.setText("");
                gradeField.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, 
                "Grade must be a number!",
                "Input Error", 
                JOptionPane.ERROR_MESSAGE);
            }
        });

        clrBtn.addActionListener(e -> {
            resultArea.setText("Entries: \n\n");
        });
    }

    public static void main(String[] args) {
        new GradeTrackerApp();
    }
}
