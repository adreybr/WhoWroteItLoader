package com.example.android.whowroteitloader;

/**
 * Created by AdreyBenaya on 06/04/2018.
 */

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

public class BookLoader extends AsyncTaskLoader<String> {
    String mQueryString;

    public BookLoader(Context context, String mQueryString) {
        super(context);
        this.mQueryString = mQueryString;
    }

    @Override
    public String loadInBackground() {
        return com.example.android.whowroteitloader.NetworkUtils.getBookInfo(mQueryString);
    }

    @Override


    protected void onStartLoading() {
        super.onStartLoading();

        forceLoad();
    }
}