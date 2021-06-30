package io.pragra.learning;

import java.io.FileInputStream;
import java.nio.file.Paths;

public class TestRun {
    public static void main(String[] args) {
        // You can only use resource oriented
        // try catch with classes which implements
        // closable interface
        try{
            MyOwnResource resource = new MyOwnResource();
        }catch (Exception ex){

        }
        Employee employee = new Employee("ABC", 42);
        System.out.println(employee);
    }
}
