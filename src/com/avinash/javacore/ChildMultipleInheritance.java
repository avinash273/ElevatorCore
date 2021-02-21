package com.avinash.javacore;

/**
 * Multiple inheritance using interfaces
 */
public class ChildMultipleInheritance implements Three {
    @Override
    public void print_geek() {
        System.out.println("Geek");
    }

    @Override
    public void print_for() {
        System.out.println("for");
    }

    @Override
    public void print_geeks() {
        System.out.println("Geeks");
    }
}
