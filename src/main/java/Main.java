/*
  File:	  Main.java
  Author: Mehlhase
  Date:	  4/4/20
  
  Description: Main class which generates a specific system state
*/
package main.java;
/**
Class:	Main

Description:  Creates a sample system state with a Cart full of some Product
*/ 
public class Main {
    /**
     * Main method.
     * @param args given arguments
     * @throws UnderAgeException thrown if underage
     */
    public static void main(String[] args) throws UnderAgeException {

        // Instantiating some products
        Produce apple = new Produce();
        Produce orange = new Produce();
        Produce banana = new Produce();
        Produce beet = new Produce();

        Alcohol budlight = new Alcohol();
        Alcohol coorslight = new Alcohol();

        FrozenFood pizza = new FrozenFood();

        Meat chicken = new Meat();

        Dairy milk = new Dairy();

        Cart cart = new Cart(25);
        cart.addItem(apple);
        cart.addItem(orange);
        cart.addItem(banana);
        cart.addItem(beet);
        cart.addItem(budlight);
        cart.addItem(coorslight);
        cart.addItem(pizza);
        cart.addItem(chicken);
        cart.addItem(milk);

        System.out.println(cart.calcCost());
        System.out.println(cart.amountSaved());
    }
}
