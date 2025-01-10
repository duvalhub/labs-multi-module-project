module com.acme.multimodule.JPMS.App {

    requires com.acme.multimodule.JPMS.Spi;
    requires com.acme.multimodule.JPMS..ImplUn;
    requires com.acme.multimodule.JPMS.ImplDeux;

    uses com.acme.multimodule.spi.API;

    // Parce qu'il y a un import dans l'implantation. Sinon, l'interface
    //  était suffisante.
    // TODO vérifier si je peux « overrider » modile-info.java et je
    //  paris que la réponse est non parce que ça fait plus parti du code
    //  que de l'environnement.
    uses com.acme.multimodule.impl1.Impl_un;

}
