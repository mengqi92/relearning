/**
 * Created by Mengqi on 2014/8/17 0017.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay curConDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMesurements(30, 65, 30.4f);
        weatherData.setMesurements(22, 70, 29.2f);
        weatherData.setMesurements(25, 90, 29.2f);
    }
}
