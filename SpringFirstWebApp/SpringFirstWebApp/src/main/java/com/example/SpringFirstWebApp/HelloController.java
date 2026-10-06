package com.example.SpringFirstWebApp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("Bye")
    public String greetBye(){
        return "Bye Bye";
    }
}
