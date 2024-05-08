package factory.method;

/**
 * @author yitiansong
 * 2024/5/8
 */
public class Wing {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza("A");
        Pizza pizza1 = chicagoStore.orderPizza("A");
        System.out.println("I got a NY pizza!" + pizza);
        System.out.println("I got a Cc pizza" + pizza1);
    }
}
