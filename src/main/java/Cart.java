/*
  File:	  Cart.java
  Author: Mehlhase
  Date:	  4/4/20

  Description: Contains the main logic of the program
*/
package main.java;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    /**
     * Class: Cart
     * 
     * Description: Contains logic for calculating tax, deal rates, totals and
     * age-restriction of Alcohol purchases
     */
    protected int userAge;
    public List<Product> cart;
    double subTotal = 0;
    double total = 0;
    int alcoholCount = 0;
    int dairyCount = 0;
    int frozenFoodCount = 0;
    int meatCount = 0;
    int produceCount = 0;
    // public int cartStorage; SER316 TASK 2 SPOTBUGS FIX

    /**
     * Calculates the final cost after all savings and tax has been applied. Also
     * checks that the user is of age to purchase alcohol if it is in their cart at
     * checkout. Sales tax is always AZ tax. Calculation is based off of the
     * following prices and deals: Dairy -> $3 Meat -> $10 Produce -> $2 or 3 for $5
     * Alcohol -> $8 Frozen Food -> $5 Alcohol + Frozen Food -> $10 If there is an
     * alcohol product in the cart and the user is under 21, then an
     * UnderAgeException should be thrown.
     *
     * @return double totalCost
     * @throws UnderAgeException thrown if underage buying alcohol
     */
    public double calcCost() throws UnderAgeException {

       // determine amount of each item in cart
        for (Product product : cart) {
            isAlcohol(product);
            isDairy(product);
            isFrozenFood(product);
            isMeat(product);
            isProduce(product);
        }

        // if purchasing alcohol, check if legal age
        if (alcoholCount > 0 && this.userAge < 21) {
            throw new UnderAgeException("The buyer is a minor and cannot purchase alcohol.");
        }

        // calculate subtotals for each items type
        int alcoholCost = alcoholCount * 8;
        int dairyCost = dairyCount * 3;
        int frozenFoodCost = frozenFoodCount * 5;
        int meatCost = meatCount * 10;
        int produceCost = produceCount * 2;

        // calculate discounts:
        int amountSaved = amountSaved(produceCount, alcoholCount, frozenFoodCount);

        // calculate subtotal
        subTotal = alcoholCost + dairyCost + frozenFoodCost + meatCost + produceCost - amountSaved;

        // calculate grand total
        total = subTotal + getAzTax(subTotal);
        return total;
    }

    private void isProduce(Product product) {
        if(product.getClass().toString().equals(Produce.class.toString())) {
            produceCount++;
        }
    }

    private void isMeat(Product product) {
        if(product.getClass().toString().equals(Meat.class.toString())) {
            meatCount++;
        }        
    }

    private void isFrozenFood(Product product) {
        if(product.getClass().toString().equals(FrozenFood.class.toString())) {
            frozenFoodCount++;
        }        
    }

    private void isDairy(Product product) {
        if(product.getClass().toString().equals(Dairy.class.toString())) {
            dairyCount++;
        }        
    }

    private void isAlcohol(Product product) {
        if(product.getClass().toString().equals(Alcohol.class.toString())) {
            alcoholCount++;
        }        
    }

    /**
     * calculates how much was saved in the current shopping cart based on the //
     * deals, returns the saved amount // throws exception if alcohol is bought from
     * underage person // TODO: Create node graph for this method in assign 4:
     * create white box tests // and fix the method, reach at least 98% coverage.
     *
     * @return int
     * @throws UnderAgeException thrown if underage buying alcohol
     */
    public int amountSaved(int produceCount, int alcoholCount, int frozenFoodCount) {
        // produce discount
        int produceSavings = produceCount / 3;

        // alcohol & frozen food discount
        int affSavings = 0;
        if (alcoholCount > 0 && frozenFoodCount > 0) {
            if (alcoholCount > frozenFoodCount) {
                affSavings = frozenFoodCount * 3;
            } else {
                affSavings = alcoholCount * 3;
            }
        }
        int amountSaved = produceSavings + affSavings;
        return amountSaved;
    }

    /**
     * Gets Arizona tax based on the total.
     *
     * @param totalBt total before taxes
     * @return double
     */
    public double getAzTax(double totalBt) {
        double newTotal = totalBt * .08;
        return newTotal;
    }

    /**
     * Gets California tax based on the total.
     *
     * @param totalBt total before taxes
     * @return double
     */
    public double getCaTax(double totalBt) {
        double newTotal = totalBt * .09;
        return newTotal;
    }

    /**
     * Gets New York tax based on the total.
     *
     * @param totalBt total before taxes
     * @return double
     */
    public double getNyTax(double totalBt) {
        double newTotal = totalBt * .1;
        return newTotal;
    }

    /**
     * Gets Colorado tax based on the total.
     *
     * @param totalBt total before taxes
     * @return double
     */
    public double getCoTax(double totalBt) {
        double newTotal = totalBt * .07;
        return newTotal;
    }

    public void addItem(Product np) {
        cart.add(np);
    }

    /**
     * Removes given product from cart.
     * 
     * @param productToRemove name of unwanted product
     * @return boolean
     */
    public boolean removeItem(Product productToRemove) { // fixed {} style
        boolean test = false; // fixed whitespace
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i) == productToRemove) {
                cart.remove(i);
                return !test; // condensed code
            }
        }
        return test; // changed to variable rather than primitive
    }

    public Cart(int age) {
        userAge = age;
        cart = new ArrayList<Product>();
    }
}
