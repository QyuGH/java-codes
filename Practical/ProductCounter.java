import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductCounter extends JFrame{
	private static double total = 0;

	public ProductCounter() {
		JTextField productNameField = new JTextField();
		JTextField productPriceField = new JTextField();
		JButton addBtn = new JButton("Add");
		JButton resetBtn = new JButton("Reset");

		JPanel northPanel = new JPanel(new GridLayout(4,2,10,10));
		JTextArea productPriceArea = new JTextArea("Products: \n\n");
		productPriceArea.setEditable(false);
		JTextArea totalArea = new JTextArea("Total: " + total);
		totalArea.setEditable(false);		

		setTitle("Product Counter");
		setLayout(new BorderLayout());
		setSize(400,500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		northPanel.add(new JLabel("Product: "));
		northPanel.add(productNameField);
		northPanel.add(new JLabel("Price: "));
		northPanel.add(productPriceField);
		northPanel.add(addBtn);
		northPanel.add(resetBtn);	

		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				calculateTotal(productNameField, productPriceField, productPriceArea, totalArea);
			}
		});

		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				productPriceArea.setText("Products: \n\n");
			}
		});

		add(northPanel, BorderLayout.NORTH);
		add(new JScrollPane(productPriceArea), BorderLayout.CENTER);
		add(totalArea, BorderLayout.SOUTH);
		setVisible(true);
	}

	public void calculateTotal(JTextField product, JTextField price, JTextArea totalArea, JTextArea totalPriceArea){
		String productName = product.getText().trim();
		String priceString = price.getText().trim();

		if (productName.isEmpty() || priceString.isEmpty()){
			JOptionPane.showMessageDialog(this, 
				"Input field must not be empty!",
				"Input Error",
				JOptionPane.ERROR_MESSAGE);
			return;
		}
		else {
			try {
				double productPrice = Double.parseDouble(priceString);
				totalArea.append(productName + " - " + productPrice + "\n");
				total += productPrice;
				totalPriceArea.setText("Total: " + total);
				product.setText("");
				price.setText("");
				JOptionPane.showMessageDialog(this,
					"Product Added",
					"Successful addition",
					JOptionPane.INFORMATION_MESSAGE);
			}
			catch (Exception ex) {
				JOptionPane.showMessageDialog(this,
					"Invalid price",
					"Input Error",
					JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}