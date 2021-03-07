package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("SVSBTk60HPmkd2AK0POTdnqfxiBNkDpdt4oPljHx")
                .clientKey("rMjSbSkWZIRwG8XU9hsdFkA9bMMUPqsxJpxfmSBd")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
