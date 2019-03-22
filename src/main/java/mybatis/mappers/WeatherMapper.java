package mybatis.mappers;

import mybatis.model.Weather;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WeatherMapper {

    String GET_BY_CITY = "SELECT * FROM `mybatis-test`.Weather where city = #{city}";
    String INSERT_WEATHER = "INSERT INTO `mybatis-test`.Weather (city, raining, temperatureInF) " +
            "VALUES (#{city}, #{raining}, #{temperatureInF})";

    @Select(GET_BY_CITY)
    public Weather getByCity(String city);

    @Select(INSERT_WEATHER)
    public Weather insertWeather(Weather weather);

}
