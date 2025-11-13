import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
//File: JFacts.java
//Author: Yandel Colón Rivera
//Date: 11/12/2025
//Class: COMP 2400 OOP
//Description: Displays a JFrame with six labels about my favorite topic. Each button click replaces one label with another.



public class JFacts extends JFrame implements ActionListener {

    // All facts available to display
    private final String[] ALL_FACTS = {
            "Fact 1: A day on Venus is longer than a year on Venus.",
            "Fact 2: The hottest planet in our solar system is Venus, not Mercury.",
            "Fact 3: There are more trees on Earth than stars in the Milky Way.",
            "Fact 4: The total mass of all asteroids combined is less than the Moon’s mass.",
            "Fact 5: Scientists estimate there are over 100 billion galaxies in the observable universe.",
            "Fact 6: The sunset on Mars appears blue.",
            "Fact 7: One million Earths could fit inside the Sun.",
            "Fact 8: Jupiter's Great Red Spot is a persistent storm larger than Earth.",
            "Fact 9: The coldest recorded place in the solar system is on the Moon.",
            "Fact 10: Pluto is smaller than the United States.",
            "Fact 11: Neutron stars are so dense, a teaspoon would weigh about 6 billion tons.",
            "Fact 12: The largest volcano known is Olympus Mons, located on Mars."
    };

    // The index of the next fact to be added from ALL_FACTS
    private int currentFactIndex = 6; // Start after the initial 6 facts

    // Panel to hold the labels, using BorderLayout for button and GridLayout for facts
    private final JPanel factPanel = new JPanel(new GridLayout(6, 1, 5, 5));
    private final JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

    private final JButton cycleButton = new JButton("Cycle Fact: See a new discovery!");

    public JFacts() {
        super("Astronomy Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 1. Initialize the display with the first six facts
        for (int i = 0; i < 6; i++) {
            JLabel label = createFactLabel(ALL_FACTS[i]);
            factPanel.add(label);
        }

        // 2. Set up the layout
        factPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(new JLabel("Amazing Astronomy Facts", SwingConstants.CENTER), BorderLayout.NORTH);
        mainPanel.add(factPanel, BorderLayout.CENTER);

        cycleButton.addActionListener(this);
        mainPanel.add(cycleButton, BorderLayout.SOUTH);

        add(mainPanel, BorderLayout.CENTER);

        // Styling for aesthetics
        getContentPane().setBackground(new Color(240, 248, 255)); // Alice Blue background
        cycleButton.setBackground(new Color(60, 179, 113)); // Medium Sea Green
        cycleButton.setForeground(Color.WHITE);
        cycleButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        factPanel.setBackground(new Color(240, 248, 255));

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Helper method to create a styled JLabel for a fact.
     */
    private JLabel createFactLabel(String text) {
        JLabel label = new JLabel(" • " + text);
        label.setFont(new Font("Serif", Font.PLAIN, 16));
        label.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        return label;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. Determine the fact to add
        String newFactText = ALL_FACTS[currentFactIndex % ALL_FACTS.length];
        JLabel newLabel = createFactLabel(newFactText);

        // 2. Remove the first (oldest) label from the panel
        factPanel.remove(0);

        // 3. Add the new label to the end of the panel
        factPanel.add(newLabel);

        // 4. Update the index for the next click (wraps around)
        currentFactIndex++;

        // 5. Redraw the panel to reflect changes
        factPanel.revalidate();
        factPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JFacts::new);
    }
}
