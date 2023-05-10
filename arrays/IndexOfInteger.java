package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter some numbers");

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                System.out.println("Done entering integers into the list");
                System.out.println("What number are you looking for in the list?");
                int secondInput = scanner.nextInt();

                for (int i = 0; i <list.size(); i ++) {
                    if (list.get(i) == secondInput){
                        System.out.println(secondInput + " is at index " + i);
                    }
                }
                break;
            } else {
                list.add(input);
            }
        }

    }
}
