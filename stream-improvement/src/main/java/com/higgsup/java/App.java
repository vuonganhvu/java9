package com.higgsup.java;

import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        testDropWhile();
        testTakeWhile();
        testIterate();
        testOfNullable();
    }

    private static void testTakeWhile() {
        System.out.println("----------Demo takeWhile()--------");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 3, 4, 5, 6, 7, 3);
        stream.takeWhile(x -> x < 5).forEach(System.out::println);
    }

    private static void testDropWhile() {
        System.out.println("----------Demo dropWhile()--------");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 3, 4, 5, 6, 7, 3);
        stream.dropWhile(x -> x < 5).forEach(System.out::println);
    }

    private static void testIterate() {
        System.out.println("----------Demo iterate()--------");
        Stream.iterate(2, x -> x < 40, x -> x * x).forEach(System.out::println);
    }

    private static void testOfNullable() {
        System.out.println("----------Demo ofNullable()--------");
        Stream<Integer> stream = Stream.ofNullable(1);
        System.out.println("----------print stream not null--------");
        stream.forEach(System.out::println);
        Stream<Integer> streamNull = Stream.ofNullable(null);
        System.out.println("----------print stream null--------");
        streamNull.forEach(System.out::println);
    }
}
