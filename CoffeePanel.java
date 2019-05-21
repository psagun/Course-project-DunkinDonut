import javax.swing.*;
import java.awt.*;

/**
   The CoffeePanel class allows the user to select coffee.
*/

public class CoffeePanel extends JPanel
{
   
   public final double NO_COFFEE = 0.0;
   public final double REGULAR_COFFEE = 1.25;
   public final double DECAF_COFFEE = 1.25;
   public final double LATTE = 2.00;

   private JRadioButton noCoffee;      // To select no coffee
   private JRadioButton regularCoffee; // To select regular coffee
   private JRadioButton decafCoffee;   // To select decaf
   private JRadioButton latte;    // To select cappuccino
   private ButtonGroup bg;             // Radio button group

   /**
      Constructor
   */

   public CoffeePanel()
   {
      // Create a GridLayout manager with 
      // four rows and one column.
      setLayout(new GridLayout(4, 1));

      // Create the radio buttons.
      noCoffee = new JRadioButton("None");
      regularCoffee = new JRadioButton("Regular coffee", true);
      decafCoffee = new JRadioButton("Decaf coffee");
      latte = new JRadioButton("Latte");

      bg = new ButtonGroup();
      bg.add(noCoffee);
      bg.add(regularCoffee);
      bg.add(decafCoffee);
      bg.add(latte);

      
      setBorder(BorderFactory.createTitledBorder("Coffee"));

     
      add(noCoffee);
      add(regularCoffee);
      add(decafCoffee);
      add(latte);
   }


   public double getCoffeeCost()
   {
      double coffeeCost = 0.0;

      if (noCoffee.isSelected())
         coffeeCost = NO_COFFEE;
      else if (regularCoffee.isSelected())
         coffeeCost = REGULAR_COFFEE;
      else if (decafCoffee.isSelected())
         coffeeCost = DECAF_COFFEE;
      else if (latte.isSelected())
         coffeeCost = LATTE;

      return coffeeCost;
   }
}
