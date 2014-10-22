// Assignment 3, Morse Code Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 11 - Design Patterns
// Description: 
package decorator;

/**
 * Decorator Sprinkles that mixes sprinkles with coffee. Note it extends
 * CoffeeDecorator.
 *
 * @author csiebler
 */
class Sprinkles extends CoffeeDecorator {

    /**
     *
     *
     * @param decoratedCoffee
     */
    public Sprinkles(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    /**
     *
     *
     * @return
     */
    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }

    /**
     *
     *
     * @return
     */
    @Override
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Sprinkles";
    }
    
}
