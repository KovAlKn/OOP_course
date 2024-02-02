package main.clients;

import java.time.LocalDate;

public class Rat extends Animal implements Goable, Swimable{
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
    public void toGo() {
        System.out.println("Крыса по кличке "+nickName+" идет");
    }

    @Override
    public void swim() {
        System.out.println("Крыса по кличке "+nickName+" плывет");
    }
}
