package CodeAlpha_internship_;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Word Count Application");
        JLabel label = new JLabel("Enter your paragraph:");
        JTextArea textArea = new JTextArea();
        JButton countButton = new JButton("Count Words");
        JLabel resultLabel = new JLabel("Word count: 0");

        // Set layout
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Add components to the frame
        frame.add(label);
        frame.add(textArea);
        frame.add(countButton);
        frame.add(resultLabel);

        // Set action for the countButton
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                // Split the paragraph into words using space as delimiter
                String[] words = text.split("\\s+");
                // Count the number of words
                int wordCount = words.length;
                resultLabel.setText("Word count: " + wordCount);
            }
        });

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
