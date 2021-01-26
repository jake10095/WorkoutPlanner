package dev.borgeson.gui;

import dev.borgeson.workoutplanner.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        Dimension dime = new Dimension();
        dime.setSize(500,500);


        JButton button = new JButton("Generate Workout");
        button.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setPreferredSize(dime);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Workout Planner");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = Planner.ret();
        JOptionPane.showMessageDialog(null, message);
    }
}
