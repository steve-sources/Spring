package be.abis.exercice.service;

import be.abis.exercice.model.Course;
import be.abis.exercice.repository.CourseRepository;
import be.abis.exercice.repository.MemoryCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("abis")
public class AbisCourseService implements  CourseService{

    @Autowired
    CourseRepository cr;

    @Override
    public List<Course> findAllCourses() {
        return cr.findAllCourses();
    }

    @Override
    public Course findCourse(int id) {
        return cr.findCourse(id);
    }

    @Override
    public Course findCourse(String shortTitle) {
        return cr.findCourse(shortTitle);
    }

    @Override
    public void addCourse(Course c) {

    }

    @Override
    public void updateCourse(Course c) {

    }

    @Override
    public void deleteCourse(int id) {

    }
}
