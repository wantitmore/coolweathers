package com.example.administrator.coolweathers.activity.model;

/**
 * Created by Administrator on 2015/12/8.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;

    public String getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public int getId() {
        return id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {

        this.cityName = cityName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }


}
