package com.dehaat.dehaatassignment;

import android.app.Application;

import com.dehaat.dehaatassignment.rest.AppRestClient;

/**
 * Created by Pallaw Pathak on 15/06/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //initialize retrofit client
        AppRestClient.init(this);
    }
}
