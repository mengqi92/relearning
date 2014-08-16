/**
 * Created by Mengqi on 2014/8/13 0013.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        Duck anothermodel = new ModelDuck();
        model.display();
        model.performFly();
    }
}
