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
public class HandleCharges implements CamperInterface {

    public double camperBalance(double balance, double amount) {
        System.out.println("You have charged $" + amount + " to your account.");
        return balance + amount;
    }

}
