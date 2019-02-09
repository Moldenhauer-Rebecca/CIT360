/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//very simple example of the capabilites of HTTPURLConnection class

package HttpConExp;

import java.net.HttpURLConnection;
import java.net.URL;


public class TestHttpUrlConnection {
    
    public static void main(String[] args) {
        try{
            //create object and store data needed to access web page
            URL url=new URL("https://www.bearlake.org");
            
            //open connection method used to communicate with web page
            HttpURLConnection huc=(HttpURLConnection)url.openConnection();
            //for loop to pull header fields - this will pull up the first 10 header fields
            for(int i=1; i<=10;i++) {
                System.out.println(huc.getHeaderFieldKey(i)+ " = " +huc.getHeaderField(i));
            }
            //use disconect method to close the connection
            huc.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
