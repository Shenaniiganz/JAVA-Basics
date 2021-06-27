import java.util.Scanner;

public class LeapYear {
	public static void main(String arg[])	
	{
	     
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a year: ");
         int year = input.nextInt();
                   	      
	if(year != 0)
	{
	   if(year % 400 == 0)
                  	System.out.println(year + " is a leap year / annee bisextile");
                  else if(year % 100 == 0)
	    	System.out.println(year + " is not a leap year / annee bisextile");
                   	else if(year % 4 == 0)                    
	    		System.out.println(year + " is a leap year / annee bisextile");
                     	       else 
	   		 System.out.println(year + " is not a leap year / annee bisextile");                       
 	 }  else
		System.out.println("Year zero does not exist ");   
        
        input.close();
 	}
}