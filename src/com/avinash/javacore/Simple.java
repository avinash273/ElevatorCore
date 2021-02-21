package com.avinash.javacore;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Simple {
    public static void main(String[] args) {
        //you can print command line arguments
        for (String each : args) {
            System.out.println(each);
        }
        Student s1 = new Student();

        //Getting the Class object created by JVM
        Class c1 = s1.getClass();

        //Getting all methods in an array
        Method[] m = c1.getDeclaredMethods();

        //Getting all fields in an array
        Field f[] = c1.getDeclaredFields();


        System.out.println("Class object" + c1.getName());

        for (Method method : m) {
            System.out.println("method: " + method.getName());
        }

        for (Field field : f){
            System.out.println("field: " + field.getName());
        }
    }

}
