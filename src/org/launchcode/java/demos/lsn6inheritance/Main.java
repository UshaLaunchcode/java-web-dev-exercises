package org.launchcode.java.demos.lsn6inheritance;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        HouseCat spike = new HouseCat("Spike");
        Cat plainCat =new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        //As HouseCat extends Cat, a field or local variable of the type of the base class may hold an object that is of the type of the child class.
        //Casting example
        Cat suki = new HouseCat("SUki", 8);
        //Calls HoseCat's noise method()
       // System.out.println(suki.noise());  //Hello my name is Suki !

        //Results in a compiler error, since cat doesn't have such a method
        //suki.isSatisfied();

        //As long as Suki really is a HouseCat, this works
        System.out.println(((HouseCat) suki).isSatisfied());

        //
        //garfield.eat();
        //System.out.println(garfield.isTired());  //prints true
        //System.out.println(spike.getWeight()); //prints 13
       // System.out.println(plainCat.noise());  // prints "Meeeeeeooooowww!"
       // System.out.println(cheshireCat.noise());  // prints "Hello, my name is Cheshire!"

    }
}
