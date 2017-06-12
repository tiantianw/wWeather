package wshapp.myweather.database;
/*
**  Created by wsh on 2017/6/12  16:28.
**  Copyright (c) 2017-06-12 wsh All rights reserved.
**  e-mail: iamwsh@qq.com
*/


import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String province;
    private String city;
    private String county;
}
