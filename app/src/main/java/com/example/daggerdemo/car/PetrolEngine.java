package com.example.daggerdemo.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";

    @Inject
    public PetrolEngine() {}

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started");
    }
}
