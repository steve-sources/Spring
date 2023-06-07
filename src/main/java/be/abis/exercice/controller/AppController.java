package be.abis.exercice.controller;

import be.abis.exercice.service.AbisTrainingService;
import be.abis.exercice.service.PersonService;
import be.abis.exercice.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @Autowired
    private TrainingService trainingService;

    @Autowired
    private PersonService personService;

    @GetMapping("/testaccueil")
    public String home(Model model){

        //model.addAttribute("message",trainingService.getWelcomeMessage());
        //model.addAttribute("message",personService.findPerson(3).getFirstName());
        model.addAttribute("message",personService.findPerson("steve.vanl@google.com","toto").getFirstName());
        return "welcome";
    }

}
