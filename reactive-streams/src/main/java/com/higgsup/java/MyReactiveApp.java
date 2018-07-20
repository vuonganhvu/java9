package com.higgsup.java;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class MyReactiveApp {

    public static void main(String args[]) throws InterruptedException {

        System.out.println("Thread main is " + Thread.currentThread().getName());
        // Create Publisher
        SubmissionPublisher<Employee> publisher = new SubmissionPublisher<>();
        SubmissionPublisher<Employee> publisher1 = new SubmissionPublisher<>();

        // Register Subscriber
        MySubscriber subs = new MySubscriber();
        MySubscriber subs1 = new MySubscriber();
        publisher.subscribe(subs);
        publisher.subscribe(subs1);
        publisher1.subscribe(subs);

        List<Employee> emps = EmpHelper.getEmps();

        // Publish items
        System.out.println("Publishing Items to Subscriber");
        emps.forEach(e -> {
            publisher.submit(e);
            publisher1.submit(e);
        });

        // logic to wait till processing of all messages are over
        while (emps.size() < subs.getCounter() || emps.size() < subs1.getCounter()) {
            System.out.println("sub.getCounter = " + subs.getCounter());
            Thread.sleep(10);
        }
        // close the Publisher
        publisher.close();
        emps.forEach(System.out::println);
//        Thread.sleep(1000);

        System.out.println("Exiting the app");

    }

}
