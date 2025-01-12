package com.acme.multimodule.app;

import com.acme.multimodule.spi.API;

import java.util.ServiceLoader;

public class ModulesApp {

    public static void main(String[] args) {

        ServiceLoader<API> loader = ServiceLoader.load(API.class);

        // Utilisation de ServiceLoader pour charger et utiliser
        // les implémentations.
        for (API api : loader) {
            api.doSomething();
        }

    }

}
