package com.btna.name.models;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;


    public class Greeting {

    //Properties
        private String name;
        private LocalTime timeOfDay;



    public Greeting(String name, LocalTime timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }
    public Greeting(){
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(LocalTime timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
