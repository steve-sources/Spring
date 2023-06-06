package be.abis.exercice;

import be.abis.exercice.model.Course;
import be.abis.exercice.repository.CourseRepository;
import be.abis.exercice.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestCourseService {

    @Autowired
    @Qualifier("abis")
     CourseService cr;

    @Test
    public void findCourse() {
        Course courseTitle = cr.findCourse(7900);
        assertEquals("Workshop SQL",courseTitle.getShortTitle());

    }




}
