package tracks.factory.abstracT;

import tracks.factory.abstracT.ingredient.Cheese;
import tracks.factory.abstracT.ingredient.Dough;
import tracks.factory.abstracT.ingredient.Sauce;
import tracks.factory.abstracT.ingredient.Veggies;

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
