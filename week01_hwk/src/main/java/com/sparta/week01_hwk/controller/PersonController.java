package com.sparta.week01_hwk.controller;

import com.sparta.week01_hwk.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("이지수");
        person.setAddress("경기도");
        person.setAge(25);
        person.setJob("학생");
        return person;
    }
}
