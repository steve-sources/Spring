package be.abis.exercice.model;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public final class CourseMapper implements RowMapper<Course> {
    public Course mapRow(ResultSet rs,int rowNum) throws SQLException {
        Course course = new Course();
        course.setCourseId(rs.getString("cid"));
        course.setLongTitle(rs.getString("cltitle"));
        course.setShortTitle(rs.getString("cstitle"));
        course.setNumberOfDays(rs.getInt("cdur"));
        course.setPricePerDay((rs.getDouble("caprice")));
      return course;
    }
}
