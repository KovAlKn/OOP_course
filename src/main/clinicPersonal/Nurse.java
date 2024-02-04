package main.clinicPersonal;

import main.clients.Animal;

import java.time.LocalDate;

public class Nurse extends Employee {
    String category;

    public Nurse(String fullName, LocalDate startOfWorkDate, String category) {
        this.fullName = fullName;
        this.startOfWorkDate = startOfWorkDate;
        this.category = category;

    }

    public void makeInjection(Animal animal){
        System.out.printf("The nurse %s has done an injection to %s %s %n", fullName,animal.getType(),animal.getNickName());
    }

    public void fillDocuments(Animal animal){
        System.out.printf("The medical record for %s %s was updated", animal.getType(),animal.getNickName());
    }
    @Override
    public String toString() {
        return "Nurse{"+fullName +
                " category='" + category + '\'' +
                '}';
    }
}
