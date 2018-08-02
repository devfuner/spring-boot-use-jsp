package com.devfuner.springbootusejsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String index(Model model) {
        model.addAttribute("name", "devfuner");
        return "sample";
    }
}
