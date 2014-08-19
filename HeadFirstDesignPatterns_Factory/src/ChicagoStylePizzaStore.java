/**
 * 芝加哥风味披萨店
 * Created by Mengqi on 2014/8/18 0018.
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
//        } else if (item.equals("veggie")) {
//            return new ChicagoStyleVeggiePizza();
//        } else if (item.equals("clam")) {
//            return new ChicagoStyleClamPizza();
//        } else if (item.equals("pepperoni")) {
//            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
