module main.module {

    requires second.module;
    requires third.module;
    uses third.module.hello.HelloInterface;
}
