package com.javi.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.javi.curso.springboot.webapp.springbootweb.models.User;


@Controller
public class UserController {

@GetMapping("/details")
public String details(Model model){

    User user = new User("Javi","Perales");
    user.setEmail("javiperales94@sdfsd.com");
    model.addAttribute("title", "Hola Mundo");
    model.addAttribute("user", user);
    return "details";
}


@GetMapping("/list")
public String list(ModelMap model){


//model.addAttribute("users", users);
model.addAttribute("title", "Listado de usuarios");
return "list";
}


@ModelAttribute("users")
public List<User> usermodel(){
    List<User> users =  Arrays.asList(
        new User("Pepa", "Gonzalez"),
        new User ("Lola", "Roe", "Lola@gmail.com"),
        new User("Jon", "Doe"));

        return users;

}

}
