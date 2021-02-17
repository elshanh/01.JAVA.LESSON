package az.project.lesson05.operations;

public class Operations {
	
	public static void main(String[] args) {
		
		System.out.println("*********************************Arithmetic Operations***********************************");
		int firstVariable = 10;
		int secondVariable = 5;

		System.out.println("Add : " + firstVariable + secondVariable);
		System.out.println("Add : " + (firstVariable + secondVariable));
		
		System.out.println("Subtraction : " + (firstVariable - secondVariable));
		
		System.out.println("Multiplication : " + (firstVariable * secondVariable));
		
		System.out.println("Division : " + (firstVariable / secondVariable));
		
		firstVariable++;
		System.out.println("Increment : " + (firstVariable + secondVariable));
		
		System.out.println("Mod : " + (firstVariable % secondVariable));
		
		firstVariable--;
		System.out.println("Decrement : " + (firstVariable + secondVariable));
		
		
		System.out.println("*********************************Assignment Operations***********************************");
		int intVariable = 10;

		intVariable +=5;
		System.out.println(intVariable);
		intVariable -=5;
		System.out.println(intVariable);
		intVariable *=5;
		System.out.println(intVariable);
		intVariable /=5;
		System.out.println(intVariable);		
		
		System.out.println("*********************************Comparison Operations***********************************");
		
		int x = 10;
		int y = 5;
		boolean cnt1 = (x == y);
		System.out.println(cnt1);
		
		boolean cnt2 = (x != y);
		System.out.println(cnt2);
		
		boolean cnt3 = (x > y);
		System.out.println(cnt3);
		
		boolean cnt4 = (x >= y);
		System.out.println(cnt4);
		
		boolean cnt5 = (x < y);
		System.out.println(cnt5);
		
		boolean cnt6 = (x <= y);
		System.out.println(cnt6);		

	}
	
}
