package com.assignment2;
import java.util.*;

public class AddRun {
    public static void main(String[]args)
    {
        Add add = new Add();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        add.setNum1(input.nextDouble());
        System.out.print("Enter second number: ");
        add.setNum2(input.nextDouble());
        System.out.println("The result of " + add.getNum1() + " + " + add.getNum2() + " = " + add.calculate());
        System.out.println("Press enter to continue...");
        input.nextLine();
        input.nextLine();
    }
}
