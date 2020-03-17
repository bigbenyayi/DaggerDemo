package com.example.daggerdemo.dagger;

import com.example.daggerdemo.car.DieselEngine;
import com.example.daggerdemo.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);

}
