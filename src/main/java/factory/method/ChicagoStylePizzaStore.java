package factory.method;

/**
 * @author yitiansong
 * 2024/5/7
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        return switch (type) {
            case "A" -> new ChicagoStyleAPizza();
            case "B" -> new ChicagoStyleBPizza();
            default -> null;
        };
    }
}
