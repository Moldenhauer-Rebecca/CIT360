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
public class HandlePayments implements CamperInterface {

    @Override
    public double camperBalance(double balance, double amount) {
        System.out.println("You paid $" + amount + ".");
        return balance - amount;
    }

}
