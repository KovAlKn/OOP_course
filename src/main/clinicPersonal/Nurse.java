package main.clinicPersonal;

import java.time.LocalDate;

public class Nurse extends Personal{
    String category;

    public Nurse(String fullName, LocalDate startOfWorkDate, String category) {
        this.fullName = fullName;
        this.startOfWorkDate = startOfWorkDate;
        this.category = category;

    }

    @Override
    public String toString() {
        return "Nurse{"+fullName +
                " category='" + category + '\'' +
                '}';
    }
}
