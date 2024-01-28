package main.clients;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish() {
    }

    @Override
    public void toGo() {
        System.out.println(nickName+" : рыбы не ходят!");
    }

    @Override
    public void fly() {
        System.out.println(nickName+" :рыбы летают только в воде!");
    }
}
