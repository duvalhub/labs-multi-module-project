module com.acme.multimodule.JPMS.ImplDeux {

    requires com.acme.multimodule.JPMS.Spi;

    exports com.acme.multimodule.impl2;

    provides com.acme.multimodule.spi.API
            with com.acme.multimodule.impl2.Impl_deux;

}
