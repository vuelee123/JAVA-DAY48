package methods;

import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the third number: ");
        int thirdNum = Integer.valueOf(scanner.nextLine());

        double average = averageOfNums(firstNum, secondNum, thirdNum);

        System.out.println("The average is: " + average);
    }

    public static double averageOfNums(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        return average;
    }
}
