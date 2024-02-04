package main.clinicPersonal;

import java.time.LocalDate;

public abstract class Employee {
    protected String fullName;
    protected LocalDate startOfWorkDate;

    public Employee(String fullName, LocalDate startOfWorkDate) {
        this.fullName = fullName;
        this.startOfWorkDate = startOfWorkDate;
    }

    public Employee() {
    }

    public String getName() {
        return this.fullName;
    }
}
