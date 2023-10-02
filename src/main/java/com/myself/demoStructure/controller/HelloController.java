package com.myself.demoStructure.controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello, World!";
    }
}
