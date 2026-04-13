import java.util.Scanner;
public class Factorial {

    // TODO: Create a method 'public static long factorial(int n)'
    // It should return the factorial of n.
	public static long factorial(int n){

		long fact=1;
		for(int i=1; i<=n; i++){

			fact*=i;

		}
		return fact;

	}

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int n= sc.nextInt();

		long factorial= factorial(n);

		System.out.println(factorial);

	}

    
        // TODO: Read input n
        // TODO: Call factorial(n)
        // TODO: Print the result
    
}
