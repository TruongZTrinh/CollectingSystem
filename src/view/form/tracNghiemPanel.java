package view.form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tracNghiemPanel extends JPanel {

    private JPanel optionPanel; // Panel to hold multiple choice options
    private JButton addOptionButton; // Button to add new option
    private int optionCount = 0; // To keep track of the number of options added

    public tracNghiemPanel() {
        initComponents();
        optionPanel.setLayout(new BoxLayout(optionPanel, BoxLayout.Y_AXIS));
    }

    private void initComponents() {
        JLabel questionLabel = new JLabel("Câu hỏi: ");
        JTextField questionField = new JTextField(20);
        questionField.setToolTipText("Nhập câu hỏi ở đây");

        optionPanel = new JPanel(); // Panel to hold option inputs
        optionPanel.setBackground(new Color(255, 255, 255));
        optionPanel.setBorder(BorderFactory.createTitledBorder("Tùy chọn câu hỏi"));

        // Button to add new option
        addOptionButton = new JButton("Thêm tùy chọn");
        addOptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewOption();
            }
        });

        // Set layout for the main panel
        setLayout(new BorderLayout());
        add(questionLabel, BorderLayout.NORTH);
        add(questionField, BorderLayout.CENTER);
        add(optionPanel, BorderLayout.SOUTH);
        add(addOptionButton, BorderLayout.EAST);
    }

    private void addNewOption() {
        optionCount++;
        JTextField newOptionField = new JTextField("Tùy chọn " + optionCount);
        newOptionField.setToolTipText("Nhập tùy chọn ở đây");
        optionPanel.add(newOptionField);
        optionPanel.revalidate(); // Refresh the panel to show the new option
        optionPanel.repaint(); // Redraw the panel
    }
}
