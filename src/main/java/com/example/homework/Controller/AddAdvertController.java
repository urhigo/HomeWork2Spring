package com.example.homework.Controller;

import com.example.homework.models.AdvertModel;
import com.example.homework.repos.AdvertRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class AddAdvertController {
    public AddAdvertController(AdvertRepos advertRepos) {
        this.advertRepos = advertRepos;
    }

    final
    AdvertRepos advertRepos;

    @PostMapping("/add")
    public String postData(@RequestParam String name, @RequestParam int price,
                           @RequestParam int weight, @RequestParam String disc,
                           @RequestParam String size) {
        AdvertModel advertModel = new AdvertModel();
        advertModel.setName(name);
        advertModel.setPrice(price);
        advertModel.setWeight(weight);
        advertModel.setDisc(disc);
        advertModel.setSize(size);
        advertRepos.save(advertModel);
        return "aboutShop";
    }

    @GetMapping("/add")
    public String addAdvert() {
        return "AddAdvert";
    }


}
