package com.acme.multimodule.impl2;

import com.acme.multimodule.spi.API;

public class Impl_deux implements API {
    @Override
    public void doSomething() {
        System.out.println("Impl_deux doing something");
    }
}
