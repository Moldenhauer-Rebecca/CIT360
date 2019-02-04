/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCExp;

//The controller coordinates interactions between the view and model

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author crmol
 */
public class CalculatorController {
    
    private CalculatorView theView;
    private CalculatorModel theModel;
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
  
        this.theView = theView;
        this.theModel = theModel;
        
        //tells the view when the calculate button is clicked to 
        //execute actionPerformed method in CalculateListener inner class
        
        this.theView.addCalculateListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            
            int numOne, numTwo = 0;
            
            //surround interactions with the view with try block to catch errors
            
            try{
                numOne = theView.getNumOne();
                numTwo = theView.getNumTwo();
                
                theModel.addTwoNumbers(numOne, numTwo);
                
                theView.setCalcSolution(theModel.getCalculationValue());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                
                theView.displayErrorMessage("Enter 2 integers");
            }
        }
    }
    
}








//http://www.newthinktank.com/2013/02/mvc-java-tutorial/