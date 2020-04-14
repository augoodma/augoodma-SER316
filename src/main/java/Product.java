/*
  File:	  Produce.java
  Author: Mehlhase
  Date:	  4/4/20
  
  Description: Parent class for all items that may be added to Cart
*/ 
package main.java;
/**
Class:	Product

Description:  Super class for all Product that may be added to a Cart
*/
public class Product {
    private int cost;

    public Product(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
