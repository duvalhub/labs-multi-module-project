module com.acme.multimodule.module_impl_deux {

    requires com.acme.multimodule.module_spi;

    exports com.acme.multimodule.impl2;

    provides com.acme.multimodule.spi.API
            with com.acme.multimodule.impl2.Impl_deux;

}
