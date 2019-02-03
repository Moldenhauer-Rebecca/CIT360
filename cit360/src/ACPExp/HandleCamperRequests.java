/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACPExp;

import java.util.Scanner;

/**
 *
 * @author crmol
 */
public class HandleCamperRequests {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CamperHandler camperBalance = new CamperHandler();
        double balance = (int) (Math.random() * 101 + 67);
        double amount;
        String request;

        //simplified user menu
        System.out.println("Please enter your slection");
        System.out.println("To see your current camper balance: B\n"
                + "                 To make a payment: P\n"
                + "          To charge to your acount: C\n"
                + "                           To exit: Q");

        request = input.nextLine().toUpperCase();
  
       

        while (!"Q".equals(request)) {

            switch (request) {

                case "B":
                    balance = camperBalance.handleRequest(request, balance, 0);
                    break;

                case "P":
                    System.out.println("Please enter the amount you would like to pay on your account.");
                    amount = Integer.parseInt(input.nextLine());
                    System.out.println("Thank you for your payment.");
                    balance = camperBalance.handleRequest(request, balance, amount);
                    break;

                case "C":
                    System.out.println("Please enter the amount charged to your account.");
                    amount = Integer.parseInt(input.nextLine());
                    System.out.println("Thank you for your purchase.");
                    balance = camperBalance.handleRequest(request, balance, amount);
                    break;

                default:
                    System.out.println("Please try again with a valid input.");
                    break;

            }

            System.out.println("To see your current balance: B\n"
                    + "To make a payment: P\n"
                    + "To charge to your account: C\n"
                    + "To exit: Q");
            request = input.nextLine();
        }

        System.out.println("Thank you for staying at Java Campground");

    }

}
