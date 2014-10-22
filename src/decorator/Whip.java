// Assignment 3, Morse Code Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 11 - Design Patterns
// Description: 
package decorator;

/**
 * Decorator Whip that mixes whip with coffee. Note it extends CoffeeDecorator.
 *
 * @author csiebler
 */
class Whip extends CoffeeDecorator {

    /**
     *
     *
     * @param decoratedCoffee
     */
    public Whip(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return super.getCost() + 0.7;
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
