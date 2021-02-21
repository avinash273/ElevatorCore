package com.avinash.javacore;

/**
 * Sub Class
 */
public class MountainBikeInheritance extends BicycleInheritance {
    public int seatHeight;

    public MountainBikeInheritance(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}
