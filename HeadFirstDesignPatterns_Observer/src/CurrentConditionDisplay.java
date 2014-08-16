/**
 * Created by Mengqi on 2014/8/17 0017.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;    //保存对Subject的引用，方便以后的取消注册

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前天气状况:\n温度: " + temperature + " 摄氏度，湿度: " + humidity + "%\n");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void remove() {
        this.weatherData.removeObserver(this);
    }
}
