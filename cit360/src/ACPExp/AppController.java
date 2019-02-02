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
public class AppController {
    public static HashMap<String,BalanceDue> hashMapOfCommands = new HashMap<>();
    
    public void AppController(){
        
    }
    
    public static void handleCommand(String command, double balanceDue, double amount){
        
        hashMapOfCommands.put("+", new AddToCart());
        hashMapOfCommands.put("*", new Multiply());
        hashMapOfCommands.put("/", new Divide());
        hashMapOfCommands.put("-", new DiscountsGiven());
        
        BalanceDue handler = hashMapOfCommands.get(command);
        
        handler.execute(balanceDue, amount);
        
    }
    
}
