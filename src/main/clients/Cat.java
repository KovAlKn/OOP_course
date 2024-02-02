package main.clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable, Swimable{

    Double discount;
    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount =10D;
    }
   @Override
    public void toGo(){
        System.out.println("Кошка по кличке "+nickName+" идет");
    }

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышку и ест");
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public static void meow() {
        System.out.println("Мяяяу!");
    }

    @Override
    public String toString() {
        return super.toString()+ "Discount("+discount+")";
    }


    @Override
    public void swim() {
        System.out.println("Кошка по кличке "+nickName+" плывет");
    }
}
