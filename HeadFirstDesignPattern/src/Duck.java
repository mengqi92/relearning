/**
 * Created by Mengqi on 2014/8/13 0013.
 */
public abstract class Duck {
    //Behavior变量 被声明为 Behavior接口类型
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    //委托给行为类
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("我们鸭子都会划水!");
    }

    //通过set方法设定鸭子的行为，而不是在鸭子的构造器内实例化
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}

