package com.example.daggerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerdemo.car.Car;
import com.example.daggerdemo.dagger.CarComponent;
import com.example.daggerdemo.dagger.DaggerCarComponent;
import com.example.daggerdemo.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //After settings Injections and Components, make project
        //Dagger create the DaggerXYZComponent
        CarComponent component = DaggerCarComponent.builder()
                .horsePower(100)
                .engineCapacity(1400)
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
