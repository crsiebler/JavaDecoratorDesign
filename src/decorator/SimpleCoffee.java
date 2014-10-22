// Assignment 3, Morse Code Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 11 - Design Patterns
// Description: 
package decorator;

/**
 * Extension of a simple coffee without any extra ingredients.
 *
 * @author csiebler
 */
public class SimpleCoffee extends Coffee {

    /**
     *
     *
     * @return
     */
    @Override
    public double getCost() {
        return 1;
    }

    /**
     *
     *
     * @return
     */
    @Override
    public String getIngredients() {
        return "Coffee";
    }

}
