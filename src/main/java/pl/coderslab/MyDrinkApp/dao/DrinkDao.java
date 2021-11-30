package pl.coderslab.MyDrinkApp.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.MyDrinkApp.entity.Drink;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DrinkDao {

    @PersistenceContext
    EntityManager entityManager;

    public void createDrink(Drink drink) {
        entityManager.persist(drink);
    }

    public void update(Drink drink) {
        entityManager.createQuery("update Drink d set d.name=: drinkName, d.description=: drinkDesc, d.ingredients=: drinkIngredients, d.preparationTime=: preparationTime, d.priceLevel=: priceLevel where d.id=: id")
                .setParameter("drinkName",drink.getName())
                .setParameter("drinkDesc", drink.getDescription())
                .setParameter("drinkIngredients", drink.getIngredients())
                .setParameter("preparationTime", drink.getPreparationTime())
                .setParameter("priceLevel", drink.getPriceLevel())
                .setParameter("id", drink.getId())
                .executeUpdate();
    }

    public void delete(Drink drink) {
        entityManager.remove(entityManager.contains(drink) ?
                drink : entityManager.merge(drink));
    }

    public Drink findById(long id) {
        return entityManager.find(Drink.class, id);
    }
    public List findAll(){
        Query query = entityManager.createQuery("SELECT d from Drink d");
        return query.getResultList();
    }
}




