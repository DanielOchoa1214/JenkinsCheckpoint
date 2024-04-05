package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
        System.out.println(c.add(4, 5));
        System.out.println(c.subtract(4, 5));
        System.out.println(c.multiply(4, 5));
        System.out.println(c.divide(4, 5));
    }
}