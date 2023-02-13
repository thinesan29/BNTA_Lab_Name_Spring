package com.btna.name.controllers;

import com.btna.name.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
//    @GetMapping
//    public String greeting(@RequestParam(value = "name") String name){
//        return String.format("Good Afternoon %s",name);
//    }

    @GetMapping
    public Greeting greeting(@RequestParam(value = "name") String name){
        Greeting greeting = new Greeting(name, LocalTime.of(12,12));
        return greeting;
    }

}
