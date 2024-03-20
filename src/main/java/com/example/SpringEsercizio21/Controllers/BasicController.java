package com.example.SpringEsercizio21.Controllers;

import com.example.SpringEsercizio21.Services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BasicController {

    @Autowired
    BasicService basicService;

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping("/")
    public String getWelcome(){
        logger.info("This is a welcome message from the logger ");
        return "Hey! Welcome this is the message from the Controller";
    }

    @GetMapping("/exp")
    public Integer getExponent(){
        return basicService.calculateExponent();
    }

    @GetMapping("/get-errors")
    public void getError(){
        Error error = new Error("ERROR DETECTED:)");
        logger.error("An Errore will be shown here and than logged: ", error);
    }

}
