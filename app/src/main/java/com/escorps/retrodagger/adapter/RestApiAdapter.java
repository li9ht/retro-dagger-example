package com.escorps.retrodagger.adapter;

import com.escorps.retrodagger.utils.Constants;

import retrofit2.Retrofit;

public class RestApiAdapter {
    
    private static Retrofit sharedInstance = null;

    public static Retrofit getInstance() {
        if (sharedInstance == null){

            sharedInstance = new Retrofit.Builder()
                    .baseUrl(Constants.URL)
                    .build();
        }

        return sharedInstance;
    }
}
