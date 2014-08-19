import java.util.ArrayList;

/**
 * Created by Mengqi on 2014/8/18 0018.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("准备 " + name);
        System.out.println("抖抖面...");
        System.out.println("加点儿酱料...");
        System.out.println("加点儿点缀：");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("烘焙 25 分钟。");
    }

    void cut() {
        System.out.println("将披萨沿对角线切开。");
    }

    void box() {
        System.out.println("把披萨放入 PizzaStore 箱子中");
    }

    public String getName() {
        return name;
    }
}
