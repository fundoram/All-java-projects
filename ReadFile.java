/* ==========================================================================
 *
 *	PROGRAM NAME :	SumAndAverageDoWhile.java
 *
 *	Compilation : javac SumAndAverageDoWhile.java
 *	Execution: java SumAndAverageDoWhile
 *
 *	Programmer: Matthew Fundora
 *
 *	Objects imported: Scanner File 
 *
 *  Parameters In: None
 *
 *  Returned Values: None 
 *
 *	Date Modified: 11/21/2016
 *
 *	Purpose: Read a file
 * 
 *
 *
 *
 * 	
 *
 *  Modification History: 
 *
 *  Date: 11/21/2016
 *  Programmer: MRF
 *  Requirement: Create Program 
 *
 *  Date: 11/21/2016
 *  Programmer:MRF 
 *  Requirement: Added header so programmer wouldn't get fired! 
 *
 * ===========================================================================
 */

import java.io.File;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the file name with extention : ");
            File file = new File(input.nextLine());

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
 
