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
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //注意：子类重写onSaveInstanceState后，调用getView()返回空了。要不就先写自己的逻辑再调用super.onSaveInstanceState(outState);
        mPresenter.detachView();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        mPresenter.attachView(this);
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        mPresenter.detachView();
        super.onDestroy();
    }

    public abstract T createPresenter();
}
