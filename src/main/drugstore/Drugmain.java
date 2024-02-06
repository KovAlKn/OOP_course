package main.drugstore;

import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

import java.util.*;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite",2D, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);

        PharmacyTwo p1 = new PharmacyTwo();
        p1.addComponents(water, azitronite);

        PharmacyTwo p2 = new PharmacyTwo();
        p2.addComponents(penicillin, water);

        PharmacyTwo p3 = new PharmacyTwo();
        p3.addComponents(azitronite,penicillin);

        List<Component> components = new ArrayList<>();
        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);

        System.out.println("==========Home work #3===========");
        Pharmacy ph1= new Pharmacy();
        ph1.addComponents(water,azitronite);
        Pharmacy ph2 = new Pharmacy();
        ph2.addComponents(water, penicillin);
        Pharmacy ph3 = new Pharmacy();
        ph3.addComponents(azitronite,penicillin);

        ArrayList<Pharmacy>setOfPharmacy = new ArrayList<>();
        setOfPharmacy.add(ph1);
        setOfPharmacy.add(ph2);
        setOfPharmacy.add(ph3);
        System.out.println(setOfPharmacy);
        Collections.sort(setOfPharmacy);
        System.out.println(setOfPharmacy);

        // Сортировка по общему весу компонентов
        Collections.sort(setOfPharmacy, Comparator.comparing(Pharmacy::getTotalWeight));
        System.out.println(setOfPharmacy);

    }
}
