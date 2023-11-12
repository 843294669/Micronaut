package com.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

import java.io.InputStream;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}