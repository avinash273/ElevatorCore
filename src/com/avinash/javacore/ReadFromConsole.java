package com.avinash.javacore;


import java.util.Scanner;

public class ReadFromConsole {
    public void scannerClass(){
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("You entered string " + s);

        int a = in.nextInt();
        System.out.println("You entered integer " + a);

        float b = in.nextFloat();
        System.out.println("You entered float " + b);

        for(int i = 0; i < 10; i++)
            System.out.println("You entered string " + in.nextLine());
    }
}
