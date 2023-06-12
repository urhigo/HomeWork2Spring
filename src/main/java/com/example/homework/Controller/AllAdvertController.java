package com.example.homework.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AllAdvertController {
    @GetMapping("/all")
    public String allAdvert(){
        return "AllAdvert";
    }
}
