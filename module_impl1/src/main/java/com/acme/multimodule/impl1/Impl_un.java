package com.acme.multimodule.impl1;

import com.acme.multimodule.spi.API;

public class Impl_un implements API {
    @Override
    public void doSomething() {
        System.out.println("Impl_un doing something");
    }
}
