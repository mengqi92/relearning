/**
 * Created by Mengqi on 2014/8/16 0016.
 */
public interface Subject {
    /**
     * ****************
     * 注册观察者
     *
     * @param observer 要注册的观察者
     */
    public void registerObserver(Observer observer);

    /**
     * ***********
     * 删除观察者
     *
     * @param observer 要删除的观察者
     */
    public void removeObserver(Observer observer);

    /**
     * ***************
     * 当主题改变时，调用此方法以通知所有观察者
     * ***************
     */
    public void notifyObservers();
}
