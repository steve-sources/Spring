package be.abis.exercice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
public class TestDataSource {
    @Autowired
    DataSource dataSource;

    @Test
    public void testConnectionViaDataSource(){
        try(Connection c = dataSource.getConnection()){
            System.out.println("connection succeeded via " + c.getMetaData().getDatabaseProductName());
        }catch(SQLException e){
            e.printStackTrace();

        }

    }


}
