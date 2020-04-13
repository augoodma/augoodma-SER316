package main.java;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    protected int userAge;
    public List<Product> cart;
    public int cartStorage;

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
        double subTotal = 0;
        double total = 0;
        int alcoholCount = 0;
        int dairyCount = 0;
        int frozenFoodCount = 0;
        int meatCount = 0;
        int produceCount = 0;

        // determine amount of each item in cart
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getClass().toString().equals(Alcohol.class.toString())) {
                alcoholCount++;
            }
            if (cart.get(i).getClass().toString().equals(Dairy.class.toString())) {
                dairyCount++;
            }
            if (cart.get(i).getClass().toString().equals(FrozenFood.class.toString())) {
                frozenFoodCount++;
            }
            if (cart.get(i).getClass().toString().equals(Meat.class.toString())) {
                meatCount++;
            }
            if (cart.get(i).getClass().toString().equals(Produce.class.toString())) {
                produceCount++;
            }
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
        // calculate subtotal
        subTotal = alcoholCost + dairyCost + frozenFoodCost 
                + meatCost + produceCost - produceSavings - affSavings;

        // calculate grand total
        total = subTotal + getTax(subTotal, "AZ");
        return total;
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
    public int amountSaved() throws UnderAgeException {
        int subTotal = 0;
        int costAfterSavings = 0;

        int produceCounter = 0; // was double, changed to int
        int alcoholCounter = 0;
        int frozenFoodCounter = 0;
        // int dairyCounter = 0; commented out since there is no discount with Dairy
        int produceSavings = 0;
        int affSavings = 0; // a couple new variables to track savings

        for (int i = 0; i < cart.size(); i++) {
            subTotal += cart.get(i).getCost();
            if (cart.get(i).getClass().toString().equals(Produce.class.toString())) {
                produceCounter++;
            } else if (cart.get(i).getClass().toString().equals(Alcohol.class.toString())) {
                alcoholCounter++;
                if (userAge < 21) {
                    throw new UnderAgeException("The User is not of age to purchase alcohol!");
                }
            } else if (cart.get(i).getClass().toString().equals(FrozenFood.class.toString())) {
                frozenFoodCounter++;
            }
            produceSavings = produceCounter / 3;
            // alcohol & frozen food discount
            if (alcoholCounter > 0 && frozenFoodCounter > 0) {
                if (alcoholCounter > frozenFoodCounter) {
                    affSavings = frozenFoodCounter * 3;
                } else {
                    affSavings = alcoholCounter * 3;
                }
            }
        }
        costAfterSavings = produceSavings + affSavings;
        return subTotal - costAfterSavings;
    }

    /** Gets the tax based on state and the total.
     * 
     * @param totalBt total before taxes
     * @param twoLetterStateAbbreviation standard two letter state abbreviation
     * @return double
     */
    public double getTax(double totalBt, String twoLetterStateAbbreviation) {
        double newTotal = 0;
        switch (twoLetterStateAbbreviation) {
            case "AZ":
                newTotal = totalBt * .08;
                break;
            case "CA":
                newTotal = totalBt * .09;
                break;
            case "NY":
                newTotal = totalBt * .1;
                break; // <-added break statement
            case "CO":
                newTotal = totalBt * .07;
                break;
            default:
                return 0; 
        }
        return newTotal;
    }

    public void addItem(Product np) {
        cart.add(np);
    }

    /**
     * Removes given product from cart.
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
