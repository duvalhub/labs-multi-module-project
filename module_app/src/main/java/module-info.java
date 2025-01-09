module com.acme.multimodule.module_app {

    requires com.acme.multimodule.module_spi;
    requires com.acme.multimodule.module_impl_un;
    requires com.acme.multimodule.module_impl_deux;

    uses com.acme.multimodule.spi.API;
    uses com.acme.multimodule.impl1.Impl_un;
    uses com.acme.multimodule.impl2.Impl_deux;

}
