package lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @ Niaz Morshed and Devya Gurung
 */
public class Calculator {

    public static void main(String[] args) {
//Assign string variable
        String str1 = "/", str2 = "*", str3 = "+", str4 = "-";
//formatting numbers upto 2 decimal places
        DecimalFormat df = new DecimalFormat("#.00");
//Create a Scanner
        Scanner keyboard = new Scanner(System.in);
//Prompt the user to enter operator
        System.out.println("Please enter an operator: ");
        String operator = keyboard.nextLine();
//Prompt the user to enter number
        System.out.println("Please enter a number: ");
        double num1 = keyboard.nextDouble();
//Prompt the user to enter another number
        System.out.println("Please enter another number: ");
        double num2 = keyboard.nextDouble();
        if (num2 != 0) {
            if (operator.equals(str1)) {
                System.out.println(num1 + "/" + num2 + " = " + df.format(num1 / num2));
            } else {
                if (operator.equals(str2)) {
                    System.out.println(num1 + "*" + num2 + " = " + df.format(num1 * num2));
                } else {
                    if (operator.equals(str3)) {
                        System.out.println(num1 + "+" + num2 + " = " + df.format(num1 + num2));
                    } else {
                        if (operator.equals(str4)) {
                            System.out.println(num1 + "-" + num2 + " = " + df.format(num1 - num2));
                        } else {
                            System.out.println(operator + " is not a valid operator");

                        }
                    }
                }
            }
        } else {
            System.out.println("Divide by zero error !");
        }
    }
}
