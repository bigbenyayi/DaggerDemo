package com.example.daggerdemo;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

}