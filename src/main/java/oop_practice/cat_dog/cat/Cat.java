package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;
import oop_practice.cat_dog.dog.Dog;

public class Cat extends Animal {

    public static  String name;
    public static  String animal;

    public Cat(String name) {
        this.name = name;

    }



    @Override
    public void sound() {
        System.out.println("I'am a" + animal + ". My name" + name + ". Mew");
    }

}
