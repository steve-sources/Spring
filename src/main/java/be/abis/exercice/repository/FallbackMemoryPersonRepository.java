package be.abis.exercice.repository;

import be.abis.exercice.model.Address;
import be.abis.exercice.model.Company;
import be.abis.exercice.model.Course;
import be.abis.exercice.model.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;

@Repository
//@Profile("prod")
@ConditionalOnMissingBean(FilePersonRepository.class)
public class FallbackMemoryPersonRepository implements PersonRepository {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public FallbackMemoryPersonRepository() {
        System.out.println("Passe dans le fallback");
        persons.add(new Person(1,"John","Doe",35,"jdoe@abis.be","def456","nl",new Company("Abis","016/245610","BE 0428.407.725",new Address("Diestsevest","leuven","3000",32))));
        persons.add(new Person(2,"Mary","Jones",27,"mjones@abis.be","abc123","fr",new Company("Abis","016/245610","be",new Address("Diestsevest","leuven","3000",32))));
        persons.add(new Person(2,"Bob","Smith",27,"mjones@abis.be","abc123","fr",new Company("Abis","016/245610","be",new Address("Diestsevest","leuven","3000",32))));
//        2;Mary;Jones;27;mjones@abis.be;abc123;fr;Abis;016/245610;;;32;3000;Leuven
  //      3;Bob;Smith;53;bob.smith@oracle.com;abc986;en;Oracle;02/7191211;BE 0440.966.354;Medialaan;50;1800;Vilvoorde


    }

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
        return null;
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
