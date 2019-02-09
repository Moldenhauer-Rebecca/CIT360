/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HttpConExp;

import java.io.*;
import java.net.*;
import java.sql.Connection; //imports the connection to a database
import java.sql.DriverManager; //needed to pass infomation in and out of a database

public class HttpConnectDatabase {

    public static void main(String[] args) {
        /*    
         HttpURLConnection can also be used to connect to a database 
         If you didn't need a password to read data you would use 
         URL urlDB = new URL("http:https://www.yoururl.com"); //example url
         HttpURLConnection urlDbaseCon = (HttpURLConnection) urlDB.openConnection();
         urlDbase.connect(); //seeks to connecto to the above defined url
        
         InputStream incomingInfo = urlDbaseCon.getInputStream(); //read data from database
        
         System.out.println(incomingInfo);
         */

        //This is if your database has specific drivers
        try {

            String serverName = "localhost"; //localhost, website or ip address of database
            String databaseName = "databaseName"; //name of database to be accessed
            String url = "jdbc:mysql://" + serverName + "/" + databaseName;
            //This concatonates the information with the JDBC connection code to use below when accessing the database

            String username = "username"; //takes username for web-site above
            String password = "password"; //takes the password for database above

            //driver manager helps you to connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            //passes needed information to connect to the URL and login in. If successful it prints out connection
            //If it passes it will say True or False if the connection is closed
            //If it fails, the catch statement will come into play. 
            //Other methods include .create, .commit, etc
            System.out.println(connection.isClosed());
        } catch (Exception e) {
            System.out.println("Access is denied to the database");
    //the url provided is an example, so it will not be able to print
            //If this was a real database, without the correct credentials access would be denied
        }

    }
}
