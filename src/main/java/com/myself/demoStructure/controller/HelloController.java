package com.myself.demoStructure.controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello, World!";
    }
}
