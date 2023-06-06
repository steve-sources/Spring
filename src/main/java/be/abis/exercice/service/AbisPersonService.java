package be.abis.exercice.service;

import be.abis.exercice.model.Person;
import be.abis.exercice.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
@Profile("prod")
public class AbisPersonService implements PersonService {

    @Autowired
    PersonRepository pr;

    @Override
    public ArrayList<Person> getAllPersons() {
        return pr.getAllPersons();
    }

    @Override
    public Person findPerson(int id) {
        return pr.findPerson(id);
    }

    @Override
    public Person findPerson(String emailAddress, String passWord) {
        return pr.findPerson(emailAddress,passWord);
    }

    @Override
    public void addPerson(Person p) throws IOException {
        pr.addPerson(p);

    }

    @Override
    public void deletePerson(int id) {

    }

    @Override
    public void changePassword(Person p, String newPswd) throws IOException {

    }
}
