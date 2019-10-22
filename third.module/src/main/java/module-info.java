import third.module.hello.HelloInterfaceImpl;

module third.module {
    exports third.module.hello;
    provides third.module.hello.HelloInterface with HelloInterfaceImpl;
}
