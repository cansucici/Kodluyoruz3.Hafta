package DunyaSaatleri;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class City implements Comparable<City>, Clock , Runnable {

    String cityName;
    String uniqueCode;
    int GMT;

    public City(String cityName, String uniqueCode, int GMT) {
        this.cityName = cityName;
        this.uniqueCode = uniqueCode;
        this.GMT = GMT;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public int getGMT() {
        return GMT;
    }

    public void setGMT(int GMT) {
        this.GMT = GMT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return GMT == city.GMT &&
                cityName.equals(city.cityName) &&
                uniqueCode.equals(city.uniqueCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, uniqueCode, GMT);
    }

    @Override
    public void showTime() {
        SimpleDateFormat instantTime = new SimpleDateFormat("d/M/y h:m:s");
        Date date = new Date();

    }

    @Override
    public int compareTo(City city) {
        return this.cityName.compareTo(city.getCityName());
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", uniqueCode='" + uniqueCode + '\'' +
                //", GMT=" + GMT +
                '}';
    }

    @Override
    public void run() {

    }
}
