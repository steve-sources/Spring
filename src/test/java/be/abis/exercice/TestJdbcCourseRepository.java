package be.abis.exercice;

import be.abis.exercice.model.Course;
import be.abis.exercice.repository.JdbcCourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class TestJdbcCourseRepository {

    @Autowired
    JdbcCourseRepository jdbcCourseRepository;

    @Test
    void findAllCoursesTest(){
        List<Course> listCourse = new ArrayList<Course>();
        listCourse = jdbcCourseRepository.findAllCourses();
        for (Course course : listCourse){
            System.out.println("Sort Title : " + course.getShortTitle() );
        }
    }



    @Test
    void addCourseTest(){
    jdbcCourseRepository.addCourse(new Course("7902","shortcours","ceci est un test",2,400.00));
    }


    @Test
    void findCourseOnIdTest(){
        Course course = jdbcCourseRepository.findCourse(8006);
        System.out.println("Sort Title : " + course.getShortTitle());
    }

    @Test
    void deleteCourseTest(){
        jdbcCourseRepository.deleteCourse(7902);
    }


}
