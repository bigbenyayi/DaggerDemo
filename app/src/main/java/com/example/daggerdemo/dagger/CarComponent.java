package com.example.daggerdemo.dagger;

import com.example.daggerdemo.MainActivity;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton //Singleton keeps the same Driver in this case
@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("Horse Power") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("Engine Capacity")int engineCapacity);

        CarComponent build();


    }
}
