package test.java;

import main.java.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest {

    //Sequences from the homework node graphs:
    Cart set1Seq1 = new Cart(21);  //node coverage sequence 1
    Cart set1Seq2 = new Cart(20);  //node coverage sequence 2
    Cart set2Seq1 = new Cart(21);  //edge coverage sequence 1

    double test11Expected;
    double test12Expected;
    double test21Expected;

    //For getTax testing
    Cart getTaxTest = new Cart(21);  //test cart for getTax node and edge coverage

    double costOfMeat;

    String az;
    String ca;
    String ny;
    String co;
    String or;

    double test31Expected;
    double test32Expected;
    double test33Expected;
    double test34Expected;
    double test35Expected;

    //For addItem testing
    Cart addItemTest = new Cart(21);  //test cart for addItem node and edge coverage

    String test41Expected;

    //For RemoveItem testing
    Cart removeItemTest51 = new Cart(21);  //test cart for RemoveItem node and edge coverage
    Cart removeItemTest52 = new Cart(21);

    Product produce;
    Product meat;

    boolean test51Expected;
    boolean test52Expected;

    /**
     * setup for testing.
     * @throws Exception generic exception
     */
    @Before
    public void setUp() throws Exception {
        for (int i = 0; i < 3; i++) {
            set1Seq1.addItem(new Produce());
        }
        //set up Amount_saved tests
        set1Seq1.addItem(new Alcohol());
        set1Seq1.addItem(new FrozenFood());
        set1Seq2.addItem(new Alcohol());
        set2Seq1.addItem(new Produce());

        test11Expected = 15;
        test12Expected = 0;
        test21Expected = 2;

        //set up getTax tests
        costOfMeat = 10;

        az = "AZ";
        ca = "CA";
        ny = "NY";
        co = "CO";
        or = "OR";

        test31Expected = .8;
        test32Expected = .9;
        test33Expected = 1;
        test34Expected = .7;
        test35Expected = 0;

        //set up addItem test
        addItemTest.addItem(new Meat());

        test41Expected = Meat.class.toString();

        //set up RemoveItem tests
        produce = new Produce();
        meat = new Meat();

        removeItemTest51.addItem(produce);
        removeItemTest51.addItem(meat);

        test51Expected = true;
        test52Expected = false;
    }

    /**Set 1, sequence 1.
    Method: testSet1Seq1
    Inputs: none
    Returns: void

    Description: Node coverage by adding items to the cart to get each discount type
     * @throws UnderAgeException thrown if underage buying alcohol
    @Test
    public void testSet1Seq1() throws UnderAgeException {
        double amount = set1Seq1.amountSaved();
        assertEquals(test11Expected, amount, .01);
    }

    /**Set 2, sequence 1.
    Method: testSet1Seq2
    Inputs: none
    Returns: void

    Description: Remaining node coverage by using UnderAgeException
    @Test(expected = UnderAgeException.class)
    public void testSet1Seq2() throws UnderAgeException {
        double amount = set1Seq2.amountSaved();
        assertEquals(test12Expected, amount, .01);
    }

    /**Set 2, sequence 1.
    Method: testSet2Seq1
    Inputs: none
    Returns: void

    Description: Remaining edge not touched in other tests, by having 1 < Produce < 3
    @Test
    public void testSet2Seq1() throws UnderAgeException {
        double amount = set2Seq1.amountSaved();
        assertEquals(test21Expected, amount, .01);
    }
     */

    /**Set 3, sequence 1.
    Method: test31Expected
    Inputs: none
    Returns: void

    Description: Test case "AZ"
     */
    @Test
    public void test31Expected() throws UnderAgeException {
        double amount = getTaxTest.getAzTax(costOfMeat);
        assertEquals(test31Expected, amount, .01);
    }

    /**Set 3, sequence 2.
    Method: test32Expected
    Inputs: none
    Returns: void

    Description: Test case "CA"
     */
    @Test
    public void test32Expected() throws UnderAgeException {
        double amount = getTaxTest.getCaTax(costOfMeat);
        assertEquals(test32Expected, amount, .01);
    }

    /**Set 3, sequence 3.
    Method: test33Expected
    Inputs: none
    Returns: void

    Description: Test case "NY"
     */
    @Test
    public void test33Expected() throws UnderAgeException {
        double amount = getTaxTest.getNyTax(costOfMeat);
        assertEquals(test33Expected, amount, .01);
    }

    /**Set 3, sequence 4.
    Method: test34Expected
    Inputs: none
    Returns: void

    Description: Test case "CO"
     */
    @Test
    public void test34Expected() throws UnderAgeException {
        double amount = getTaxTest.getCoTax(costOfMeat);
        assertEquals(test34Expected, amount, .01);
    }

    /**Set 3, sequence 5.
    Method: test35Expected
    Inputs: none
    Returns: void

    Description: Test case "OR" (any other state)
    @Test
    public void test35Expected() throws UnderAgeException {
        double amount = getTaxTest.getTax(costOfMeat, or);
        assertEquals(test35Expected, amount, .01);
    }
     */

    /**Set 4, sequence 1.
    Method: test41Expected
    Inputs: none
    Returns: void

    Description: Test addItem by adding Meat to cart
     */
    @Test
    public void test41Expected() throws UnderAgeException {
        String item = addItemTest.cart.get(0).getClass().toString();
        assertEquals(test41Expected, item);
    }

    /**Set 5, sequence 1.
    Method: test51Expected
    Inputs: none
    Returns: void

    Description: Test RemoveItem by removing Meat from cart with meat
     */
    @Test
    public void test51Expected() throws UnderAgeException {
        boolean result = removeItemTest51.removeItem(meat);
        assertEquals(test51Expected, result);
    }

    /**Set 5, sequence 2.
    Method: test52Expected
    Inputs: none
    Returns: void

    Description: Test RemoveItem by removing Meat from cart without meat
     */
    @Test
    public void test52Expected() throws UnderAgeException {
        boolean result = removeItemTest52.removeItem(meat);
        assertEquals(test52Expected, result);
    }
}