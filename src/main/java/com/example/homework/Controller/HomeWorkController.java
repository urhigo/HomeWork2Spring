package com.example.homework.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aboutUs/shop")
public class HomeWorkController {
    @GetMapping
    public String aboutUs(){
        return "aboutShop";
    }
}
