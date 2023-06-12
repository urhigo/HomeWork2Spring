package com.example.homework.Controller;

import com.example.homework.models.AdvertModel;
import com.example.homework.repos.AdvertRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/all")
public class AllAdvertController {
    final
    AdvertRepos advertRepos;

    public AllAdvertController(AdvertRepos advertRepos) {
        this.advertRepos = advertRepos;
    }

    @GetMapping
    public String getAdverts(Model model){
        List<AdvertModel> list =new ArrayList<>();
        list = (List<AdvertModel>) advertRepos.findAll();
        model.addAttribute("allAdverts", list);
        return "AllAdvert";
    }
}
