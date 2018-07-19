package com.higgsup.java.test;


import com.higgsup.java.module.HelloWorld;

public class HelloWorldClient {

  public static void main (String arg[]) {

    HelloWorld hello = new HelloWorld();
    System.out.println(hello.sayHelloWorld());
	
  }

}