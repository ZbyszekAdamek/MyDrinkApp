package pl.coderslab.MyDrinkApp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.MyDrinkApp.dao.CocktailClient;
import pl.coderslab.MyDrinkApp.entity.dto.CocktailDto;
import pl.coderslab.MyDrinkApp.service.CocktailService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class CocktailController {

    private final CocktailService cocktailService;
    private final CocktailClient cocktailClient;


    @GetMapping("/cocktail")
    public String getCocktail(){
        return cocktailService.getCocktail();
    }
    @GetMapping("/random")
    public String randomDrink(){
        return cocktailService.getRandomCocktail();
    }
    @PostMapping("/recipe")
    public CocktailDto test(@Valid String drink){
        return cocktailService.getDrink(drink);
    }

    @GetMapping("/findRecipe")
    public String showRecipe() {
        return "cocktailDescription";
    }

    @PostMapping("/findRecipe")
    public String showThisRecipe(String drink, Model model){
        CocktailDto cocktailDto = cocktailClient.getDrinkByName(drink);
        model.addAttribute("cocktail", cocktailDto);
        return "cocktailDescription";
    }
}

