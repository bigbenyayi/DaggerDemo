package com.example.daggerdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Modules are good if you use a class from a thrid party
 * which we can't change (ie add Inject at the beginning)
 */
@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.airThemUp();
        return tires;
    }

    /**
     * This is automatically initialized with the 2 method above
     * @param rims from provideRims
     * @param tires from provideTires (so these will have air in them)
     * @return wheels that depends on tires and rimes
     */
    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
       return new Wheels(rims, tires);
    }

}
