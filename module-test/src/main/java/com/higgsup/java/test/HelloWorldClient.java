package com.higgsup.java.test;


import com.higgsup.java.module.HelloWorld;

import java.util.Optional;

public class HelloWorldClient {

  public static void main (String arg[]) {

    HelloWorld hello = new HelloWorld();
    System.out.println(hello.sayHelloWorld());
    Optional<Integer> b = Optional.of(10);
    System.out.println(b.get());
	
  }

}