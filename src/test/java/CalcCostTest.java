package test.java;

import main.java.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcCostTest {

    private Cart createCart(int age) throws Exception {
        Cart classUnderTest = new Cart(age);
        return classUnderTest;
    }

    Cart equivTest1;
    Cart equivTest2;
    Cart equivTest3;
    Cart equivTest4;
    Cart equivTest5;
    Cart equivTest6;
    Cart equivTest7;
    Cart equivTest8;
    Cart equivTest9;
    Cart equivTest10;
    Cart equivTest11;
    Cart equivTest12;
    Cart equivTest13;
    Cart equivTest14;
    Cart equivTest15;
    Cart equivTest16;
    Cart equivTest17;
    Cart equivTest18;
    Cart equivTest19;
    Cart equivTest20;
    Cart equivTest21;
    Cart boundaryTest22;
    Cart boundaryTest23;
    Cart boundaryTest24;
    Cart boundaryTest25;
    Cart boundaryTest26;
    Cart boundaryTest27;
    Cart boundaryTest28;
    Cart boundaryTest29;
    Cart boundaryTest30;
    Cart boundaryTest31;
    Cart boundaryTest32;
    Cart boundaryTest33;
    Cart boundaryTest34;
    Cart boundaryTest35;
    Cart boundaryTest36;
    Cart boundaryTest37;
    Cart boundaryTest38;
    Cart boundaryTest39;
    Cart boundaryTest40;
    Cart boundaryTest41;
    Cart boundaryTest42;
    Cart boundaryTest43;
    Cart boundaryTest44;
    Cart boundaryTest45;
    Cart boundaryTest46;
    Cart boundaryTest47;
    Cart boundaryTest48;
    Cart boundaryTest49;

    double test1Expected;
    double test2Expected;
    double test3Expected;
    double test4Expected;
    double test5Expected;
    double test6Expected;
    double test7Expected;
    double test8Expected;
    double test9Expected;
    double test10Expected;
    double test11Expected;
    double test12Expected;
    double test13Expected;
    double test14Expected;
    double test15Expected;
    double test16Expected;
    double test17Expected;
    double test18Expected;
    double test19Expected;
    double test20Expected;
    double test21Expected;
    double test22Expected;
    double test23Expected;
    double test24Expected;
    double test25Expected;
    double test26Expected;
    double test27Expected;
    double test28Expected;
    double test29Expected;
    double test30Expected;
    double test31Expected;
    double test32Expected;
    double test33Expected;
    double test34Expected;
    double test35Expected;
    double test36Expected;
    double test37Expected;
    double test38Expected;
    double test39Expected;
    double test40Expected;
    double test41Expected;
    double test42Expected;
    double test43Expected;
    double test44Expected;
    double test45Expected;
    double test46Expected;
    double test47Expected;
    double test48Expected;
    double test49Expected;

    /**
     * setup before tests.
     * @throws Exception generic exception
     */
    @org.junit.Before
    public void setUp() throws Exception {

        // numAlcohol > 0 && age < 21
        equivTest1 = createCart(18);
        for (int i = 0; i < 1; i++) {
            equivTest1.addItem(new Alcohol());
        }

        test1Expected = 0;

        // numAlcohol > 0 && age >= 21
        equivTest2 = createCart(34);
        for (int i = 0; i < 10; i++) {
            equivTest2.addItem(new Alcohol());
        }

        test2Expected = 86.4;

        // numAlcohol == 0 && age < 21
        equivTest3 = createCart(19);
        for (int i = 0; i < 0; i++) {
            equivTest3.addItem(new Alcohol());
        }

        test3Expected = 0;

        // numAlcohol == 0 && age >= 21
        equivTest4 = createCart(21);
        for (int i = 0; i < 0; i++) {
            equivTest4.addItem(new Alcohol());
        }

        test4Expected = 0;   

        // 0 < numProduce <= 2
        equivTest5 = createCart(25);
        for (int i = 0; i < 2; i++) {
            equivTest5.addItem(new Produce());
        }

        test5Expected = 4.32;

        // numProduce == 3
        equivTest6 = createCart(25);
        for (int i = 0; i < 3; i++) {
            equivTest6.addItem(new Produce());
        }

        test6Expected = 5.4;

        // 3 <= numProduce < 6
        equivTest7 = createCart(25);
        for (int i = 0; i < 5; i++) {
            equivTest7.addItem(new Produce());
        }

        test7Expected = 9.72;

        // numProduce > 6
        equivTest8 = createCart(25);
        for (int i = 0; i < 9; i++) {
            equivTest8.addItem(new Produce());
        }

        test8Expected = 16.2;

        // numAlcohol == 1 && numFrozenFood == 1
        equivTest9 = createCart(25);
        for (int i = 0; i < 1; i++) {
            equivTest9.addItem(new Alcohol());
        }
        for (int i = 0; i < 1; i++) {
            equivTest9.addItem(new FrozenFood());
        }

        test9Expected = 10.8;

        // numAlcohol == 1 && numFrozenFood == 2
        equivTest10 = createCart(25);
        for (int i = 0; i < 1; i++) {
            equivTest10.addItem(new Alcohol());
        }
        for (int i = 0; i < 2; i++) {
            equivTest10.addItem(new FrozenFood());
        }

        test10Expected = 16.2;

        // numAlcohol == 2 && numFrozenFood == 1
        equivTest11 = createCart(25);
        for (int i = 0; i < 2; i++) {
            equivTest11.addItem(new Alcohol());
        }
        for (int i = 0; i < 1; i++) {
            equivTest11.addItem(new FrozenFood());
        }

        test11Expected = 19.44;

        // numAlcohol > 1 && numFrozenFood > 1
        equivTest12 = createCart(25);
        for (int i = 0; i < 2; i++) {
            equivTest12.addItem(new Alcohol());
        }
        for (int i = 0; i < 3; i++) {
            equivTest12.addItem(new FrozenFood());
        }

        test12Expected = 27;

        // numAlcohol > 1 && numFrozenFood > 1 && age == 20
        equivTest13 = createCart(20);
        for (int i = 0; i < 2; i++) {
            equivTest13.addItem(new Alcohol());
        }
        for (int i = 0; i < 3; i++) {
            equivTest13.addItem(new FrozenFood());
        }

        test13Expected = 16.2;

        // numDairy > 0
        equivTest14 = createCart(25);
        for (int i = 0; i < 3; i++) {
            equivTest14.addItem(new Dairy());
        }

        test14Expected = 9.72;

        // numMeat > 0
        equivTest15 = createCart(25);
        for (int i = 0; i < 4; i++) {
            equivTest15.addItem(new Meat());
        }

        test15Expected = 43.2;

        // numFrozenFood > 0
        equivTest16 = createCart(25);
        for (int i = 0; i < 5; i++) {
            equivTest16.addItem(new FrozenFood());
        }

        test16Expected = 27;

        // numDairy < 0
        equivTest17 = createCart(25);
        for (int i = 0; i < 1; i++) {
            equivTest17.removeItem(new Dairy());
        }

        test17Expected = 0;

        // numMeat < 0
        equivTest18 = createCart(25);
        for (int i = 0; i < 2; i++) {
            equivTest18.removeItem(new Meat());
        }

        test18Expected = 0;

        // numProduce < 0
        equivTest19 = createCart(25);
        for (int i = 0; i < 1; i++) {
            equivTest19.removeItem(new Produce());
        }

        test19Expected = 0;

        // numAlcohol < 0
        equivTest20 = createCart(25);
        for (int i = 0; i < 3; i++) {
            equivTest20.removeItem(new Alcohol());
        }

        test20Expected = 0;

        // numFrozenFood < 0
        equivTest21 = createCart(25);
        for (int i = 0; i < 2; i++) {
            equivTest21.removeItem(new FrozenFood());
        }

        test21Expected = 0;

        // numAlcohol == 1
        boundaryTest22 = createCart(25);
        for (int i = 0; i < 100; i++) {
            boundaryTest22.removeItem(new Alcohol());
        }

        test22Expected = 0;

        boundaryTest23 = createCart(25);
        for (int i = 0; i < 0; i++) {
            boundaryTest23.addItem(new Alcohol());
        }

        test23Expected = 0;

        boundaryTest24 = createCart(25);
        for (int i = 0; i < 1; i++) {
            boundaryTest24.addItem(new Alcohol());
        }

        test24Expected = 8.64;

        boundaryTest25 = createCart(25);
        for (int i = 0; i < 100; i++) {
            boundaryTest25.addItem(new Alcohol());
        }

        test25Expected = 864;

        // Age == 21
        boundaryTest26 = createCart(-1);
        for (int i = 0; i < 1; i++) {
            boundaryTest26.addItem(new Alcohol());
        }

        test26Expected = 0;

        boundaryTest27 = createCart(20);
        for (int i = 0; i < 1; i++) {
            boundaryTest27.addItem(new Alcohol());
        }

        test27Expected = 0;

        boundaryTest28 = createCart(21);
        for (int i = 0; i < 1; i++) {
            boundaryTest28.addItem(new Alcohol());
        }

        test28Expected = 8.64;

        boundaryTest29 = createCart(200);
        for (int i = 0; i < 1; i++) {
            boundaryTest29.addItem(new Alcohol());
        }

        test29Expected = 8.64;

        // numProduce == 3
        boundaryTest30 = createCart(25);
        for (int i = 0; i < 300; i++) {
            boundaryTest30.removeItem(new Produce());
        }

        test30Expected = 0;

        boundaryTest31 = createCart(25);
        for (int i = 0; i < 2; i++) {
            boundaryTest31.addItem(new Produce());
        }

        test31Expected = 4.32;

        boundaryTest32 = createCart(25);
        for (int i = 0; i < 3; i++) {
            boundaryTest32.addItem(new Produce());
        }

        test32Expected = 5.4;

        boundaryTest33 = createCart(25);
        for (int i = 0; i < 300; i++) {
            boundaryTest33.addItem(new Produce());
        }

        test33Expected = 540;

        // numFrozenFood == 1
        boundaryTest34 = createCart(25);
        for (int i = 0; i < 20; i++) {
            boundaryTest34.removeItem(new FrozenFood());
        }

        test34Expected = 0;

        boundaryTest35 = createCart(25);
        for (int i = 0; i < 0; i++) {
            boundaryTest35.addItem(new FrozenFood());
        }

        test35Expected = 0;

        boundaryTest36 = createCart(25);
        for (int i = 0; i < 1; i++) {
            boundaryTest36.addItem(new FrozenFood());
        }

        test36Expected = 5.4;

        boundaryTest37 = createCart(25);
        for (int i = 0; i < 20; i++) {
            boundaryTest37.addItem(new FrozenFood());
        }

        test37Expected = 108;

        // numDairy == 1
        boundaryTest38 = createCart(25);
        for (int i = 0; i < 70; i++) {
            boundaryTest38.removeItem(new Dairy());
        }

        test38Expected = 0;

        boundaryTest39 = createCart(25);
        for (int i = 0; i < 0; i++) {
            boundaryTest39.addItem(new Dairy());
        }

        test39Expected = 0;

        boundaryTest40 = createCart(25);
        for (int i = 0; i < 1; i++) {
            boundaryTest40.addItem(new Dairy());
        }

        test40Expected = 3.24;

        boundaryTest41 = createCart(25);
        for (int i = 0; i < 70; i++) {
            boundaryTest41.addItem(new Dairy());
        }

        test41Expected = 226.8;

        // numMeat == 1
        boundaryTest42 = createCart(25);
        for (int i = 0; i < 200; i++) {
            boundaryTest42.removeItem(new Meat());
        }

        test42Expected = 0;

        boundaryTest43 = createCart(25);
        for (int i = 0; i < 0; i++) {
            boundaryTest43.addItem(new Meat());
        }

        test43Expected = 0;

        boundaryTest44 = createCart(25);
        for (int i = 0; i < 1; i++) {
            boundaryTest44.addItem(new Meat());
        }

        test44Expected = 10.8;

        boundaryTest45 = createCart(25);
        for (int i = 0; i < 200; i++) {
            boundaryTest45.addItem(new Meat());
        }

        test45Expected = 2160;

        // numAlcohol == 1 && numFrozenFood == 1
        boundaryTest46 = createCart(25);
        for (int i = 0; i < 500; i++) {
            boundaryTest46.removeItem(new Alcohol());
        }
        for (int i = 0; i < 500; i++) {
            boundaryTest46.removeItem(new FrozenFood());
        }

        test46Expected = 0;

        boundaryTest47 = createCart(25);
        for (int i = 0; i < 0; i++) {
            boundaryTest47.addItem(new Alcohol());
        }
        for (int i = 0; i < 0; i++) {
            boundaryTest47.addItem(new FrozenFood());
        }

        test47Expected = 0;

        boundaryTest48 = createCart(25);
        for (int i = 0; i < 1; i++) {
            boundaryTest48.addItem(new Alcohol());
        }
        for (int i = 0; i < 1; i++) {
            boundaryTest48.addItem(new FrozenFood());
        }

        test48Expected = 10.8;

        boundaryTest49 = createCart(25);
        for (int i = 0; i < 500; i++) {
            boundaryTest49.addItem(new Alcohol());
        }
        for (int i = 0; i < 500; i++) {
            boundaryTest49.addItem(new FrozenFood());
        }

        test49Expected = 5400;
    }

    @Test(expected = UnderAgeException.class)
    public void calcCost1() throws UnderAgeException {
        double amount = equivTest1.calcCost();
        assertEquals(test1Expected, amount, .01);
    }

    @Test
    public void calcCost2() throws UnderAgeException {
        double amount = equivTest2.calcCost();
        assertEquals(test2Expected, amount, .01);
    }

    @Test
    public void calcCost3() throws UnderAgeException {
        double amount = equivTest3.calcCost();
        assertEquals(test3Expected, amount, .01);
    }

    @Test
    public void calcCost4() throws UnderAgeException {
        double amount = equivTest4.calcCost();
        assertEquals(test4Expected, amount, .01);
    }

    @Test
    public void calcCost5() throws UnderAgeException {
        double amount = equivTest5.calcCost();
        assertEquals(test5Expected, amount, .01);
    }

    @Test
    public void calcCost6() throws UnderAgeException {
        double amount = equivTest6.calcCost();
        assertEquals(test6Expected, amount, .01);
    }

    @Test
    public void calcCost7() throws UnderAgeException {
        double amount = equivTest7.calcCost();
        assertEquals(test7Expected, amount, .01);
    }

    @Test
    public void calcCost8() throws UnderAgeException {
        double amount = equivTest8.calcCost();
        assertEquals(test8Expected, amount, .01);
    }

    @Test
    public void calcCost9() throws UnderAgeException {
        double amount = equivTest9.calcCost();
        assertEquals(test9Expected, amount, .01);
    }

    @Test
    public void calcCost10() throws UnderAgeException {
        double amount = equivTest10.calcCost();
        assertEquals(test10Expected, amount, .01);
    }

    @Test
    public void calcCost11() throws UnderAgeException {
        double amount = equivTest11.calcCost();
        assertEquals(test11Expected, amount, .01);
    }

    @Test
    public void calcCost12() throws UnderAgeException {
        double amount = equivTest12.calcCost();
        assertEquals(test12Expected, amount, .01);
    }

    @Test(expected = UnderAgeException.class)
    public void calcCost13() throws UnderAgeException {
        double amount = equivTest13.calcCost();
        assertEquals(test13Expected, amount, .01);
    }

    @Test
    public void calcCost14() throws UnderAgeException {
        double amount = equivTest14.calcCost();
        assertEquals(test14Expected, amount, .01);
    }

    @Test
    public void calcCost15() throws UnderAgeException {
        double amount = equivTest15.calcCost();
        assertEquals(test15Expected, amount, .01);
    }

    @Test
    public void calcCost16() throws UnderAgeException {
        double amount = equivTest16.calcCost();
        assertEquals(test16Expected, amount, .01);
    }

    @Test
    public void calcCost17() throws UnderAgeException {
        double amount = equivTest17.calcCost();
        assertEquals(test17Expected, amount, .01);
    }

    @Test
    public void calcCost18() throws UnderAgeException {
        double amount = equivTest18.calcCost();
        assertEquals(test18Expected, amount, .01);
    }

    @Test
    public void calcCost19() throws UnderAgeException {
        double amount = equivTest19.calcCost();
        assertEquals(test19Expected, amount, .01);
    }

    @Test
    public void calcCost20() throws UnderAgeException {
        double amount = equivTest20.calcCost();
        assertEquals(test20Expected, amount, .01);
    }

    @Test
    public void calcCost21() throws UnderAgeException {
        double amount = equivTest21.calcCost();
        assertEquals(test21Expected, amount, .01);
    }

    @Test
    public void calcCost22() throws UnderAgeException {
        double amount = boundaryTest22.calcCost();
        assertEquals(test22Expected, amount, .01);
    }

    @Test
    public void calcCost23() throws UnderAgeException {
        double amount = boundaryTest23.calcCost();
        assertEquals(test23Expected, amount, .01);
    }

    @Test
    public void calcCost24() throws UnderAgeException {
        double amount = boundaryTest24.calcCost();
        assertEquals(test24Expected, amount, .01);
    }

    @Test
    public void calcCost25() throws UnderAgeException {
        double amount = boundaryTest25.calcCost();
        assertEquals(test25Expected, amount, .01);
    }

    @Test(expected = UnderAgeException.class)
    public void calcCost26() throws UnderAgeException {
        double amount = boundaryTest26.calcCost();
        assertEquals(test26Expected, amount, .01);
    }

    @Test(expected = UnderAgeException.class)
    public void calcCost27() throws UnderAgeException {
        double amount = boundaryTest27.calcCost();
        assertEquals(test27Expected, amount, .01);
    }

    @Test
    public void calcCost28() throws UnderAgeException {
        double amount = boundaryTest28.calcCost();
        assertEquals(test28Expected, amount, .01);
    }

    @Test
    public void calcCost29() throws UnderAgeException {
        double amount = boundaryTest29.calcCost();
        assertEquals(test29Expected, amount, .01);
    }

    @Test
    public void calcCost30() throws UnderAgeException {
        double amount = boundaryTest30.calcCost();
        assertEquals(test30Expected, amount, .01);
    }

    @Test
    public void calcCost31() throws UnderAgeException {
        double amount = boundaryTest31.calcCost();
        assertEquals(test31Expected, amount, .01);
    }

    @Test
    public void calcCost32() throws UnderAgeException {
        double amount = boundaryTest32.calcCost();
        assertEquals(test32Expected, amount, .01);
    }

    @Test
    public void calcCost33() throws UnderAgeException {
        double amount = boundaryTest33.calcCost();
        assertEquals(test33Expected, amount, .01);
    }

    @Test
    public void calcCost34() throws UnderAgeException {
        double amount = boundaryTest34.calcCost();
        assertEquals(test34Expected, amount, .01);
    }

    @Test
    public void calcCost35() throws UnderAgeException {
        double amount = boundaryTest35.calcCost();
        assertEquals(test35Expected, amount, .01);
    }

    @Test
    public void calcCost36() throws UnderAgeException {
        double amount = boundaryTest36.calcCost();
        assertEquals(test36Expected, amount, .01);
    }

    @Test
    public void calcCost37() throws UnderAgeException {
        double amount = boundaryTest37.calcCost();
        assertEquals(test37Expected, amount, .01);
    }

    @Test
    public void calcCost38() throws UnderAgeException {
        double amount = boundaryTest38.calcCost();
        assertEquals(test38Expected, amount, .01);
    }

    @Test
    public void calcCost39() throws UnderAgeException {
        double amount = boundaryTest39.calcCost();
        assertEquals(test39Expected, amount, .01);
    }

    @Test
    public void calcCost40() throws UnderAgeException {
        double amount = boundaryTest40.calcCost();
        assertEquals(test40Expected, amount, .01);
    }

    @Test
    public void calcCost41() throws UnderAgeException {
        double amount = boundaryTest41.calcCost();
        assertEquals(test41Expected, amount, .01);
    }

    @Test
    public void calcCost42() throws UnderAgeException {
        double amount = boundaryTest42.calcCost();
        assertEquals(test42Expected, amount, .01);
    }

    @Test
    public void calcCost43() throws UnderAgeException {
        double amount = boundaryTest43.calcCost();
        assertEquals(test43Expected, amount, .01);
    }

    @Test
    public void calcCost44() throws UnderAgeException {
        double amount = boundaryTest44.calcCost();
        assertEquals(test44Expected, amount, .01);
    }

    @Test
    public void calcCost45() throws UnderAgeException {
        double amount = boundaryTest45.calcCost();
        assertEquals(test45Expected, amount, .01);
    }

    @Test
    public void calcCost46() throws UnderAgeException {
        double amount = boundaryTest46.calcCost();
        assertEquals(test46Expected, amount, .01);
    }

    @Test
    public void calcCost47() throws UnderAgeException {
        double amount = boundaryTest47.calcCost();
        assertEquals(test47Expected, amount, .01);
    }

    @Test
    public void calcCost48() throws UnderAgeException {
        double amount = boundaryTest48.calcCost();
        assertEquals(test48Expected, amount, .01);
    }

    @Test
    public void calcCost49() throws UnderAgeException {
        double amount = boundaryTest49.calcCost();
        assertEquals(test49Expected, amount, .01);
    }
}