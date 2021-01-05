package android.com.callback;

import android.content.Context;

import org.xutils.common.Callback;

/**
 * Created by Dream on 2016-06-22.
 */
public abstract class ResponseCallback implements Callback.CommonCallback<String> {
    Context mContext;

    public ResponseCallback(Context context) {
        mContext = context;
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        ex.printStackTrace();
    }

    @Override
    public void onCancelled(CancelledException cex) {
    }

    @Override
    public void onFinished() {
    }
}
