package com.mvpframe.mvp;

import android.app.Activity;
import android.os.Bundle;

/**
 * Creator: syf(205205)
 * Date   : on 2016/12/1 0001
 * Desc   : Email:2499522170@qq.com
 */
public abstract class BaseActivity<T extends BasePresenter> extends Activity {

    protected T mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        mPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        mPresenter.detachView();
        super.onDestroy();
    }

    public abstract T createPresenter();
}
