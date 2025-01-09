package com.acme.multimodule.app;

import com.acme.multimodule.impl1.Impl_un;
import com.acme.multimodule.spi.API;
import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

public class ModulesTest {

    @Test
    public void test_1() {

        ServiceLoader<API> loader = ServiceLoader.load(API.class);

        // Utilisation de ServiceLoader pour charger et utiliser
        // les implémentations.
        for (API api : loader) {
            api.doSomething();
        }

    }

    @Test
    public void test_2() {

        API api1 = new Impl_un();
        API api2 = new com.acme.multimodule.impl2.Impl_deux();

        api1.doSomething();
        api2.doSomething();

    }

}
