


/* ==========================================================================
 *
 *	PROGRAM NAME :	ConvertCelciusKelven.java
 *
 *	Compilation : javac ConvertCelciusKelven.java
 *	Execution: java ConvertCelciusKelven
 *
 *	Programmer: Matthew Fundora
 *
 *	Objects imported: BuffeedReader io stream reader
 *
 *  Parameters In: None
 *
 *  Returned Values: None 
 *
 *	Date Modified: 1/28/2015
 *
 *	Purpose: To create Convert kelvin to celcius and celius to fahrenheit
 *  
 *  
 *
 *	
 * 	
 *
 *  Modification History: 
 *
 *  Date: 12/9/2016
 *  Programmer: MRF
 *  Requirement: Create Program 
 *
 *  Date: 12/9/2016
 *  Programmer: MRF
 *  Requirement: Added header so programmer wouldn't get fired! 
 *
 * ===========================================================================
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConvertCelciusKelven {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Declare the reader from console
		BufferedReader br;
		// Get the console input for the temperature in Kelvin
		System.out.println("Temperature in Kelvin:");		
		br = new BufferedReader(new InputStreamReader(System.in));
		// assign to float variable the temperature in Kelvin
		float kelvin = Float.parseFloat(br.readLine());
		// Kelvin to Degree Celsius Conversion
		float celsius = kelvin - 273.15F;
		System.out.println("Celsius: "+ celsius);
		System.out.println("Temperature in Degree Celsius:");		
		br = new BufferedReader(new InputStreamReader(System.in));
		// assign to double variable the degree celsius
		double degrees = Double.parseDouble(br.readLine());
		// Degree Celsius to Degrees Fahrenheit Conversion
		double fahrenheit = (9*degrees/5) + 32;
		System.out.println("Fahrenheit: "+ fahrenheit);
		//best I can do without help and 3 days left

String filename;                 //filename
  String yourName;              //friendname



  Scanner keyboard=new Scanner(System.in);
  System.out.println("Type in your name or anything after making the filename after you read this click enter to write filename and data");



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




	










}

}