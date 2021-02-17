package az.project.lesson04.typeConvert;

public class TypeConvert {
	
	public static void main(String[] args) {
		
		int intVariable = 10;
		String stringVariable = String.valueOf(intVariable);
		
		byte  byteVariable = 10;
		short shortVariable = 20;
		float floatVariable  = 30.55f;
		
		intVariable = (int)byteVariable;
		intVariable = (int)shortVariable;
		intVariable = (int)floatVariable;
		System.out.println(intVariable);
		
		double doubleVariable = (double)intVariable;
		System.out.println(doubleVariable);
		
		intVariable = Integer.valueOf(stringVariable);
		System.out.println(intVariable);
		
		doubleVariable = Double.valueOf(stringVariable);
		System.out.println(doubleVariable);
	}
	
}
