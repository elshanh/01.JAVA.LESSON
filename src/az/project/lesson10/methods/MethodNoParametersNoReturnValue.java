package az.project.lesson10.methods;

public class MethodNoParametersNoReturnValue {
	
	public static void main(String[] args) {
		 
		printNoParametersNoReturnValue();
		printParametersNoReturnValue("Parameters No Return Value");
		String text = printNoParametersReturnValue();
		System.out.println(text);
		System.out.println("****************************************");
		text = printParametersReturnValue("Parameters Return Value");
		System.out.println(text);
		System.out.println("****************************************");
		
	}
	
	public static void printNoParametersNoReturnValue() {
		System.out.println("No Parameters No Return Value");
		System.out.println("****************************************");
	}
	public static void printParametersNoReturnValue(String inText) {
		System.out.println(inText);
		System.out.println("****************************************");
	}
	public static String printNoParametersReturnValue() {
		String outText = "No Parameters Return Value";
		return outText;
	}
	public static String printParametersReturnValue(String inText) {
		String outText = inText;
		return outText;
	}		

}
