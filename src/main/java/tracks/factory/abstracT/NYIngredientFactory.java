package tracks.factory.abstracT;

import factory.abstracT.ingredient.*;
import tracks.factory.abstracT.ingredient.*;

/**
 * @author yitiansong
 * 2024/5/8
 */
public class NYIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BoCaiVeggies()};
    }

    @Override
    public Cheese createCheese() {
        return new SweetCheese();
    }

    @Override
    public Sauce createSauce() {
        return new HotSauce();
    }

    @Override
    public Dough createDough() {
        return new ThinDough();
    }
}
