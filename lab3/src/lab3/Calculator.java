package lab3;

import java.util.Scanner;

/**
 *
 * @ Niaz Morshed and Devya Gurung
 */
public class Calculator {

    public static void main(String[] args) {
        //Assign string variable
        String str1 = "+", str2 = "-", str3 = "*", str4 = "/";

        //Create a Scanner
        Scanner keyboard = new Scanner(System.in);

        //Prompt the user to enter operator
        System.out.println("Enter an operator: ");
        String operator = keyboard.nextLine();

        //Prompt the user to enter number
        System.out.println("Enter an integer: ");
        int num1 = keyboard.nextInt();

        //Prompt the user to enter another number
        System.out.println("Enter another integer: ");
        int num2 = keyboard.nextInt();

        if (operator.equals(str1)) {

            System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));

        } else if (operator.equals(str2)) {

            System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));

        } else if (operator.equals(str3)) {

            System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));

        } else if (operator.equals(str4)) {

            if (num2 != 0) {

                int reminder = num1 % num2;

                if ((reminder == 0)) {

                    System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));

                } else {

                    System.out.println(num1 + "/" + num2 + " = " + (num1 / num2) + " and " + reminder + "/" + num2);

                }

            } else {

                System.out.println("Divide by zero error !");

            }

        } else {

            System.out.println(operator + " is not a valid operator");

        }

    }
}
