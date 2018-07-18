package com.higgsup.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List<String> list = List.of("1", "3");
        List<String> afsdf = new ArrayList<>();
        list.get(0).concat("dfsdf");
        List<Integer> numbers = List.of(1, 2, 3);
        Integer b = Integer.valueOf(3);
        Integer c = b;
        c++;
        Integer a = numbers.get(0);
        a++;
        System.out.println(numbers.get(0));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        List<Student> students = List.of(new Student("Anhvv", 10F), new Student("Thinhdd", 5F));
        System.out.println(students.get(0));
    }
}
