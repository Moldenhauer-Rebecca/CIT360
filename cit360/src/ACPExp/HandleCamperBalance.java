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
public class HandleCamperBalance implements CamperInterface {

    /**
     *
     * @param balance
     * @param amount
     * @return
     */
    @Override
    public double camperBalance(double balance, double amount) {

        System.out.println("Camper balance is $ " + balance + ".");

        return balance;

    }

}
