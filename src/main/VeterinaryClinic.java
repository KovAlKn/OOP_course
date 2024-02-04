package main;

import main.clients.Animal;
import main.clients.Flyable;
import main.clients.Goable;
import main.clients.Swimable;
import main.clinicPersonal.Employee;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    protected String clinicTitle;
    private List<Employee> staff=new ArrayList<Employee>();
    private List<Animal> patients = new ArrayList<Animal>();

    public VeterinaryClinic(String clinicTitle) {
        clinicTitle = this.clinicTitle;

    }
    public void hirePersonal(Employee employee){
        staff.add(employee);
        System.out.printf("New employee: %s was added to staff %n", employee.getName());
    }

    public void firePersonal(Employee employee){
        staff.remove(employee);
        System.out.printf("Employee: %s was fired %n", employee.getName());
    }

    public void addPatient(Animal animal){
        patients.add(animal);
        System.out.printf("New patient: %s %n", animal.getNickName());
    }

    public List<Animal>getGoable(){
        List<Animal> result = new ArrayList<Animal>();
        for(Animal animal :patients){
            if(animal instanceof Goable){
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal>getFlyable(){
        List<Animal> result = new ArrayList<Animal>();
        for(Animal animal :patients){
            if(animal instanceof Flyable){
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal>getSwimable(){
        List<Animal> result = new ArrayList<Animal>();
        for(Animal animal :patients){
            if(animal instanceof Swimable){
                result.add(animal);
            }
        }
        return result;
    }

    public List<Employee> getStaff(){
        return this.staff;
    }

    public void removePatient(Animal animal){
        patients.remove(animal);
    }

        public void printPatients(){
        int i=1;
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        for (Animal animal:this.patients) {
            System.out.println(i+ " "+animal.toString());
            i++;
        }
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-");
    }

    public void printStaff(){
        int i=1;
        System.out.println("======================================");
        System.out.printf("The staff of Clinic %n");
        for (Employee employee:this.staff) {
            System.out.println(i+ " "+employee.toString());
            i++;
        }
        System.out.println("======================================");
    }
}
