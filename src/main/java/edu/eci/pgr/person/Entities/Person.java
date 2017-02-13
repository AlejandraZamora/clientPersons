package edu.eci.pgr.person.Entities;

import java.util.List;

/**
 * Created by alejandra on 12/02/17.
 */
public class Person {

    private String name;
    private String firstName;
    private List<Person> friends;
    private Address address;

    public Person(){}

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public List<Person> getFriends() {
        return this.friends;
    }

    public void setFriends(final List<Person> friends) {
        this.friends = friends;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public String getFullName() {
        return ((this.firstName + " ") + this.name);
    }

}
