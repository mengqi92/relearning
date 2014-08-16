/**
 * Created by Mengqi on 2014/8/16 0016.
 */
public interface Observer {
    /**
     * ***********************
     * 当气象观测值改变时，主题调用此方法向观察者更新信息
     *
     * @param temp     温度值
     * @param humidity 湿度值
     * @param pressure 压力值
     *                 ************************
     */
    public void update(float temp, float humidity, float pressure);
}
