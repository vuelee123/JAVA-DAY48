package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();
        System.out.println("Enter some words");

        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("The last item in the list is:  " + listOfStrings.get(listOfStrings.size()-1));
                break;
            }else {
                listOfStrings.add(input);
            }
        }
    }
}
