/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCExp;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author crmol
 */
public class Main {

    private static ArrayList<CamperModel> campers;

    public static void main(String[] args) {

        try {
            initializeJavaCollections();
            initializeMVC();

        } catch (Exception e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();
        }
    }

    public static void initializeMVC() {
        //Initial Camper Controller
        CamperController ctrl = new CamperController(campers);
        ctrl.startApplication();
    }

    public static void initializeJavaCollections() {
        //initialize collection
        campers = new ArrayList<>();
        initializeAndLoadCamper();

        //interate through camper collection and print each one
        printCampers();

        System.out.println();

        //initialize camper needed to fin in the ArrayList
        CamperModel corbincurtis = new CamperModel("Corbin", "Curtis", "505-555-5555", "Kennewick", "Washington");

        //loop through camper collection to find camper
        findCamper(corbincurtis);

        System.out.println();
    }

    public static void initializeAndLoadCamper() {

        //add collection elements
        campers.add(new CamperModel("Corbin", "Curtis", "509-555-5555", "Kennewick", "Washington"));
        campers.add(new CamperModel("Drew", "Richards", "555-555-5555", "Bosie", "Idaho"));

        CamperModel brother = new CamperModel();
        brother.setFirstName("Jake");
        brother.setLastName("Walker");
        brother.setPhoneNumber("206-345-6576");
        brother.setCity("Lakewood");
        brother.setState("Washington");

        CamperModel sister = new CamperModel();
        sister.setFirstName("Belinda");
        sister.setLastName("Howard");
        sister.setPhoneNumber("801-456-7777");
        sister.setCity("Lehi");
        sister.setState("Utah");

        campers.add(brother);
        campers.add(sister);
    }

    //Iterate through collection and print elements
    public static void printCampers() {

        Iterator<CamperModel> iterator = campers.iterator();

        while (iterator.hasNext()) {
            CamperModel camper = (CamperModel) iterator.next();
            System.out.println(camper);
        }
    }

    //Loop through collection and find mating elements
    public static void findCamper(CamperModel findCamper) {

        campers.stream().filter((currentCamper) -> (findCamper.equals(currentCamper))).map((currentCamper) -> {
            System.out.println("Camper match found.");
            return currentCamper;
        }).forEach((currentCamper) -> {
            System.out.println("Camper " + currentCamper.getFirstName()
                    + currentCamper.getLastName() + " and "
                    + findCamper.getFirstName() + findCamper.getLastName() + " are equal");
        });
    }

}
