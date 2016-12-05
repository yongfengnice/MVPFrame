package com.mvpframe.test;

import com.mvpframe.mvp.BasePresenter;

/**
 * Creator: syf(205205)
 * Date   : on 2016/12/1 0001
 * Desc   : Email:2499522170@qq.com
 */
public class ToastPresenter extends BasePresenter<ToastActivity, ToastModel> {

    @Override
    protected ToastModel createModel() {
        return new ToastModel();
    }

    public void showText() {//处理业务，在处理业务的过程需要的数据由Model提供
        getView().showTextResult(mModel.getStrFromModel());
    }
}
