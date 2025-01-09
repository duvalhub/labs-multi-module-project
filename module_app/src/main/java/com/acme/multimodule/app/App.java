//package com.acme.multimodule.app;
//
//import com.acme.multimodule.impl1.Impl_un;
//import com.acme.multimodule.spi.API;
//
//import java.util.ServiceLoader;
//
//public class App {
//
//    public static void main(String[] args) {
//
//        ServiceLoader<API> loader = ServiceLoader.load(API.class);
//
//        // Utilisation de ServiceLoader pour charger et utiliser
//        // les implémentations.
//        for (API api : loader) {
//            api.doSomething();
//        }
//
//    }
//
//    public static void main0(String[] args) {
//
//        API api1 = new Impl_un();
//        API api2 = new com.acme.multimodule.impl2.Impl_deux();
//
//        api1.doSomething();
//        api2.doSomething();
//
//    }
//
//}
