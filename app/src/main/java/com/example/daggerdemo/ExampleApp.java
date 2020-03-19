package com.example.daggerdemo;

import android.app.Application;

import com.example.daggerdemo.dagger.CarComponent;
import com.example.daggerdemo.dagger.DaggerCarComponent;

/**
 * This is useful if we want to reuse single instances
 * of dependencies for example in an activity or fragment,
 * but we don't want to keep them as application-wide singletons that stay
 * in memory for the whole lifetime of the app
 *
 * Then we just need to cool getApplication in MainActivity to get this component
 * and it will be kept even if the activity is destroyed (on rotation for example)
 */
public class ExampleApp extends Application {

    private CarComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerCarComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .build();
    }

    public CarComponent getAppComponent() {
        return component;
    }
}
