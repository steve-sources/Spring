package be.abis.exercice.repository;

import be.abis.exercice.model.Course;
import be.abis.exercice.model.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
@Profile("prod")
public class JdbcCourseRepository implements CourseRepository{

    @Autowired
    CourseMapper courseMapper;

    private RowMapper<Course> rowMapper = new BeanPropertyRowMapper<Course>((Course.class));
   // private List<Course> courses = new ArrayList<Course>();

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public List<Course> findAllCourses() {
        List<Course> listCourse = jdbcTemplate.query("select * from abiscourses",courseMapper);
        return listCourse;
    }

    @Override
    public Course findCourse(int id) {
        Course course = jdbcTemplate.queryForObject("select * from abiscourses where cid = ?",courseMapper,""+id);
        return course;
    }

    @Override
    public Course findCourse(String shortTitle) {
        return null;
    }

    public void addCourse(Course c){
        jdbcTemplate.update("insert into abiscourses(cid,cstitle,cltitle,cdur,caprice) values(?,?,?,?,?)",
                c.getCourseId(),c.getShortTitle(),c.getLongTitle(),c.getNumberOfDays(),c.getPricePerDay());
    }
    public void updateCourse(Course c){

    }
    public void deleteCourse(int id){
        jdbcTemplate.update("delete from abiscourses where cid = ?",""+id);
    }
}
