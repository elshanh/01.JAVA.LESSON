package az.project.lesson02.primitive;

public class Primitive {
	
	public static void main(String[] args) {
		
		/*
		Data Type				  Size									Description
			byte						1 byte						Stores whole numbers from -128 to 127
			short					2 bytes						Stores whole numbers from -32,768 to 32,767
			int						4 bytes						Stores whole numbers from -2,147,483,648 to 2,147,483,647
			long						8 bytes						Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
			float					    4 bytes						Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
			double					8 bytes						Stores fractional numbers. Sufficient for storing 15 decimal digits
			boolean				1 bit							Stores true or false values
			char						2 bytes						Stores a single character/letter or ASCII values
			*/
		
			byte byteType = 100;
			System.out.println(byteType);
			short shortType = 5000;
			System.out.println(shortType);
			int intType = 100000;
			System.out.println(intType);
			long longType = 15000000000L;
			System.out.println(longType);
			float floatTyper = 5.75f;
			System.out.println(floatTyper);
			double doubleType = 19.99d;
			System.out.println(doubleType);
			boolean booleanType1 = true;
			boolean booleanType2 = false;
			System.out.println(booleanType1);
			System.out.println(booleanType2);
			char charType = 'A';
			System.out.println(charType);
	}

}
