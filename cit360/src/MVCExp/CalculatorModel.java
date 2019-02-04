/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCExp;

//the model performs all the calculations needed. It doesn't know the view exits

/**
 *
 * @author crmol
 */
public class CalculatorModel {
    
    //Holds value of the sum of numbers entered into the view
    private int calculationValue;
    
    public void addTwoNumbers(int numOne, int numTwo) {
        
        calculationValue = numOne + numTwo;
    }
    
    public int getCalculationValue() {
        return calculationValue;
    }
}



//http://www.newthinktank.com/2013/02/mvc-java-tutorial/