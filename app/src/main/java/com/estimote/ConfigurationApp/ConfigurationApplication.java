package com.estimote.ConfigurationApp;

import android.app.Application;

import com.estimote.sdk.EstimoteSDK;

public class ConfigurationApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        /** TODO: Replace with your App ID and App Token.
         You can get them by adding a new app at https://cloud.estimote.com/#/apps
         */
        EstimoteSDK.initialize(getApplicationContext(), "t5juva00-students-oamk-fi--590", "4d3f55b91be51af6ae22abde6631030a");
        EstimoteSDK.enableDebugLogging(false);
    }
}
