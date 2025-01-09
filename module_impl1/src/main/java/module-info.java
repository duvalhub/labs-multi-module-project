module com.acme.multimodule.module_impl_un {

    requires com.acme.multimodule.module_spi;

    exports com.acme.multimodule.impl1;

    provides com.acme.multimodule.spi.API
            with com.acme.multimodule.impl1.Impl_un;

}
