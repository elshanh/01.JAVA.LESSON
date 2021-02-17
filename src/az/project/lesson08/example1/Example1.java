package az.project.lesson08.example1;

import java.util.Scanner;

public class Example1 {


	public static void main(String[] args) {
		
		int cnt = 0;
		String lesson = "";
		double note = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***************************************");
		System.out.print("Enter your lesson count: ");
		int lessonCount = sc.nextInt();
		
		if (lessonCount > 5) {
			System.out.println("Maximum lesson count 10");
			cnt++;
		}
		
		String[] lessonName = new String[lessonCount];
		double[] lessonNote = new double[lessonCount];
			
		if (cnt == 0) {
			for (int i = 0; i < lessonCount; i ++) {
				System.out.print("Enter lesson " + (i+1) + " : ");
				lesson = sc.next();
				lessonName[i] = lesson.toString();
				System.out.print("Enter lesson note " + (i+1) + " : ");
				note = sc.nextDouble();				
				lessonNote[i]   = note;
				System.out.println("-----------------------------");
			}
			
			String lessonNames = "";
			double lessonFinalNote = 0;
			System.out.println("***************************************");
			
			for (int i = 0; i < lessonCount; i ++) {
				lessonNames = lessonNames + lessonName[i].toString() + ", ";
				lessonFinalNote = lessonFinalNote + lessonNote[i];
			}
			
			System.out.println("Lessons (" +lessonNames+") ");
			System.out.println("Average (" +(lessonFinalNote/lessonCount)+") ");
		}
	}
	
}
