package mybatis.model;

public class Weather {

    private String city;
    private boolean raining;
    private int temperatureInF;

    //constructor
    public Weather(String city, boolean raining, int temperatureInF) {
        this.city = city;
        this.raining = raining;
        this.temperatureInF = temperatureInF;

    }

    //empty constructor
    public Weather() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isRaining() {
        return raining;
    }

    public void setRaining(boolean raining) {
        this.raining = raining;
    }

    public int getTemperatureInF() {
        return temperatureInF;
    }

    public void setTemperatureInF(int temperatureInF) {
        this.temperatureInF = temperatureInF;
    }
}
