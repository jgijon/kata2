package kata21;

import java.util.ArrayList;

public class kata21 {
    
    public static void main (String[] args){
        
        ArrayList <Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random()*80));
        }
        
        for (Integer value : list) {
            System.out.println(value);
        }
        
        ArrayList <Integer> elderPeople = new ArrayList<>();
        for (Integer value : elderPeople) {
            if (value <= 70) continue;
            elderPeople.add(value);
        }
        
        list.removeAll(elderPeople);
        for (Integer value : elderPeople) {
            System.out.println(value);
        }
    
    }
}
