package org.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/sayhi")
    public String sayhi(){
        return "hello,SpringBoot";
    }


}