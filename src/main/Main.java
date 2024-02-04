package main;

import main.clients.*;
import main.clinicPersonal.Doctor;
import main.clinicPersonal.Employee;
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

        Cat catty = new Cat("Флафи", new Owner("Гертруда Ивановна"), LocalDate.of(2015,11,27),new Illness("Простуда"), 5D);
        catty.eat();
        catty.toGo();

        Dog goodBoy = new Dog("Дик", new Owner("Альбер Карлович"), LocalDate.of(2021, 2,13), new Illness("Чумка"));
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
        Fish fish=new Fish("Dory", new Owner("Nemo"), LocalDate.of(2022,1,10), new Illness("Обезвоживание"));
        fish.swim();
//      fish.fly();

        System.out.println("=============================");
        VeterinaryClinic clinic=new VeterinaryClinic("Cat and Dog");
        Doctor d1= new Doctor("Айболит",LocalDate.of(1996, 07,23),
                "Собаки и кошки", "Высшая");
        Doctor d2= new Doctor("Хаус");
        Nurse n1 = new Nurse("Вера Петровна",LocalDate.of(2006, 11,17),"высшая");

        clinic.hirePersonal(d1);
        clinic.hirePersonal(d2);
        clinic.hirePersonal(n1);

        clinic.printStaff();

        clinic.firePersonal(d2);
        clinic.printStaff();

        clinic.addPatient(catty);
        clinic.addPatient(goodBoy);
        clinic.addPatient(cat);
        clinic.addPatient(parrot);
        clinic.addPatient(fish);

        List<Animal> goable=clinic.getGoable();
        for(Animal animal : goable){
            System.out.println(animal);
        }


        //        System.out.println(d1);
//        d1.examineOfPatient(parrot);
//
//
//        System.out.println(d2);
//
//
//        System.out.println(n1);
//        n1.makeInjection(parrot);
//        n1.fillDocuments(parrot);
    }
}