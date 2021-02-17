package az.project.lesson07.scanner;

import java.util.Scanner;

public class ScannerProg {
	
	public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***************************************");
		
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Surname: ");
		String surname = sc.next();
		System.out.println();
		System.out.println("Your full name -> " + name +"."+surname);
		
		System.out.println("***************************************");
	}

}
