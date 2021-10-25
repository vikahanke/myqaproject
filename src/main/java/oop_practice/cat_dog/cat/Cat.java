package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;
import oop_practice.cat_dog.dog.Dog;

public class Cat extends Animal {

    public Cat(String name) {

    }

    @Override
    public void sound() {
        System.out.println("I'am a Cat. My name Vasya. Mew");
    }

}
