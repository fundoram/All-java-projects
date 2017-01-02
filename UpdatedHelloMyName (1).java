/* ==========================================================================
 *
 *	PROGRAM NAME :	UpdatedHelloMyName.java
 *
 *	Compilation : javac UpdatedHelloMyName.java
 *	Execution: java SumAndAverageDoWhile
 *
 *	Programmer:Matthew Fundora
 *
 *	Objects imported: Scanner And IO
 *
 *  Parameters In: None
 *
 *  Returned Values: None 
 *
 *	Date Modified: 1/28/2015
 *
 *	Purpose: To Write your name to a file where it adds all all the
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
 *  Date: 1/29/2015
 *  Programmer: DS 
 *  Requirement: Added header so programmer wouldn't get fired! 
 *
 * ===========================================================================
 */
 import java.util.Scanner;
 import java.io.*;


/**
this program writes data to file
**/
 public class UpdatedHelloMyName{
 public static void main(String[] args)throws IOException
 {
  String filename;                 //filename
  String yourName;              //friendname



  Scanner keyboard=new Scanner(System.in);
  System.out.println("Type in your name or anything after making the file");



 keyboard.nextLine();


 System.out.print("Enter The filename:");
 filename=keyboard.nextLine();
 File file= new File (filename);
 if (file.exists())
{
 System.out.println("The file"+filename+"already exists.");
 System.exit(0);
}
 PrintWriter outputfile=new PrintWriter(file);
{
 yourName=keyboard.nextLine();
 outputfile.println(yourName);
 }
 outputfile.close();
 System.out.println("Data Written to the file.");
 System.exit(0);
  }
 }


