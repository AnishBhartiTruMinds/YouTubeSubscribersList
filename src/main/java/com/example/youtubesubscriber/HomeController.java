package com.example.youtubesubscriber;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final YouTube youTube;

    public HomeController(YouTube youTube) {
        this.youTube = youTube;
    }

    @GetMapping
    String index(Model model) {

        model.addAttribute("subscribersList",
                youTube.subscribersList(10));
        return "index";
    }
}
