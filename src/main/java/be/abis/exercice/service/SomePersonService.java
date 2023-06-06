package be.abis.exercice.service;

import be.abis.exercice.model.Address;
import be.abis.exercice.model.Company;
import be.abis.exercice.model.Person;
import be.abis.exercice.service.PersonService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
@Profile("dev")
public class SomePersonService implements PersonService {
    @Override
    public ArrayList<Person> getAllPersons() {
        return null;
    }

    @Override
    public Person findPerson(int id) {
        return null;
    }

    @Override
    public Person findPerson(String emailAddress, String passWord) {
        return (new Person(3,"steve","vanbel",53,"smith@oracle.com","abc986","FR",new Company("BNP","045881202222","12345",new Address("rue","ville","700",1))));

    }

    @Override
    public void addPerson(Person p) throws IOException {

    }

    @Override
    public void deletePerson(int id) {

    }

    @Override
    public void changePassword(Person p, String newPswd) throws IOException {

    }
}
