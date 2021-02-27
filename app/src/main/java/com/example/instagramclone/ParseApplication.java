package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("wuqmehsZFlmvN231ITfhio7I0s1atA7ltBlMAtxx")
                .clientKey("PzizeL7XlRZdNFbj5XiCY8CJKpsdhR3w533SKd4o")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
