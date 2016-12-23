



/* ==========================================================================
 *
 *	PROGRAM NAME :	SumAndAverageDoWhile.java
 *
 *	Compilation : javac SumAndAverageDoWhile.java
 *	Execution: java SumAndAverageDoWhile
 *
 *	Programmer: Matthew Fundora
 *
 *	Objects imported: java.io
 *
 *  Parameters In: None
 *
 *  Returned Values: None 
 *
 *	Date Modified: 1/28/2015
 *
 *	Purpose: To create a java program where it adds all all the numbers from
 *  1 through 100 and also find its average without writing going through the
 *  tedious process of writing out all the numbers from 1 through 100.
 *
 *	This uses a DO WHILE loop rather than a FOR or WHILE loops from the previous
 * 	assignments (SumAndAverage.java and SumAndAverageWhile.java)
 *
 *  Modification History: 
 *
 *  Date: 1/28/2015 
 *  Programmer: DS
 *  Requirement: Create Program 
 *
 *  Date: 10/13/2016
 *  Programmer: DS 
 *  Requirement: Added header so programmer wouldn't get fired! 
 *
 * ===========================================================================
 */
import java.io.*;
 public class SumAndAverage{
  public static void main(String[]args)throws Exception{
  int sum=0,upperbound,lowerbound;
  double average;
  BufferedReader keybd = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("lower bound=");
    lowerbound=Integer.parseInt(keybd.readLine());
     System.out.println("upper bound=");
     upperbound=Integer.parseInt(keybd.readLine());
     if (lowerbound>=upperbound){
	System.out.println("lower>=upper,please enter again!"); 
} 
else{
   for(int number=lowerbound;number<=upperbound;number++){
    sum+=number;
}
average=((double) lowerbound+(double) upperbound)/2;
System.out.println("The upper bound is"+upperbound);
System.out.println("The sum is"+sum);
System.out.println("The average "+average);
}
}
}

