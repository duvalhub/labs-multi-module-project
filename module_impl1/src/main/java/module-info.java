module com.acme.multimodule.JPMS..ImplUn {

    requires com.acme.multimodule.JPMS.Spi;

    exports com.acme.multimodule.impl1;

    provides com.acme.multimodule.spi.API
            with com.acme.multimodule.impl1.Impl_un;

}
