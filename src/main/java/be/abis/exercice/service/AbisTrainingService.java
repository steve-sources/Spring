package be.abis.exercice.service;

import be.abis.exercice.model.Course;
import be.abis.exercice.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

//@Service
public class AbisTrainingService implements TrainingService{

    private String welComeMessage;

    @Autowired
    PersonService personService;
    @Autowired
    @Qualifier("abis")
    CourseService courseService;

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public String getWelcomeMessage() {
        return welComeMessage;
    }

   // @Value("Ceci est un message d'acceuil")
    public void setWelComeMessage(String welComeMessage) {
        this.welComeMessage = welComeMessage;
    }

    @Override
    public List<Course> showFollowedCourses(Person person) {
        return null;
    }

    @Override
    public void enrollForSession(Person person, Course course, LocalDate date) {

    }
}
