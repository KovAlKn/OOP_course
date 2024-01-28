package main.clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }
    public void bark(){
        System.out.println(nickName + ": Гав-гав!");
    }

    @Override
    public void fly() {
        System.out.println(nickName + ": собаки не летают!");
    }
}
