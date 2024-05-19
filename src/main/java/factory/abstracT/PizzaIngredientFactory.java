package factory.abstracT;

import factory.abstracT.ingredient.Cheese;
import factory.abstracT.ingredient.Dough;
import factory.abstracT.ingredient.Sauce;
import factory.abstracT.ingredient.Veggies;

/**
 * @author yitiansong
 * 2024/5/8
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
}
