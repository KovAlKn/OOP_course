package main.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private List<Component> components=new ArrayList<>();
    private int index=0;

       private int totalWeight = 0;

    public void addComponents(Component... components) {
        for(Component c : components){
            this.components.add(c);
        }
    }

    public int getTotalPower() {
        int totalPower = 0;
        for(Component c : components){
            totalPower+=c.getPower();
        }
        return totalPower;
    }

    @Override
    public String toString() {
        String title ="";
        for (Component c : components){
            title += c.getTitle();
            }
        return String.format("%s power:%s; weight:%s" , title, getTotalPower(), getTotalWeight());
    }

    public Double getTotalWeight() {
        double totalWeight = 0;
        for(Component c : components){
            totalWeight+=c.getWeight();
        }
        return totalWeight;
    }

    @Override
    public boolean hasNext() {
        return index< components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

    @Override
    public int compareTo(Pharmacy o) {
//        return getTotalPower(this.components) - getTotalPower(o.components);
        int totalPower=0;
        int totalPower2=0;
        for(Component c : this.components){
            totalPower+=c.getPower();
        }
        for(Component c : o.components){
            totalPower2+=c.getPower();
        }
        return totalPower-totalPower2;
    }
}
