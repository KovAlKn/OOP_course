package main.clients;

public class Hawk extends Animal implements Skyhuntable {
    @Override
    public void eat() {
            System.out.println("Hawk is eating");
    }

    @Override
    public void fly() {

    }

    @Override
    public void toHunt() {
        System.out.println("Сокол охотится");

    }
}
