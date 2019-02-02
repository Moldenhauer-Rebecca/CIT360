/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACPExp;

/**
 *
 * @author crmol
 */
public class DiscountsGiven implements BalanceDue {
    
        public void execute(double balanceDue, double amount) {
            double sum = balanceDue - amount;
            System.out.println(sum);
        }
    }
    

