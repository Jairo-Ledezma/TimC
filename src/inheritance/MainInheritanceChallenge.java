package inheritance;

public class MainInheritanceChallenge {

	public static void main(String[] args) {
		HourlyEmployee he = new HourlyEmployee("Jairo" , "1988" , 525488 , "2020" , 1000.00);
		System.out.println(he.getAge());
		he.getDoublePay(20.5);
		he.terminate("2023");
		he.getDoublePay(100);
		
		SalariedEmployee se = new SalariedEmployee("Leslie" , "1985" , 525489 , "1990", 150000.00);
		se.retire("2023");
		System.out.println(se);

	}

}
