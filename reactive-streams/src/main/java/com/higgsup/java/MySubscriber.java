package com.higgsup.java;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscriber;

public class MySubscriber implements Subscriber<Employee> {
    private Flow.Subscription subscription;

    private int counter = 0;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("Subscribed");
        this.subscription = subscription;
        this.subscription.request(1); //requesting data from publisher
        System.out.println("onSubscribe requested 1 item");
    }

    @Override
    public void onNext(Employee item) {
        System.out.println("Thread processing Employee " + item + " is " + Thread.currentThread().getName());
//        item.setId(item.getId()+1);
        counter++;
        System.out.println("subscription current is " + this.subscription);
        this.subscription.request(1);
//        this.subscription.cancel();
    }

    @Override
    public void onError(Throwable e) {
        System.out.println("Some error happened");
        e.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("All Processing Done. Thread name is " + Thread.currentThread().getName());
    }

    public int getCounter() {
        return counter;
    }

}
