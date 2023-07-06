package com.maksudrustamov.spring.spring_intro;

public class Person {
    Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }
    public void callYourPet (){
        System.out.println("Hello my lovely Pet");
        pet.say();
    }
}
