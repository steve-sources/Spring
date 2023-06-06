package be.abis.exercice;

import be.abis.exercice.model.Address;
import be.abis.exercice.model.Company;
import be.abis.exercice.model.Course;
import be.abis.exercice.model.Person;
import be.abis.exercice.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("prod")
public class TestPersonService {

    @Autowired
    PersonService ps;

    @Test
    void findPerson(){
        Person person = ps.findPerson(3);
        assertEquals("Bob",person.getFirstName());

    }

    @Test
    void addPerson() throws IOException {
        Address address = new Address("rue du parc","jemappes","7000",20);
        Course course = new Course("Java Training","JavaT","Java Training",10,250.00);
        Company company = new Company("BNP","0457","13453",address);
        Person p = new Person(1,"Vanbel","Steve",45,"steve.vanl@google.com","toto","fr",company);
        ps.addPerson(p);
    }

}
