package pl.coderslab.MyDrinkApp.dao;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.MyDrinkApp.entity.dto.CocktailDto;
import pl.coderslab.MyDrinkApp.entity.dto.OpenCocktailCocktailDto;
import pl.coderslab.MyDrinkApp.entity.dto.OpenCocktailMainDto;


//Klasa zawierająca metody połączenia z zewnętrznym API, służącym do wyszukiwania drinków.

@Component
public class CocktailClient {

    private RestTemplate restTemplate = new RestTemplate();
    private static final String cocktails = "https://www.thecocktaildb.com/api/json/v1/1/";

    public String getCocktailByName(String drink){
        return restTemplate.getForObject(cocktails + "search.php?s={drink}"
                ,String.class, drink);
    }

    public CocktailDto getDrinkByName(String drink){
        OpenCocktailCocktailDto openCocktailCocktailDto = restTemplate.getForObject(cocktails
                + "search.php?s={drink}", OpenCocktailCocktailDto.class, drink);
        OpenCocktailMainDto[] array = openCocktailCocktailDto.getDrinks();
        OpenCocktailMainDto firstElement = array[0];

        return CocktailDto.builder()
                .drinkName(firstElement.toString())
                .build();
    }

    public String getRandomCocktail(){
        return restTemplate.getForObject(cocktails + "random.php"
                ,String.class);
    }
}

