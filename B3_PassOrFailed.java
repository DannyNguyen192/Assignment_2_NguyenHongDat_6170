package Lec04_Condition;

import java.util.Scanner;

public class B3_PassOrFailed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter grade: ");
        double grade = sc.nextDouble();
        System.out.println(grade >= 5.0 ? "Pass" : "Failed");
    }

}
