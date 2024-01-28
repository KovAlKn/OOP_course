package main.clients;

import java.time.LocalDate;

public class Animal {
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("Кличка",new Owner("Хозяин"),LocalDate.now(),new Illness("Болезнь"));
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    private void wakeUp() {
        wakeUp("12:00");;

    }

    private void wakeUp(String time) {
        System.out.println("Животное "+ nickName+ " проснулось в "+ time);

    }

    public String getType() {
        return getClass().getSimpleName();
    }
    public void lifeCycle() {
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
    }
    private void hunt(){
        System.out.println("Животное охотится!");
    }

    private void eat(){
        System.out.println("Животное ест!");
    }

    private void sleep(){
        System.out.println("Животное уснуло!");
    }

    public void toGo(){
        System.out.println("Животное по кличке "+nickName+" идет");
    }

    public void fly(){
        System.out.println("Животное по кличке "+nickName+" летит");
    }

    public void swim(){
        System.out.println("Животное по кличке "+nickName+" плывет");

    }

    @Override
    public String toString() {
        return String.format("nickname = %s, birthdate = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }


}

