
import java.util.Scanner;

public class Validator
{
    public static String getLine(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        String s = sc.nextLine();        // read the whole line
        return s;
    }

    public static String getString(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        String s = sc.next();        // read the first string on the line
        sc.nextLine();               // discard the rest of the line
        return s;
    }

    public static String getString(Scanner sc, String prompt, int length)
    {
        String s="";
        boolean isValid=false;
        while (!isValid) {
            System.out.print(prompt);
        	s = sc.next();        // read the first string on the line
        	if (s.length()==length) {
        		isValid = true;
        	}
        	else
        		System.out.println("Error! length. Should be "+length+" characters.  Try again.");
        	sc.nextLine();               // discard the rest of the line
        }
        return s;
    }

    public static String getStringNumeric(Scanner sc, String prompt, int length)
    {
        String s="";
        boolean isValid=false;
        while (!isValid) {
            System.out.print(prompt);
        	
            if (sc.hasNextInt()) {   // even though this is a String, the values should be numeric
	        	s = sc.next();        // read the first string on the line
	        	if (s.length()==length) {
	        		isValid = true;
	        	}
	        	else
	        		System.out.println("Error! length. Should be "+length+" characters.  Try again.");
        	}
        	else
        		System.out.println("Error! Should be a numeric value.  Try again.");
        	sc.nextLine();               // discard the rest of the line
        }
        return s;
    }
    public static String getInt(Scanner sc, String prompt,int length,
    	    int min, int max)
    	    {
    	        int i = 0;
    	        String s = "";
    	        boolean isValid = false;
    	        while (isValid == false)
    	        {
    	            s = getStringNumeric(sc, prompt, length);
    	            i = Integer.parseInt(s);
    	            if (i <= min)
    	                System.out.println(
    	                    "Error! Number must be greater than " + min);
    	            else if (i >= max)
    	                System.out.println(
    	                    "Error! Number must be less than " + max);
    	            else
    	                isValid = true;
    	        }
    	        return s;
    	    }

    	    public static String getValidContinueInput(Scanner sc) {
    			boolean isValid=false;
    			String i = "";
    			while (isValid == false)
    			{
    				System.out.println("Would you like to continue? (y/n)");
    				i = sc.next();
    				
    				if ((i.equalsIgnoreCase("y"))|| (i.equalsIgnoreCase("n")))
    					isValid = true;
    				else
    					{
    					System.out.println("Please enter y or n!");
    					isValid=false;
    					}
    				}
    			return i;
    		}
}