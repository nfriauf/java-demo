package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collectiond {
    public static void main(String[] args) {

/*Part 1 Maps:
Write a Java program to test if a map contains a mapping for the specified key.*/

        HashMap<Integer, String> number_map = new HashMap<>();
        number_map.put(1, "first");
        number_map.put(2, "second");
        number_map.put(3, "third");
        number_map.put(4, "fourth");
        number_map.put(5, "fifth");
        if (number_map.containsKey(4)) {
            System.out.println(number_map.get(4));
        }

//Write a Java program to copy all of the mappings from the specified map to another map.

        HashMap<Integer, String> new_map = new HashMap<>();
        new_map.putAll(number_map);
        System.out.println(new_map);

//Remove a value from HashMap based on key
        if (new_map.containsKey(3)) {
            new_map.remove(3);
        }
        System.out.println(new_map);

/*Part 2 Sets:
Initiate a Set. Using For loop add integers from 1 to 10*/

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            hs.add(i);
        }
        System.out.println(hs);

//Remove all odd numbers from sets.
        HashSet<Integer> hs_new = new HashSet<>();
        for (int i : hs) {
            if (i % 2 == 0) {
                hs_new.add(i);
            }
        }
        System.out.println(hs_new);

//Try to create a set with duplicate values
        hs.add(1);
        hs.add(2);
        hs.add(2);
        System.out.println(hs);

/*Part 3 Lists:
Initiate an Arraylist. Using For loop add integers from 1 to 10*/

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }
        System.out.println(array);

//Create an ArrayList [1,2,3,6,7,3,2,1]. Remove all 2 from Arraylist

        ArrayList<Integer> new_array = new ArrayList<>();
        new_array.add(1);
        new_array.add(2);
        new_array.add(3);
        new_array.add(6);
        new_array.add(7);
        new_array.add(3);
        new_array.add(2);
        new_array.add(1);
        System.out.println(new_array);
        for (int i = new_array.size() - 1; i >= 0; i--) {
            if (new_array.get(i) == 2) {
                new_array.remove(i);
            }
        }
        System.out.println(new_array);

//Remove all odd numbers;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 1) {
                array.remove(i);
            }
        }
        System.out.println(array);
    }
}

