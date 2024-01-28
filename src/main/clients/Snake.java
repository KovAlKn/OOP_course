package main.clients;

import java.time.LocalDate;

public class Snake extends Animal {
    public Snake(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Snake() {
    }

    @Override
    public void fly() {
        System.out.println(nickName + ": это не воздушный змей!");
    }
}
