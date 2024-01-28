package main.clients;

import java.time.LocalDate;

public class Rabbit extends Animal {
    public Rabbit(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Rabbit() {
    }

    @Override
    public void fly() {
        System.out.println(nickName + ": крилик не летает!");
    }
}
