package edu.eci.pgr.person.Controller;

import edu.eci.pgr.person.Entities.Person;
import edu.eci.pgr.person.Services.PersonServices;
import edu.eci.pgr.person.Services.PersonServicesImpl1;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by alejandra on 12/02/17.
 */
@RestController
@RequestMapping("/persons")
public class PersonController {

    private PersonServices services=new PersonServicesImpl1();

    @RequestMapping(value ="/check", method = RequestMethod.GET)
    public String check(){
        return "REST USUARIOS FUNCIONA!!";
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getPersons(){
        return services.getPersons();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable("name") String name){
        return services.getPerson(name);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> postPerson(@RequestBody(required = true) Person p){
        services.addPerson(p);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
