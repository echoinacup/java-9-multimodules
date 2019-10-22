package main.module;

import third.module.hello.HelloInterface;
import third.module.hello.HelloInterfaceImpl;

public class MainApp {

    public static void main(String[] args) {
        HelloInterface helloInterface = new HelloInterfaceImpl();
        helloInterface.sayHello();
    }
}
