module com.acme.multimodule.module_app {

    requires com.acme.multimodule.module_spi;
    requires com.acme.multimodule.module_impl_un;
    requires com.acme.multimodule.module_impl_deux;

    uses com.acme.multimodule.spi.API;

    // Parce qu'il y a un import dans l'implantation. Sinon, l'interface
    //  était suffisante.
    // TODO vérifier si je peux « overrider » modile-info.java et je
    //  paris que la réponse est non parce que ça fait plus parti du code
    //  que de l'environnement.
    uses com.acme.multimodule.impl1.Impl_un;

}
