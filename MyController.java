package com.example.springdc23.Controller;
import org.springframework.stereotype.Controller;
import org.springframework. web.bind.annotation.GetMapping;

@Controller

public class MyController {
    @GetMapping("/aboutus my project")
    public String openHome() {
        return "aboutus";
    }

    @GetMapping("/activity")
    public String openActivity() {
        return "activity";
    }
}