package com.avinash.javacore;

public class Main {
    public static void main(String[] args) {
        /**
         * Scanner
         */
//        ReadFromConsole readFromConsole = new ReadFromConsole();
//        readFromConsole.scannerClass();

        /**
         * Switch
         */
//        UseSwitch useSwitch = new UseSwitch();
//        useSwitch.useSwitch();

        /**
         * call by value
         */
//        int a = 10;
//        int b = 20;
//        CallByValue callByValue = new CallByValue();
//        CallByValue.Example(a, b);
//
//        System.out.println("a & b: " + a +" "+ b); //-> a & b: 10 20

        /**
         * call by reference
         */
//        CallByReference object = new CallByReference(10, 20);
//        System.out.println("Value of a: " + object.a + " & b: " + object.b);
//        object.ChangeValue(object);
//        System.out.println("Value of a: " + object.a + " & b: " + object.b);

        /**
         * Singleton implementation
         */

//        MySingleton a = MySingleton.getInstance();
//        MySingleton b = MySingleton.getInstance();
//        a.x = a.x + 10;
//        System.out.println("a.x and b.x both are same even though 'b' is not assigned ---> " + a.x + " : " + b.x);

        /**
         * Inheritance
         */
        MountainBikeInheritance mb = new MountainBikeInheritance(3, 100, 25);
        System.out.println(mb.toString());

    }
}
