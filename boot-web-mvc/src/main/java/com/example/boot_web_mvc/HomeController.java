package com.example.boot_web_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {


        return "index";
    }

    @GetMapping("add")
    public String add(@RequestParam() Integer num1, @RequestParam() Integer num2, Model model) {
        model.addAttribute("result", num1 + num2);

        return "result";
    }


}
