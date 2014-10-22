// Assignment 3, Morse Code Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 11 - Design Patterns
// Description: 
package decorator;

/**
 *
 * @author csiebler
 */
public class Main {

    /**
     * 
     * @param args 
     */
    public static final void main(String[] args) {
        Coffee c = new SimpleCoffee();
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new Milk(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new Sprinkles(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new Whip(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());

        c = new Sugar(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }

}
