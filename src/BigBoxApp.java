
import java.util.Scanner;

public class BigBoxApp {
	
	private static String divNo;
	private static String storeNo;
	private static Scanner sc;
	
	public static void main(String[] args)
	{
		//Welcome message
		System.out.println("Welcome to the Big Box App - Project 1");
		sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
			//Get validated user input(division number and store number).
			divNo = Validator.getInt (sc, "Please enter the Division No.: ", 3,
		    	    000, 999);
			storeNo = Validator.getInt (sc, "Please enter the Store No.: ", 5,
		    	    000, 99999);
			//Print out the facility message.
			Facility f = StoreDB.getStoreByDivisionStore(divNo, storeNo);
			System.out.println();
			if (f !=null)
				System.out.println(f.toString());
			else
				System.out.println("Error! One or both of the numbers you have entered are not valid.");
			//Continue option.
			choice = Validator.getValidContinueInput(sc);
		}
	}	
}