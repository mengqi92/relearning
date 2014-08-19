/**
 * 纽约风味披萨店
 * Created by Mengqi on 2014/8/18 0018.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
//        } else if (item.equals("veggie")) {
//            return new NYStyleVeggiePizza();
//        } else if (item.equals("clam")) {
//            return new NYStyleClamPizza();
//        } else if (item.equals("pepperoni")) {
//            return new NYStylePepperoniPizza();
        } else return null;
    }
}
