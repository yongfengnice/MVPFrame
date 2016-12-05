package com.mvpframe.test;

import com.mvpframe.mvp.BaseModel;

/**
 * Creator: syf(205205)
 * Date   : on 2016/12/1 0001
 * Desc   : Email:2499522170@qq.com
 */
public class ToastModel extends BaseModel {

    public String getStrFromModel() {//提供Presenter处理业务时需要的数据
        return "从MVP的Model获取数据";
    }
}
