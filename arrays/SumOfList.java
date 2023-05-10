package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter some numbers");

        while (true){
            int userInput = scanner.nextInt();
            if (userInput == 0){
                for (int i = 0; i <list.size()-1; i++)
                    System.out.print(list.get(i) +  ", ");
                System.out.print("and " + list.get(list.size()-1)+ " were items in the list. ");
                int sum = 0;
                for(int i = 0; i <list.size(); i ++)
                    sum += list.get(i);
                System.out.print("The sum of that list is: "+ sum);
                break;
            }else{
                list.add(userInput);
            }
        }
    }
}
