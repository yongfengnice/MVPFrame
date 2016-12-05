package com.mvpframe.test;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mvpframe.R;
import com.mvpframe.mvp.BaseActivity;

/**
 * Creator: syf(205205)
 * Date   : on 2016/12/1 0001
 * Desc   : Email:2499522170@qq.com
 */
public class ToastActivity extends BaseActivity<ToastPresenter> {
    private TextView mTextView;

    private void initView() {
        mTextView = (TextView) findViewById(R.id.textview);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void showText(View view) {
        mPresenter.showText();//将业务交给Presenter处理
    }

    public void showTextResult(String str) {//只负责显示Presenter处理的结果，不关心处理过程
        mTextView.setText(str);
        Toast.makeText(ToastActivity.this, str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public ToastPresenter createPresenter() {
        return new ToastPresenter();
    }

}
