package edu.eci.pgr.person.Services;

import edu.eci.pgr.person.Entities.Person;

import java.util.List;

/**
 * Created by alejandra on 12/02/17.
 */
public interface PersonServices {

    public List<Person> getPersons();
    public void addPerson(Person p);
    public Person getPerson(String name);

}
