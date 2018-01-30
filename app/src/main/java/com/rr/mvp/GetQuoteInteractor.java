package com.rr.mvp;

/**
 * Created by admin on 30-Jan-18.
 */

public interface GetQuoteInteractor {
    interface OnFinishedListener {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);
}
