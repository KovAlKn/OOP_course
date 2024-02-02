package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable, Swimable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    public void bark(){
        System.out.println(nickName + ": Гав-гав!");
    }


    @Override
    public void toGo() {
        System.out.println("Собака по кличке " + nickName + " идет");
    }

    @Override
    public void swim() {
        System.out.println("Собака по кличке "+nickName+" плывет");
    }

    @Override
    public double getRunSpeed() {
        return 30D;
    }
}

