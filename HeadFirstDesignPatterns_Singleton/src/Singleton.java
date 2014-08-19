/**
 * 单例模式
 * Created by Mengqi on 2014/8/19 0019.
 */
public class Singleton {
    //利用一个静态变量来记录Singleton类的唯一实例
    //volatile关键词确保，当uniqueInstance变量被初始化成Singleton实例时，多个线程正确处理uniqueInstance变量
    //一个变量声明为volatile，就意味着这个变量是随时会被其他线程修改的，因此不能将它cache在线程memory中。
    private volatile static Singleton uniqueInstance;

    //构造器声明为私有的，只有Singleton类内才可以调用构造器
    private Singleton() {
    }

    //用getInstance方法实例化对象，并返回这个实例【延迟实例化】
    public static Singleton getInstance() {
        //如果还没有创建实例,就进入同步区块
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                //进入区块后，再检查一次。如果仍是null，才创建实例。
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
