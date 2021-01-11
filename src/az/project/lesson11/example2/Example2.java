package az.project.lesson11.example2;

import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String username ="",password = "";
		
		login();
		enterUsername();
		username = sc.next();
		cntEnterUsername(username); 
		enterPassword();
		password = sc.next();
		cntEnterPassword(password);
		
		System.out.println("");
		System.out.println(correct(username,password));
		System.out.println(success());
	}
	public static void login() {
		System.out.println("***************LOGIN***************");
		System.out.println(" ** Enter Username and Password **");
	}
	public static void enterUsername() {
		System.out.println("");
		System.out.print("User Name : ");
	}
	public static void cntEnterUsername(String username) {
		if (!username.equals("student")) {
			System.out.println("Wrong username");
			System.exit(0);
		}
	}	
	public static void enterPassword() {
		System.out.println("");
		System.out.print("User Password : ");
	}
	public static void cntEnterPassword(String password) {
		if (!password.equals("123456")) {
			System.out.println("Wrong password");
			System.exit(0);
		}
	}	
	
	public static String correct(String username,String password) {
		String outText = "";
		
		if ((username.equals("student"))&&(username.equals("student"))) {
			outText = "Username and password correct ! ";
		}
		return outText;
	}	
	public static String success() {
		
		String outText = "Login Successful";
		return outText;
	}	
}
