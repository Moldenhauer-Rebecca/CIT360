/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonexp;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author crmol
 */
public class JSONexp {

    //Jackson jar files used for object. Referencing the Camper class running
    // the createCamper method. 
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        Camper myCamper = createCamper();

        //write to file camper.json - Serialiation
        try {
            mapper.writeValue(new File("camperReadIn.json"), myCamper);

        } catch (IOException e1) {
            e1.printStackTrace();
        }

        //print json string in console using pretty printer
        try {
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myCamper);
            System.out.println(jsonString);

        } catch (JsonGenerationException e) {
            e.printStackTrace();

        } catch (JsonMappingException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //Deserializtion 
        //Read in JSON string using Jackson. Mapping JSON string to Camper class
        String jsonString2 = "{\"camperID\":2345,\"firstName\":\"Belinda\",\"lastName\":\"Howard\",\"addressObj\":{\"streetAddress\":\"1101 Birch Ave.\",\"city\":\"Richland\",\"state\":\"WA\",\"postalCode\":\"95342\",\"country\":\"USA\"},\"phoneNumber\":\"509-555-5555\"}";
        try {
            Camper myCamper2 = mapper.readValue(jsonString2, Camper.class);
            System.out.println("Camper Name: " + myCamper2.getFirstName() + " " + myCamper2.getLastName() + ", " + "Phone Number: " + myCamper2.getPhoneNumber());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Deserialization. Read in a JSON file using Jackson mapping to JSON file to the camper class
        try {
            Camper myCamper2 = mapper.readValue(new File("camperReadIn.json"), Camper.class);
            System.out.println("Camper Name: " + myCamper.getFirstName() + " " + myCamper2.getLastName() + "," + "Phone Number: " + myCamper2.getPhoneNumber());
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }

    private static Camper createCamper() {

        Camper myCamper = new Camper();
        myCamper.setCamperID(2345);
        myCamper.setFirstName("Brennen");
        myCamper.setLastName("Edwards");
        myCamper.setPhoneNumber("555-555-5555");

        CamperAddress address = new CamperAddress();
        address.setStreetAddress("1101 Wanless Ave.");
        address.setCity("Brampton");
        address.setState("ON");
        address.setPostalCode("l703T4");
        address.setCountry("CANADA");

        myCamper.setAddressObj(address);

        return myCamper;

    }

}
