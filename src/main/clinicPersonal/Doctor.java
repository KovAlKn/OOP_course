package main.clinicPersonal;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Doctor extends Personal {
    String speciality;
    String category;
    String office;
    public Doctor(String fullName, LocalDate startOfWorkDate, String speciality, String category) {
        this.fullName = fullName;
        this.startOfWorkDate = startOfWorkDate;
        this.speciality = speciality;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Доктор %s, специализация: %s, категория: %s", fullName, speciality, category);
    }
}
