package com.example.Balloon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myControler {
    @Autowired
    balloonService bs=new balloonService();

    @GetMapping("/Balloon")
    public String getReq(@RequestParam("Input") String input){
        return String.valueOf(bs.countBalloons(input));
    }

}
