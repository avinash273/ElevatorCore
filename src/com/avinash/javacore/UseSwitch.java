package com.avinash.javacore;

import java.util.ArrayList;

public class UseSwitch {
    public void useSwitch(){
        int i = 10;
        int result = 0;
        switch (i){
            case 0:
                result = 0;
                break;
            case 1:
                result = 1;
                break;
            default:
                result = -1;
        }
        System.out.println("UseSwitch: " + result);
    }
}
