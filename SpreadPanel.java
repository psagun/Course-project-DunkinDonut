import javax.swing.*;
import java.awt.*;

/**
   The ToppingPanel class allows the user to select
   the toppings for the bagel.
*/

public class SpreadPanel extends JPanel
{
   // The following constants are used to indicate
   // the cost of toppings.
   public final double CREAM_CHEESE = 0.50;
   public final double BUTTER = 0.25;
   public final double STRAWBERRY_JELLY = 0.75;
   public final double GRAPE_JELLY = 0.75;

   private JCheckBox creamCheese;  // To select cream cheese
   private JCheckBox butter;       // To select butter
   private JCheckBox strawberryJelly;   // To select peach jelly
   private JCheckBox grapeJelly; // To select blueberry jam

   /**
      Constructor
   */

   public SpreadPanel()
   {
      // Create a GridLayout manager with 
      // four rows and one column.
      setLayout(new GridLayout(4, 1));

      // Create the check boxes.
      creamCheese = new JCheckBox("Cream cheese");
      butter = new JCheckBox("Butter");
      strawberryJelly = new JCheckBox("Strawberry jelly");
      grapeJelly = new JCheckBox("Grape jelly");

      setBorder(BorderFactory.createTitledBorder("Spread"));

      add(creamCheese);
      add(butter);
      add(strawberryJelly);
      add(grapeJelly);
   }


   public double getSpreadCost()
   {
      double spreadCost = 0.0;

      if (creamCheese.isSelected())
         spreadCost += CREAM_CHEESE;
      if (butter.isSelected())
         spreadCost += BUTTER;
      if (strawberryJelly.isSelected())
         spreadCost += STRAWBERRY_JELLY;
      if (grapeJelly.isSelected())
         spreadCost += GRAPE_JELLY;

      return spreadCost;
   }
}
