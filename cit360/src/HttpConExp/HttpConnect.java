/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HttpConExp;

import java.net.*;
import java.io.*;

public class HttpConnect {

    public static void main(String args[]) throws Exception { //throw an exception for unavailable webpage
        //create object and store data needed to access a web page
        URL websitePage = new URL("https://koa.com/campgrounds/bear-lake/");

        //build connection with a variable called bLakeConnection allowing 
        //communication with web page by opening the connection
        HttpURLConnection bLakeConnection = (HttpURLConnection) websitePage.openConnection();

        //read in code from the HTTP URL connection object as it goes into the buffer using the created connection
        BufferedReader bringInfoIn = new BufferedReader(new InputStreamReader(bLakeConnection.getInputStream()));

        //print out the values. Create string variable.
        String bLakeKOACode; //needed to read the code from the buffer and print it

        while ((bLakeKOACode = bringInfoIn.readLine()) != null) {         //run this string as long as there is code

            if (bLakeKOACode.isEmpty() != true) {
                System.out.println(bLakeKOACode);
            } else {
                System.out.println("Nothing available to print.");
            }

            //Printing will allow us to see the HTML code but will not print external style and coding sheets
        }
        //close session after finished
        bringInfoIn.close(); //close what was opened

    }
}
