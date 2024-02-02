package main.clients;

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Flyable, Swimable{
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Duck() {
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void toGo() {
        System.out.println("Утка "+nickName+" идет");
    }

    @Override
    public void fly() {
        System.out.println("Утка по кличке "+nickName+" летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка по кличке "+nickName+" плывет");
    }
}
