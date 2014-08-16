/**
 * Created by Mengqi on 2014/8/13 0013.
 */
public class MallardDuck extends Duck {
    //绿头鸭使用Quack类处理呱呱叫，当perforQuack()调用时，叫的职责被委托给Quack对象
    public MallardDuck() {
        quackBehavior = new Quack();        //因为MallardDuck继承Duck类，所以具有FlyBehavior与QuackBehavior实例变量
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是只绿头鸭。");
    }
}
