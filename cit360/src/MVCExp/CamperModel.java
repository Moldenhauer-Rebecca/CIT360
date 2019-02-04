/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCExp;

import java.util.Objects;

/**
 *
 * @author crmol
 */
public class CamperModel {

    //Class instance variables
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String city;
    private String state;

    //default constructor
    public CamperModel() {

    }

    //overloaded constructor
    public CamperModel(String firstName, String lastName, String phoneNumber,
            String city, String state) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.phoneNumber = phoneNumber;

        this.city = city;

        this.state = state;

    }

//public API properties
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CamperModel other = (CamperModel) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return "Camper " + lastName + ","
                + firstName + "phone number: " + phoneNumber
                + "from " + city + ", " + state;
    }

}
