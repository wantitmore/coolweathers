package com.example.administrator.coolweathers.activity.model;

/**
 * Created by Administrator on 2015/12/8.
 */
public class Country {
    private int id;
    private String countryName;
    private String countryCode;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getId() {
        return id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
