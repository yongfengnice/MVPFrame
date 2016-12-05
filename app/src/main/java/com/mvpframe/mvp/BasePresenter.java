package com.mvpframe.mvp;

import java.lang.ref.WeakReference;

/**
 * Creator: syf(205205)
 * Date   : on 2016/12/1 0001
 * Desc   : Email:2499522170@qq.com
 */
public abstract class BasePresenter<T extends BaseActivity, M extends BaseModel> {

    protected WeakReference<T> mReference;
    protected M mModel;

    public void attachView(T activity) {
        mReference = new WeakReference<>(activity);
        mModel = createModel();
    }

    //使用的时候要通过getView()，不要持有mActivity的引用，不然容易引起因为不能及时释放mActivity而导致Activity泄露
    public T getView() {
        if (mReference != null) {
            return mReference.get();
        }
        return null;
    }

    public void detachView() {
        if (mReference != null) {
            mReference.clear();
            mReference = null;
        }
    }

    protected abstract M createModel();
}
