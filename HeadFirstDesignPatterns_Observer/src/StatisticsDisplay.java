/**
 * Created by Mengqi on 2014/8/17 0017.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemprature = 99;
    private float maxTemprature = 0;
    private float minHumidity = 100;
    private float maxHumidity = 0;
    private Subject weatherdata;

    public StatisticsDisplay(Subject weatherdata) {
        this.weatherdata = weatherdata;
        weatherdata.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("最大温度值：" + maxTemprature + "，最小温度值：" + minTemprature);
        System.out.println("最大湿度：" + maxHumidity + "，最小湿度：" + minHumidity + "\n");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (this.maxTemprature < temp) {
            this.maxTemprature = temp;
        }
        if (this.minTemprature > temp) {
            this.minTemprature = temp;
        }
        if (this.maxHumidity < humidity) {
            this.maxHumidity = humidity;
        }
        if (this.minHumidity > humidity) {
            this.minHumidity = humidity;
        }
        display();
    }
}
