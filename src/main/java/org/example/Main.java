package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> drinkList = List.of("Tea", "Coffee", "Orange juice", "Apple juice", "Green tea", "Cocoa", "Oolong tea");

        drinkList.forEach(System.out::println);
    }
}