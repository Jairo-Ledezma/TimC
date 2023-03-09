package varArgs;

public class Main {

	public static void main(String... args) {
		System.out.println("Hello World again");

		String[] splitString = "Hello World again".split(" "); // this will create a string array from the "hello world
																// again" string, it will break the string and add the
																// part of the string to an array for every space in the
																// string, this delimitator is set in the parameter the
																// method receives

		printText(splitString);
		System.out.println("_".repeat(20));
		printText("Hello");
		
		System.out.println("_".repeat(20));
		printText("Hello","World", "again");
		
		System.out.println("_".repeat(20));
		printText();
		
		String [] sArray = {"First", "Second", "Third", "forurth" , "Fifth"};
		System.out.println(String.join(",", sArray));

	}

	private static void printText(String... textList) {

		for (String t : textList) {
			System.out.println(t);
		}

	}

}
