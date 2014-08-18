/**
 * 奶泡
 * Created by Mengqi on 2014/8/18 0018.
 */
public class Whip extends Beverage {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+奶泡";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
