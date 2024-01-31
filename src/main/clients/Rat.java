package main.clients;

import java.time.LocalDate;

public class Rat extends Animal{
    public Rat(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Rat() {
    }

    @Override
    public void eat() {
        System.out.println("Rat is eating");
    }

    @Override
    public void fly() {
        System.out.println(nickName+": крыса не летает!");
    }
}
