package Lec04_Condition;

import java.util.Scanner;

public class B1_Pos_Neg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
//        System.out.println(n > 0 ? "Positive number" : (n < 0 ? "Nengative number" : "zero"));
        if (n > 0) {
            System.out.println("Positive number");
        } else if (n < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }
}
