package main.clients;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable{
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish() {
    }

    public Fish(String nickName) {
        nickName= this.nickName;
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void swim() {
        System.out.println("Рыба по кличке "+nickName+" плывет");
    }
}
