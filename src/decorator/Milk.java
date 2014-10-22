// Assignment 3, Morse Code Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 11 - Design Patterns
// Description: 
package decorator;

/**
 * Decorator Milk that mixes milk with coffee. Note it extends CoffeeDecorator.
 *
 * @author csiebler
 */
class Milk extends CoffeeDecorator {

    /**
     *
     *
     * @param decoratedCoffee
     */
    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    /**
     *
     *
     * @return
     */
    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    /**
     *
     *
     * @return
     */
    @Override
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Milk";
    }
    
}
