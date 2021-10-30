package pl.coderslab.MyDrinkApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String initAddFom() {
        return "/home";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/description")
    public String showDescription() {
        return "description";
    }

    @GetMapping("/monthDrink")
    public String drinkOfMonth() {
        return "drinkOfMonth";
    }

}
