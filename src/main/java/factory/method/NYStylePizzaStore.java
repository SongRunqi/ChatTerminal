package factory.method;

/**
 * @author yitiansong
 * 2024/5/7
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        // java 12
        return switch (type) {
            case "A" -> new NYStyleAPizza();
            case "B" -> new NYStyleBPizza();
            default -> null;
        };
    }
}
