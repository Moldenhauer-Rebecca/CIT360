/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCExp;

//The View's job is to display what the user sees. 
//The view doesn't perform calculations, but passes information 
//entered by the user to whomever needs it.

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author crmol
 */
public class CalculatorView extends JFrame {
    
    private JTextField numOne = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField numTwo = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);
    
    CalculatorView(){
        
        //set up the view and adds components
        
        JPanel calcPanel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        
        calcPanel.add(numOne);
        calcPanel.add(additionLabel);
        calcPanel.add(numTwo);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        
        this.add(calcPanel);
        
        //end of setting up components
    }
    
    public int getNumOne() {
        return Integer.parseInt(numOne.getText());
    }
    
    public int getNumTwo() {
        return Integer.parseInt(numTwo.getText());
    }
    
    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
        
    }
   
    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }
    
    //If calculation Button is clicked execute method
    //in the controller actionPerformed
    void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenForCalcButton);
    }
    
    //Open popup containing error message passed
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    
}


//http://www.newthinktank.com/2013/02/mvc-java-tutorial/
