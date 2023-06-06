package be.abis.exercice.service;

import be.abis.exercice.model.Course;

import java.time.LocalDate;
import java.util.List;

import be.abis.exercice.model.Person;

public interface TrainingService {
    public String getWelcomeMessage();
    public List<Course> showFollowedCourses(Person person);
    public void enrollForSession(Person person, Course course, LocalDate date);

}
