package pl.coderslab.MyDrinkApp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.MyDrinkApp.dao.DrinkDao;
import pl.coderslab.MyDrinkApp.dao.SoftDrinkDao;
import pl.coderslab.MyDrinkApp.entity.Drink;
import pl.coderslab.MyDrinkApp.entity.SoftDrink;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DrinksManagementsService {

    private final DrinkDao drinkDao;
    private final SoftDrinkDao softDrinkDao;

    public List findAllDrinks(){
        return drinkDao.findAll();
    }

    public void saveDrink(Drink drink) {
        drinkDao.createDrink(drink);
    }

    public void saveSoft(SoftDrink softDrink) {
        softDrinkDao.createSoftDrink(softDrink);
    }


    public Drink findDrinkById(int idToFind) throws Exception {
        Optional<Drink> optionalDrink = Optional.ofNullable(drinkDao.findById(idToFind));
        if (optionalDrink.isPresent()){
            return optionalDrink.get();
        }
        throw new Exception("User not found");
    }

    public SoftDrink findSoftById(int idToFind) throws Exception {
        Optional <SoftDrink> optionalSoftDrink = Optional.ofNullable(softDrinkDao.findById(idToFind));
        if(optionalSoftDrink.isPresent()){
            return optionalSoftDrink.get();
        }
        throw new Exception("User not found");
    }
}

