package main.clients;

import java.time.LocalDate;

public class Parrot extends Animal implements Goable, Flyable{
    public Parrot(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Parrot() {
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void toGo() {
        System.out.println("Попгай по кличке "+nickName+" идет");
    }

    @Override
    public void fly() {
        System.out.println("Попугай по кличке "+nickName+" летит");
    }
}
