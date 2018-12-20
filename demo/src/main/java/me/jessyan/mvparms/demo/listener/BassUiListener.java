package me.jessyan.mvparms.demo.listener;

import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;


public class BassUiListener implements IUiListener {
    @Override
    public void onComplete(Object o) {
        doComplete(o);
    }

    protected void doComplete(Object values){

    }
    @Override
    public void onError(UiError uiError) {

    }

    @Override
    public void onCancel() {

    }
}
