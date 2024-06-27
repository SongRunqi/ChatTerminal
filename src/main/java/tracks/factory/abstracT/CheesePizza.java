package tracks.factory.abstracT;

/**
 * @author yitiansong
 * 2024/5/8
 */
public class CheesePizza extends Pizzaa {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }
}
