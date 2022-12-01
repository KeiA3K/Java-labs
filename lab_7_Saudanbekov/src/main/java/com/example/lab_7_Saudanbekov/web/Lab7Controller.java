package com.example.lab_7_Saudanbekov.web;

import com.example.lab_7_Saudanbekov.core.Lab7Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lab7Controller {
    Lab7Service service;

    public Lab7Controller(Lab7Service service){
        this.service = service;
    }

    @GetMapping("/hello-world")
    public String getHelloWorldText() {
        return service.getHelloText();
    }

    @GetMapping("/file")
    public String getTextFromFile(@RequestParam String fileName){
        return service.getTextFromFile(fileName);
    }
}
