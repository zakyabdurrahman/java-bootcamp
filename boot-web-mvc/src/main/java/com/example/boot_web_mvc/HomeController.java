package com.example.boot_web_mvc;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String home() {
        return "index";
    }
}
