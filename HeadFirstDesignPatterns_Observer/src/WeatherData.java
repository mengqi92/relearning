import java.util.ArrayList;

/**
 * Created by Mengqi on 2014/8/17 0017.
 */
public class WeatherData implements Subject {
    private ArrayList observers;    //用一个ArrayList记录观察者
    private float temprature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temprature, humidity, pressure);
        }
    }

    /**
     * **********************
     * 气象站更新观测值时，调用此方法
     * ************************
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMesurements(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
