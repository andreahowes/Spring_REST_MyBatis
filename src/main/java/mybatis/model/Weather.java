package mybatis.model;

public class Weather {

    private boolean raining;
    private int temperatureInF;

    //constructor
    public Weather(boolean raining, int temperatureInF) {
        this.raining = raining;
        this.temperatureInF = temperatureInF;
    }

    //empty constructor
    public Weather() {
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
