package com.example.administrator.coolweathers.activity.model;

/**
 * Created by Administrator on 2015/12/8.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {

        return provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public int getId() {
        return id;
    }
}
