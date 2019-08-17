package com.example.sweater;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingControllerTest {

    @GetMapping("/greeting/test")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World")
                                       String name, String test, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("test", test);
        return "greetingTest";
    }

}
