package com.mvpframe.mvp;

/**
 * Creator: syf(205205)
 * Date   : on 2016/12/1 0001
 * Desc   : Email:2499522170@qq.com
 */
public abstract class BasePresenter<T extends BaseActivity, M extends BaseModel> {

    protected T mActivity;
    protected M mModel;

    public void attachView(T activity) {
        mActivity = activity;
        if (mModel == null) {
            mModel = createModel();
        }
    }

    //使用的时候要通过getView()，不要持有mActivity的引用，不然容易引起因为不能及时释放mActivity而导致Activity泄露
    public T getView() {
        return mActivity;
    }

    public void detachView() {
        mActivity = null;
    }

    protected abstract M createModel();
}
