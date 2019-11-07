package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collectiond {
    public static void main(String[] args) {

/*Part 1 Maps:
Write a Java program to test if a map contains a mapping for the specified key.*/

        HashMap<Integer, String> numberMap = new HashMap<>();
        numberMap.put(1, "first");
        numberMap.put(2, "second");
        numberMap.put(3, "third");
        numberMap.put(4, "fourth");
        numberMap.put(5, "fifth");
        if (numberMap.containsKey(4)) {
            System.out.println(numberMap.get(4));
        }

//Write a Java program to copy all of the mappings from the specified map to another map.

        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.putAll(numberMap);
        System.out.println(newMap);

//Remove a value from HashMap based on key
        if (newMap.containsKey(3)) {
            newMap.remove(3);
        }
        System.out.println(newMap);

/*Part 2 Sets:
Initiate a Set. Using For loop add integers from 1 to 10*/

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            hs.add(i);
        }
        System.out.println(hs);

//Remove all odd numbers from sets.
        HashSet<Integer> hsNew = new HashSet<>();
        for (int i : hs) {
            if (i % 2 == 0) {
                hsNew.add(i);
            }
        }
        System.out.println(hsNew);

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

        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(1);
        newArray.add(2);
        newArray.add(3);
        newArray.add(6);
        newArray.add(7);
        newArray.add(3);
        newArray.add(2);
        newArray.add(1);
        System.out.println(newArray);
        for (int i = newArray.size() - 1; i >= 0; i--) {
            if (newArray.get(i) == 2) {
                newArray.remove(i);
            }
        }
        System.out.println(newArray);

//Remove all odd numbers;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 1) {
                array.remove(i);
            }
        }
        System.out.println(array);
    }
}

