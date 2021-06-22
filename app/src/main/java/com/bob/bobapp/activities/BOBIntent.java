package com.bob.bobapp.activities;

import android.content.Context;
import android.content.Intent;

public class BOBIntent  extends Intent {

    private static final String ARG_USERNAME = "arg_username";

    public BOBIntent(Context ctx) {

        super(ctx, BOBActivity.class);
    }

    public BOBIntent(Intent intent) {

        super(intent);
    }

    public void setData(String userName) {

        putExtra(ARG_USERNAME, userName);
    }

    public String getUsername() {

        return getStringExtra(ARG_USERNAME);
    }
}