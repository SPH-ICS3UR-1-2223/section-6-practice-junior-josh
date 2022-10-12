package ValidatePin;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int createdpin =  2006;
    	System.out.println("What is your pin?");
    	int guess = in.nextInt();

    	while (guess!=createdpin) {
    		System.out.println("Invalid Pin");
    		guess=in.nextInt();
    	}
    	System.out.println("Pin Accepted");   
    }
}
