package main;

import main.clients.*;
import main.clinicPersonal.Doctor;
import main.clinicPersonal.Nurse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", new Owner("Сергей Петрович"),
                LocalDate.of(2021, 10, 5), new Illness("Лишай"),10D);

        System.out.println(cat.getOwner());
        System.out.println(cat.getNickName());

        System.out.println(cat.getIllness());

        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());

        Cat catty = new Cat();
        catty.eat();
        catty.toGo();

        Dog goodBoy = new Dog();
        goodBoy.toGo();
        System.out.println("Со скоростью:" + goodBoy.getRunSpeed());

        System.out.println(goodBoy.getType());
        System.out.println(catty.getType());

        System.out.println(catty);
        Cat.meow();

        List<Animal> animals =new ArrayList<Animal>();
        animals.add(catty);
        animals.add(goodBoy);
        animals.add(cat);

        int i = 0;
        for(Animal animal : animals){
            System.out.println(i + " " + animal);
            i++;
        }
        System.out.println("____________________");
        cat.toGo();
        cat.swim();

        Parrot parrot = new Parrot("Кеша", new Owner("Джон Сильвер"),
                LocalDate.of(2015,05,17 ), new Illness("Птичий грипп"));
//        parrot.swim();
        parrot.toGo();
        Fish fish=new Fish();
        fish.swim();
//        fish.fly();
        System.out.println("=============================");
        Doctor d1= new Doctor("Айболит",LocalDate.of(1996, 07,23),
                "Собаки и кошки", "Высшая");
        System.out.println(d1);

        Nurse n1 = new Nurse("Вера Петровна",LocalDate.of(2006, 11,17),"высшая");
        System.out.println(n1);
    }
}