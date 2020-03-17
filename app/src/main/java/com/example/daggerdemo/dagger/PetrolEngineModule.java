package com.example.daggerdemo.dagger;

import com.example.daggerdemo.car.Engine;
import com.example.daggerdemo.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
