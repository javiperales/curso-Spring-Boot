package com.javi.curso.springboot.webapp.springbootweb.controllers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javi.curso.springboot.webapp.springbootweb.models.User;
import com.javi.curso.springboot.webapp.springbootweb.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping("/api")
public class UserRestController {

@GetMapping("/details")

@ResponseBody
public UserDto details(){
    User user = new User("Javi","Perales");
    UserDto userDto = new UserDto();
    userDto.setUser(user);
    userDto.setTitle("Hola Mundo");


    return userDto;
}

@GetMapping("/list")
public List<User> list(){
    User user = new User("Javi","Perales");
    User user2 = new User("Jessica","Mora");
    User user3 = new User("Jonh","Doe");

    List<User> users = new ArrayList<>();
    users.add(user);
    users.add(user2);
    users.add(user3);
    return users;
}


@GetMapping("/details-map")

@ResponseBody
public Map<String, Object> detailsMap(){
    User user = new User("Javi","Perales");

   Map<String, Object> body = new HashMap<>();
    body.put("title", "Hola Mundo");
    body.put("user", user);

    return body;
}



}
