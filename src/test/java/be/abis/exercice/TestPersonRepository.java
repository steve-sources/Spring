package be.abis.exercice;

import be.abis.exercice.model.Person;
import be.abis.exercice.repository.FilePersonRepository;
import be.abis.exercice.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestPersonRepository {

	@Autowired
	PersonRepository pr;
	
	@Test
	public void startSizeOfFileIs3() {
		int size = pr.getAllPersons().size();
		assertEquals(4,size);
	}
	
	@Test
	public void person1isJohn() {
		Person p = pr.findPerson(1);
		assertEquals("John",p.getFirstName());
	}
	
	@Test
	public void personViaMailAndPwdisMary() {
		Person p = pr.findPerson("mjones@abis.be","abc123");
		assertEquals("Mary",p.getFirstName());
	}
	
	

}
