/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonexp;


/**
 *
 * @author crmol
 */
public class Camper {

    public int camperID;
    public String firstName;
    public String lastName;
    public CamperAddress addressObj;
    public String phoneNumber;

    public int getCamperID() {
        return camperID;
    }

    public void setCamperID(int camperID) {
        this.camperID = camperID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CamperAddress getAddressObj() {
        return addressObj;
    }

    public void setAddressObj(CamperAddress addressObj) {
        this.addressObj = addressObj;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
