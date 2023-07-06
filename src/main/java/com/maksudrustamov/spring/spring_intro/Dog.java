package com.maksudrustamov.spring.spring_intro;

import org.springframework.beans.factory.annotation.Autowired;


public class Dog implements Pet{

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
