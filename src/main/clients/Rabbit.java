package main.clients;

import java.time.LocalDate;

public class Rabbit extends Animal implements Goable, Swimable {
    public Rabbit(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Rabbit() {
    }

    @Override
    public void eat() {
        System.out.println("Кролик ест");
    }

       @Override
    public void toGo() {
        System.out.println("Кролик по кличке "+nickName+" идет");
    }

    @Override
    public void swim() {
        System.out.println("Кролик по кличке "+nickName+" плывет");
    }
}
