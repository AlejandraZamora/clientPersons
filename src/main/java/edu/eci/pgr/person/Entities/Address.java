package edu.eci.pgr.person.Entities;

/**
 * Created by alejandra on 12/02/17.
 */
public class Address {

    private String street;
    private String zip;
    private String city;

    public String getStreet() {
        return this.street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(final String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }
}
