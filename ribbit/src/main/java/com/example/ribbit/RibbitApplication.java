package com.example.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by TylerAnton on 2/16/14.
 */

public class RibbitApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "m8jXXuAwYsqUsUvoRBUUarzIeDEHbOC7CXPLlSZO", "6kB99P4AUt8gZ7hXcokgMtoogam7T4FpHuSW91qI");
    }

}
