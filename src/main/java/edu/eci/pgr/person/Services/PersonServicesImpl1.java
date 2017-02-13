package edu.eci.pgr.person.Services;

import edu.eci.pgr.person.Entities.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alejandra on 12/02/17.
 */
public class PersonServicesImpl1 implements PersonServices{

    private List<Person> persons=new ArrayList<>();

    @Override
    public List<Person> getPersons() {
        return persons;
    }

    @Override
    public void addPerson(Person p) {
        persons.add(p);
    }

    @Override
    public Person getPerson(String name) {
        Person ans=null;
        for (Person p: persons) {
            if(p.getFirstName().equals(name)){
                ans=p;
                break;
            }
        }
        return ans;
    }
}
