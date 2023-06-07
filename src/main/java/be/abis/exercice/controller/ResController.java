package be.abis.exercice.controller;

import be.abis.exercice.model.Person;
import be.abis.exercice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResController {
    @Autowired
    private PersonService personService;

    @GetMapping("/persons/{id}")
    public Person fetchPerson(@PathVariable("id") int personId){
        Person p = personService.findPerson(personId);
        return p;
    }



}
