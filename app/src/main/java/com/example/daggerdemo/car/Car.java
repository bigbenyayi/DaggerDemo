package com.example.daggerdemo.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels, Driver driver) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    public void drive(){
        engine.start();
        Log.d(TAG, "dirver" + " drives " + this);
    }

}
