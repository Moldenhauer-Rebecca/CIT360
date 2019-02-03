/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACPExp;

import java.util.HashMap;

/**
 *
 * @author crmol
 */
public class CamperHandler {

    public static HashMap<String, CamperInterface> map = new HashMap<>();

    public void CamperHandler() {

    }

    public double handleRequest(String request, double balance, double amount) {

        map.put("B", new HandleCamperBalance());
        map.put("P", new HandlePayments());
        map.put("C", new HandleCharges());

        CamperInterface handler = map.get(request);
        balance = handler.camperBalance(balance, amount);

        return balance;

    }
}
