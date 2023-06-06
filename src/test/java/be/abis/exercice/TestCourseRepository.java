package be.abis.exercice;

import be.abis.exercice.repository.CourseRepository;
import be.abis.exercice.repository.MemoryCourseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class TestCourseRepository {
	
	@Autowired
	CourseRepository cr;
	
	@Test
	public void numberOfCoursesInMemoryIs5() {
		int size = cr.findAllCourses().size();
		assertEquals(5,size);
	}
	
	@Test
	public void courseWithId8050isMaven() {
		String title = cr.findCourse(8050).getShortTitle();
		assertEquals("Maven",title);
	}
	
	

}
