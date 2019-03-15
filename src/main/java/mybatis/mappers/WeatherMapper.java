package mybatis.mappers;

import mybatis.model.Weather;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WeatherMapper {

    String GET_BY_CITY = "SELECT * FROM `mybatis-test`.Weather where city = #{city}";

    @Select(GET_BY_CITY)
    public Weather getByCity(String city);
}
