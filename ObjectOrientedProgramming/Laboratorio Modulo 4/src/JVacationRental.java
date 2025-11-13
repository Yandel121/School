import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
//File: JVacationRental.java
//Author: Yandel Colón Rivera
//Date: 11/12/2025
//Class: COMP 2400 OOP
//Description: Application for Lambert’s Vacation Rentals. Allows selection of location, bedrooms, and meals with dynamic pricing.
public class JVacationRental extends JFrame {

    // Base Price Constants
    private static final int PARKSIDE_PRICE = 600;
    private static final int POOLSIDE_PRICE = 750;
    private static final int LAKESIDE_PRICE = 825;
    private static final int BEDROOM_INCREMENT = 75;
    private static final int MEALS_PRICE = 200;

    // Components for Location selection (ButtonGroup 1)
    private final JRadioButton parkside = new JRadioButton("Parkside ($" + PARKSIDE_PRICE + "/week)");
    private final JRadioButton poolside = new JRadioButton("Poolside ($" + POOLSIDE_PRICE + "/week)");
    private final JRadioButton lakeside = new JRadioButton("Lakeside ($" + LAKESIDE_PRICE + "/week)");
    private final ButtonGroup locationGroup = new ButtonGroup();

    // Components for Bedrooms selection (ButtonGroup 2)
    private final JRadioButton oneBedroom = new JRadioButton("1 Bedroom (+$0)");
    private final JRadioButton twoBedrooms = new JRadioButton("2 Bedrooms (+$" + BEDROOM_INCREMENT + ")");
    private final JRadioButton threeBedrooms = new JRadioButton("3 Bedrooms (+$" + (BEDROOM_INCREMENT * 2) + ")");
    private final ButtonGroup bedroomGroup = new ButtonGroup();

    // Components for Meals selection (ButtonGroup 3)
    private final JRadioButton mealsIncluded = new JRadioButton("Meals Included (+$" + MEALS_PRICE + ")");
    private final JRadioButton mealsExcluded = new JRadioButton("Meals Excluded (+$0)");
    private final ButtonGroup mealsGroup = new ButtonGroup();

    // Output component
    private final JLabel totalLabel = new JLabel("Total Weekly Price: $0", SwingConstants.CENTER);

    public JVacationRental() {
        super("Lambert's Vacation Rentals");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(15, 15));

        // 1. Build the three selection panels
        JPanel locationPanel = createSelectionPanel("1. Select Location", locationGroup, parkside, poolside, lakeside);
        JPanel bedroomPanel = createSelectionPanel("2. Select Bedrooms", bedroomGroup, oneBedroom, twoBedrooms, threeBedrooms);
        JPanel mealsPanel = createSelectionPanel("3. Meal Plan", mealsGroup, mealsIncluded, mealsExcluded);

        // 2. Set default selections
        parkside.setSelected(true);
        oneBedroom.setSelected(true);
        mealsExcluded.setSelected(true);

        // 3. Register a single listener to handle all radio button clicks
        ActionListener selectionListener = e -> calculateTotal();
        parkside.addActionListener(selectionListener);
        poolside.addActionListener(selectionListener);
        lakeside.addActionListener(selectionListener);
        oneBedroom.addActionListener(selectionListener);
        twoBedrooms.addActionListener(selectionListener);
        threeBedrooms.addActionListener(selectionListener);
        mealsIncluded.addActionListener(selectionListener);
        mealsExcluded.addActionListener(selectionListener);

        // 4. Layout the main UI
        JPanel centerPanel = new JPanel(new GridLayout(1, 3, 15, 0));
        centerPanel.add(locationPanel);
        centerPanel.add(bedroomPanel);
        centerPanel.add(mealsPanel);

        // Styling the total label
        totalLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        totalLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        totalLabel.setForeground(new Color(0, 100, 0)); // Dark Green

        add(new JLabel("Lambert's Dream Vacation Planner", SwingConstants.CENTER), BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(totalLabel, BorderLayout.SOUTH);

        // Final window settings
        getContentPane().setBackground(new Color(245, 245, 220)); // Beige background
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        calculateTotal(); // Initial calculation
    }

    /**
     * Creates a titled, grouped panel for selections.
     */
    private JPanel createSelectionPanel(String title, ButtonGroup group, JRadioButton... buttons) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        for (JRadioButton button : buttons) {
            group.add(button);
            panel.add(button);
        }

        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), title));
        return panel;
    }

    /**
     * Calculates the total price based on the current radio button selections.
     */
    private void calculateTotal() {
        int total = 0;
        int locationPrice = 0;
        int bedroomCost = 0;
        int mealCost = 0;

        // 1. Calculate Location Price
        if (parkside.isSelected()) {
            locationPrice = PARKSIDE_PRICE;
        } else if (poolside.isSelected()) {
            locationPrice = POOLSIDE_PRICE;
        } else if (lakeside.isSelected()) {
            locationPrice = LAKESIDE_PRICE;
        }

        // 2. Calculate Bedroom Cost
        if (twoBedrooms.isSelected()) {
            bedroomCost = BEDROOM_INCREMENT;
        } else if (threeBedrooms.isSelected()) {
            // $75 for the second bedroom, plus $75 for the third
            bedroomCost = BEDROOM_INCREMENT * 2;
        }
        // One bedroom costs $0 (base price)

        // 3. Calculate Meal Cost
        if (mealsIncluded.isSelected()) {
            mealCost = MEALS_PRICE;
        }

        total = locationPrice + bedroomCost + mealCost;
        totalLabel.setText("Total Weekly Price: $" + total);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JVacationRental::new);
    }
}