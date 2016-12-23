//Programmer Name Matthew Fundora date completed September 27 2016 Tuesday

import java.util.Scanner;
public class PrintNumberInWords{
public static void main(String [] args) { 
  System.out.println("Enter any integer number");
Scanner in=new Scanner(System.in);
int number=in.nextInt();
if(number==1)
  System.out.println("ONE");
else if(number==2)
 System.out.println("TWO");
else if(number==3)
 System.out.println("THREE");
else if(number==4) 
System.out.println("FOUR");
else if (number==5)
System.out.println("FIVE");
else if (number==6)
System.out.println("SIX");
else if(number==7)
System.out.println("SEVEN");
else if (number==8) 
System.out.println("EIGHT");
else if (number==9) 
System.out.println("NINE");
else 
System.out.println("OTHER");
 }
}
//code should ask for an integer and say the number up to  nine or say other 

 
