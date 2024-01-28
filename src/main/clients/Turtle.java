package main.clients;

import java.time.LocalDate;

public class Turtle extends Animal{
    public Turtle(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Turtle() {
    }

    @Override
    public void fly() {
        System.out.println(nickName+ " : черепаха не летает!");
    }
}
