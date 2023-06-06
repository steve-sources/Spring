package be.abis.exercice;

import be.abis.exercice.service.TrainingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestTrainingService {

    @Autowired
    TrainingService ts;

    @Test
    void testWelcomeMessage(){
        assertEquals("Ceci est un message d'acceuil",ts.getWelcomeMessage());
    }

}
