package StringFormating;

public class StringManipulationMethods {

	public static void main(String[] args) {

		String birthDate = "29/07/1988";

		int startingIndex = birthDate.indexOf("1988"); // this will return the number in which 1988 starts in this case
														// 6 29/07/1988 29/07/(these are 6)

		String newDate = String.join("/", "13", "04", "1985"); // .join method will help you to create a new string 
															   // you have to add a delimiter as first argument 
															   // and then add as many elements as needed for following arguments.

		System.out.println("staring index = " + startingIndex); // this will print the starting index, extracted on line 9
																

		System.out.println("Birth year = " + birthDate.substring(startingIndex)); // birthDate.Substring receives an
																					// index and creates a new string
																					// starting on that index, it will
																					// print the entire rest of the
																					// string from the starting index to
																					// the end of the string

		System.out.println("Month born in = " + birthDate.substring(3, 5)); // this .substring method is an overloaded
																			// method of line 13, this one receives a
																			// starting index and an ending index,
																			// taking those into account it creates a
																			// substring from index a to index b

		System.out.println("New date = " + newDate);
		
		System.out.println(newDate.replace('/', '-')); // replace methods can replace a char for another, it will replace all / for -
		
		System.out.println(newDate.replace("1", "00")); // also receives strings not only chars
		
		System.out.println(newDate.replaceFirst("/", "-")); // will replace the firt / for a -  not that in this example method is receiving strings and not chars, this one works wit reg expressions
		
		System.out.println(newDate.replaceAll("/", "---")); // will replace all / for --- note that they are strings and not chars, this one works wit reg expressions
		
		System.out.println("ABC\n".repeat(3));
		System.out.println("-".repeat(20));
		
		System.out.println("ABC\n".repeat(3).indent(8));
		System.out.println("-".repeat(20));
		
		System.out.println("    ABC\n".repeat(3).indent(-2));
		System.out.println("-".repeat(20));
		
	}

}
