package com.maksudrustamov.spring.spring_intro;

public class Cat implements Pet{

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
