import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Enter string data");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if (text.length() % 2 == 0) {
            System.out.println("String is even");
        }
        else {
            System.out.println("String is not even");
        }

    }
}
