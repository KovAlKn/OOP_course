package main.clinicPersonal;

import main.clients.Animal;

import java.time.LocalDate;

public class Doctor extends Employee {
    String speciality;
    String category;
    String office;
    public Doctor(String fullName, LocalDate startOfWorkDate, String speciality, String category) {
        this.fullName = fullName;
        this.startOfWorkDate = startOfWorkDate;
        this.speciality = speciality;
        this.category = category;
    }

    public Doctor(String fullName) {
        this.fullName = fullName;
    }
    public void examineOfPatient(Animal animal){

        System.out.printf("Doctor %s conduct the examination of %s %s %n", fullName, animal.getType(), animal.getNickName());
    }
    public void  prescribeTreatment(Animal animal){}

    @Override
    public String toString() {
        return String.format("Доктор %s, специализация: %s, категория: %s", fullName, speciality, category);
    }
}
