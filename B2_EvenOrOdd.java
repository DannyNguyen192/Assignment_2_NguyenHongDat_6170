package Lec04_Condition;

import java.util.Scanner;

public class B2_EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Even number" : "Odd number");
    }
}
