package com.javi.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.javi.curso.springboot.webapp.springbootweb.models.dto.ParamDto;
import com.javi.curso.springboot.webapp.springbootweb.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/api/params")

public class RequestParamsController {

@GetMapping("/foo")
public ParamDto foo(@RequestParam String message){
    
    ParamDto param = new ParamDto();
    param.setMessage(message);

    return param;

}

@GetMapping("/bar")
public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code){ 

ParamMixDto params = new ParamMixDto();
params.setMessage(text);
params.setCode(code);
return params;

}

@GetMapping("/request")
public ParamMixDto request(HttpServletRequest request){

ParamMixDto params = new ParamMixDto();
params.setCode(Integer.parseInt(request.getParameter("code")));
params.setMessage(request.getParameter("message"));

return params;

}

}
