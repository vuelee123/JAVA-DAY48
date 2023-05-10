package arrays;

import java.util.Scanner;
import java.util.ArrayList;
public class HowLarge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();
        System.out.println("Enter some words");

        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("the total amount of items in the list was: " + listOfStrings.size());
            }else {
                listOfStrings.add(input);
            }
        }
    }
}

