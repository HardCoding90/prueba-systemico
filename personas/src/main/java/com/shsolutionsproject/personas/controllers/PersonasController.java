package com.shsolutionsproject.personas.controllers;

import com.shsolutionsproject.modelsfactory.models.Example;
import com.shsolutionsproject.modelsfactory.models.Person;
import com.shsolutionsproject.modelsfactory.parentobjects.BasicServices;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonasController extends BasicServices {

    private final String MALE = "male";
    private final String FEMALE = "female";

    @Value("${url}")
    String URL;

    @GetMapping("/obtenerPersonas")
    public HashMap<String, List<Person>> saludoPersonas() {
        Example apiObject = new RestTemplateBuilder().build().getForObject
                (URL, Example.class);
        if (apiObject == null) return new HashMap<>();
        HashMap<String, List<Person>> groupByGender = new HashMap<>();
        List<Person> men = new ArrayList<>();
        List<Person> women = new ArrayList<>();
        apiObject.getResults().forEach(x -> {
            switch (x.getGender()){
                case MALE:
                    men.add(x);
                    break;
                case FEMALE:
                    women.add(x);
                    break;
            }
        });

        addList(groupByGender,men,women);
        return groupByGender;
    }

    private void addList(HashMap<String, List<Person>> groupByGender,
                         List<Person> men, List<Person> women){
        men.sort(Comparator.comparing(x -> x.getDob().getAge()));
        women.sort(Comparator.comparing(Person::getEmail).reversed());
        groupByGender.put(MALE,men);
        groupByGender.put(FEMALE,women);
    }

}