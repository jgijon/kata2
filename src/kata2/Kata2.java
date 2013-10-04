package kata2;

import java.util.ArrayList;
import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] array = {1,2,3, 1};
        
        HashMap<Integer,Integer> map;
        map = new HashMap<>();
        
        for (int value : array) {
            Integer ocurrences = map.get(value);
            if(ocurrences == null)
                map.put(value, 1);
            else
                map.put(value, ocurrences + 1);
        }
        
        int max = 0;
        for (int value : map.keySet()) {
            if (map.get(value) > max)
                max = value;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) 
            list.add((int) (Math.random()*80));
        
        for (Integer value : list) {
            System.out.println(value);
        }
                
        ArrayList<Integer> elderPeople = new ArrayList<>();
        for (Integer value : list) {
            if (value <= 70) continue;
            elderPeople.add(value);
        }   
        list.removeAll(elderPeople);
        
        for (Integer value : list) {
            System.out.println(value);
        }
        
        System.out.println("Valor "+max + "aparece, numero de veces: " + map.get(max));
    }
}
