package io.pragra.learning;

import java.io.Closeable;
import java.io.IOException;

public class MyOwnResource implements Closeable {
    public void doSomething(){
        System.out.println("Hello How are you");
       // System.out.println(Integer.parseInt("123a"));
        System.out.println("Done");
    }

    @Override
    public void close() throws IOException {
        System.out.println("I am automatically called in resource try catch");
    }
}
