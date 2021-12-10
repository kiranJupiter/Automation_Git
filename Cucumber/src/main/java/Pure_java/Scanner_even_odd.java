package Pure_java;

import java.util.Scanner;

public class Scanner_even_odd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check even or oder");
	int	n = scan.nextInt();
	if(n%2 == 0) {
		System.out.println("It's even number");
	}else {
		System.out.println("it's odd number");
	}
		
	}
}
