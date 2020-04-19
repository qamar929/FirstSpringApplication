package com.qamar.sirstspringspplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class homeController {

    @GetMapping("/")
    public String sayHelloGet()
    {
        return "Hello World from get";
    }


    @PostMapping("/")
    public String sayHelloPost()
    {
        return "Hello World from post";
    }


    @PutMapping("/")
    public String sayHelloPut()
    {
        return "Hello World put";
    }


    @DeleteMapping("/")
    public String sayHelloDelete()
    {
        return "Hello World delete";
    }
}
