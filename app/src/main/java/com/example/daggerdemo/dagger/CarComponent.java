package com.example.daggerdemo.dagger;

import com.example.daggerdemo.MainActivity;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    void inject(MainActivity mainActivity);
}
