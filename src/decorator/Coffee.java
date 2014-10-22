// Assignment 3, Morse Code Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 11 - Design Patterns
// Description: 
package decorator;

/**
 * The abstract Coffee class defines the functionality of Coffee implemented by
 * decorator.
 *
 * @author csiebler
 */
public abstract class Coffee {

    /**
     * 
     * @return The cost of the coffee
     */
    public abstract double getCost();

    /**
     * 
     * @return The ingredients of the coffee
     */
    public abstract String getIngredients();
    
}
