public class Lesson1 {

        public static void main(String[] args) {
            System.out.println("Hello world!");

//        1.Create a loop that will print numbers from 1 to 10, except number 7

            for (int i = 1; i < 11; i++) {
                if (i == 7) {
                    continue;
                }
                System.out.println(i);
            }

//        2.Create An Array of integers from 1 to 5, Call an integer on array using
//        index and print it.

            int[] array = {10, 20, 30, 40, 50};
            System.out.println(array[4]);

//          3.Call index outside of the bound. Handle this exception printing
//          “Outside of bound message.”

            try {
                System.out.println(array[10]);
            } catch (Exception e) {
                System.out.println("Outside of bound message.");
            }
        }
    }

