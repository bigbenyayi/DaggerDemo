package com.example.daggerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //After settings Injections and Components, make project
        //Dagger create the DaggerXYZComponent
        CarComponent component = DaggerCarComponent.create();

        car = component.getCar();
        car.drive();
    }
}
