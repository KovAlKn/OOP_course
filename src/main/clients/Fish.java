package main.clients;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish() {
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

        @Override
    public void fly() {
        System.out.println(nickName+" :рыбы летают только в воде!");
    }
}
