package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("SVSBTk60HPmkd2AK0POTdnqfxiBNkDpdt4oPljHx")
                .clientKey("rMjSbSkWZIRwG8XU9hsdFkA9bMMUPqsxJpxfmSBd")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
