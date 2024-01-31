package main.clients;

import java.time.LocalDate;

public class Parrot extends Animal {
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
    public void swim() {
        System.out.println(nickName+ ": попугай не плавает!");;
    }
}
