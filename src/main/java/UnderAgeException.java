/*
  File:	  UnderAgeException.java
  Author: Mehlhase
  Date:	  4/4/20
  
  Description: Exception class used to restrict the purchase of alcohol by a minor
*/package main.java;
/**
Class:	UnderAgeException

Description:  Exception that is thrown when a minor attempts to purchase Alcohol
*/
public class UnderAgeException extends Exception {
    public UnderAgeException(String errorMessage) {
        super(errorMessage);
    }
}
