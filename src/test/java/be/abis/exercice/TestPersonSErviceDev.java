package be.abis.exercice;

import be.abis.exercice.model.Person;
import be.abis.exercice.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("dev")
public class TestPersonSErviceDev {
    @Autowired
    PersonService ps;

    @Test
    void findPerson(){
        Person person = ps.findPerson("test","test");
        assertEquals("steve",person.getFirstName());

    }
}
