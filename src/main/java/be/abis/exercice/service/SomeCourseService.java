package be.abis.exercice.service;

import be.abis.exercice.model.Course;
import be.abis.exercice.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("some")
public class SomeCourseService implements CourseService{

    @Override
    public List<Course> findAllCourses() {
        return null;
    }

    @Override
    public Course findCourse(int id) {
        return (new Course("7900","Test Course","Test Course",3,475.0));
    }

    @Override
    public Course findCourse(String shortTitle) {

        return (new Course("7900","Test Course","Test Course",3,475.0));
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
