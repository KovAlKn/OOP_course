package main.clients;

import java.time.LocalDate;

public class Snake extends Animal implements Swimable, Crawlable {
    public Snake(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Snake() {
    }

    @Override
    public void eat() {
        System.out.println("Snake is eating");
    }

    @Override
    public void swim() {
        System.out.println("Змея по кличке "+nickName+" плывет");
    }

    @Override
    public void toGo() {
        System.out.println("Змея " + nickName + " ползет");
    }
}
