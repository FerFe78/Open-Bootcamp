package swingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SwingTax {
    private JLabel pricePane;
    private JLabel taxPane;
    private JLabel totalPane;
    private JPanel taxPanel;
    private JButton calculateButton;
    private JTextField price;
    private JTextField tax;
    private JTextField total;
    public SwingTax() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(price.getText());
                double t = Double.parseDouble(tax.getText());

                double result = p + (p / 100 *t);
                total.setText(Double.toString(result));
            }
        });
        price.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                String valuePrice = price.getText();
                price.setText(valuePrice);
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new SwingTax().taxPanel);
        frame.setVisible(true);
    }
}
