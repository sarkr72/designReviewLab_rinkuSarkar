
package com.mycompany.csc325_oop_designreview_lab;

public class Address {
    
    private String street;
    private String zip;
    private String city;
    private String state;

    public Address(String street, String zip, String city, String state) {
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", zip=" + zip + ", city=" + city + ", state=" + state + '}';
    }
    
    
}
