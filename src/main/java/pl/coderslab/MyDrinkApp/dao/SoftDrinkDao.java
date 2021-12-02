package pl.coderslab.MyDrinkApp.dao;


import org.springframework.stereotype.Repository;
import pl.coderslab.MyDrinkApp.entity.Drink;
import pl.coderslab.MyDrinkApp.entity.SoftDrink;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class SoftDrinkDao {
    @PersistenceContext
    EntityManager entityManager;

    public void createSoftDrink(SoftDrink softDrink) {
        entityManager.persist(softDrink);
    }

    public void update(SoftDrink softDrink) {
        entityManager.createQuery("update SoftDrink s set s.name=: drinkName, s.description=: drinkDesc, s.ingredients=: drinkIngredients, s.preparationTime=: preparationTime, s.priceLevel=: priceLevel where s.id=: id")
                .setParameter("drinkName",softDrink.getName())
                .setParameter("drinkDesc", softDrink.getDescription())
                .setParameter("drinkIngredients", softDrink.getIngredients())
                .setParameter("preparationTime", softDrink.getPreparationTime())
                .setParameter("priceLevel", softDrink.getPriceLevel())
                .setParameter("id", softDrink.getId())
                .executeUpdate();
    }

    public void delete(SoftDrink softDrink) {
        entityManager.remove(entityManager.contains(softDrink) ?
                softDrink : entityManager.merge(softDrink));
    }

    public SoftDrink findById(long id) {
        return entityManager.find(SoftDrink.class, id);
    }
    public List findAllSofts(){
        Query query = entityManager.createQuery("SELECT s from SoftDrink s");
        return query.getResultList();
    }

}
