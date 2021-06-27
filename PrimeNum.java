import java.util.Scanner;

class FindPrime {

	FindPrime(int num) {

	int count = 0, i = 1;
	while(i <= num) {

	   if(num % i == 0) {

	        count++;	

	   }
	i++;
	}

	if(count == 2)
	       System.out.println(num + " is a prime number ");
	else
	System.out.println(num + " is a Not a prime number ");        
	} 
}


public class PrimeNum {
	public static void main(String arg[]) {

        System.out.println("Enter a number ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        new FindPrime(n);


        input.close();
    }
}
