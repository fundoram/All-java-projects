

/* ==========================================================================
 *
 *	PROGRAM NAME :	UserInputArrays.java
 *
 *	Compilation : javac SumAndAverageDoWhile.java
 *	Execution: java SumAndAverageDoWhile
 *
 *	Programmer: Matthew Fundora
 *
 *	Objects imported: Scanner
 *
 *  Parameters In: None
 *
 *  Returned Values: None 
 *
 *	Date Modified: 1/28/2015
 *
 *	Purpose: To create a java program that asks the user to enter numbers them prints on command line
 *  
 *
 *	
 * 
 *
 *  Modification History: 
 *
 *  Date: 11/3/2016
 *  Programmer: DS
 *  Requirement: Create Program 
 *
 *  Date: 11/29/2016
 *  Programmer: DS 
 *  Requirement: Added header so programmer wouldn't get fired! 
 *
 * ===========================================================================
 */

import  java.util.Scanner;

public class UserInputArrays {
public static void main(String a[]){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the amount of numbers you want to enter");

    int num = input.nextInt();

    System.out.println("Enter the Element "+num+" of an Array");

    double[] numbers = new double[num];

    for (int i = 0; i < numbers.length; i++)
    {

        System.out.println("Please enter number");

        numbers[i] = input.nextDouble();

    }

    for (int i = 0; i < numbers.length; i++)
    {

        if ( (i%3) !=0){

            System.out.print("");

            System.out.print(numbers[i]+"\t");

        } else {
            System.out.println("");

            System.out.print(numbers[i]+"\t");
        }

    }

}
}