package inheritanceS7;

public class StringComparissonAndInspectionMethods {

	public static void main(java.lang.String[] args) {
		printInformation("Hello World");
		printInformation(""); 
		printInformation("\t   \n");
		
		String helloWorld="Hello World";
		System.out.printf("Index of r = %d %n" , helloWorld.indexOf('r'));
		System.out.printf("Index of World = %d %n" , helloWorld.indexOf("World"));
		System.out.printf("Index of l = %d %n" , helloWorld.indexOf('l'));
		System.out.printf("Index of l = %d %n" , helloWorld.lastIndexOf('l'));
		System.out.printf("Index of l = %d %n" , helloWorld.indexOf('l',3));
		System.out.printf("Index of l = %d %n" , helloWorld.lastIndexOf('l',8));
		
		String helloWorldLower = "hello world".toLowerCase();
		
		if (helloWorld.equals(helloWorldLower)) {
			System.out.println("values match exactly");
		}
		
		if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
			System.out.println("values match exactly ignoring case");
		}
		
		if (helloWorld.startsWith("Hello")) {
			System.out.println("String starts with hello");
		}
		
		if (helloWorld.endsWith("World")) {
			System.out.println("String ends with World");
		}
		
		if (helloWorld.contains("World")) {
			System.out.println("String Contains World");
		}
		
		if (helloWorld.contentEquals("Hello World")) {
			System.out.println("values match exactly");
		}
		
		
		
		
		

	}

	
	public static void printInformation(String string) {
		int length = string.length();
		System.out.printf("Length = %d %n" , length);
		if(string.isEmpty()) {
			System.out.println("string is empty");
			return;
		}
		
		if (string.isBlank()) {
			System.out.println("String is blank");
		}
		System.out.printf("first char = %c %n", string.charAt(0));
		System.out.printf("Last char = %c %n", string.charAt(length -1 ));
	}
}
