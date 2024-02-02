package main.clients;

import java.time.LocalDate;

public class Turtle extends Animal implements Goable, Swimable{
    public Turtle(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Turtle() {
    }

    @Override
    public void eat() {
        System.out.println("Turtle is eating");
    }

        @Override
    public void toGo() {
        System.out.println("Черепаха по кличке "+nickName+" идет");
    }

    @Override
    public void swim() {
        System.out.println("Черепаха по кличке "+nickName+" плывет");
    }
}
