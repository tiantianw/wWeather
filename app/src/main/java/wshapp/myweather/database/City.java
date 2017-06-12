package wshapp.myweather.database;
/*
**  Created by wsh on 2017/6/12  16:22.
**  Copyright (c) 2017-06-12 wsh All rights reserved.
**  e-mail: iamwsh@qq.com
*/


import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private String province;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
