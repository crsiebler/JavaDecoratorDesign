// Assignment 3, Morse Code Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 11 - Design Patterns
// Description: 
package decorator;

/**
 * Abstract decorator class - note that it extends Coffee abstract class.
 *
 * @author csiebler
 */
public abstract class CoffeeDecorator extends Coffee {

    protected final Coffee decoratedCoffee;
    protected String ingredientSeparator = ", ";

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() { // Implementing methods of the abstract class
        return decoratedCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
    
}
