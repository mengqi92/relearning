/**
 * Created by Mengqi on 2014/8/18 0018.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "芝加哥风味深盘奶酪披萨";
        dough = "超厚饼";
        sauce = "小番茄酱";

        toppings.add("意大利 mozzarella 白干酪");
    }

    void cut() {
        System.out.println("将披萨切成正方形。");
    }
}
