package com.higgsup.java;

import java.io.FileInputStream;
import java.util.Optional;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(2);
        optional.ifPresentOrElse(x -> System.out.println("----Value = " + x + "------"), () -> {
            System.out.println("---Value is null---");
        });

        Optional<Integer> optional1 = Optional.empty();
        Optional<Integer> integerOptional = optional1.or(() -> Optional.of(0));
        integerOptional.ifPresent(System.out::println);

        try (FileInputStream input = new FileInputStream("file.txt")) {

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        } catch (Exception ex) {
        }
    }
}
