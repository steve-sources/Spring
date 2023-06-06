package be.abis.exercice;

import be.abis.exercice.model.Person;
import be.abis.exercice.service.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:my.properties")
public class SpringExercicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExercicesApplication.class, args);
    }

    @Bean
    public TrainingService trainingService(PersonService ps, @Qualifier("abis") CourseService cs){
        AbisTrainingService abistrainingService = new AbisTrainingService();
        abistrainingService.setCourseService(cs);
        abistrainingService.setPersonService(ps);
        abistrainingService.setWelComeMessage(("Ceci est un message d'acceuil"));
        return abistrainingService;
    }

 /*   public PersonService personService(){
        AbisPersonService abisPersonService = new AbisPersonService();
        return abisPersonService;
    } */
}


