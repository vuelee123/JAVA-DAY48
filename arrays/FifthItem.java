package arrays;

import java.util.Scanner;
import java.util.ArrayList;
public class FifthItem {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();
        System.out.println("Enter some words");

        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("The fifth item in the list is: " + listOfStrings.get(4));
                break;
            }else{
                listOfStrings.add(input);
            }
        }
    }

}

