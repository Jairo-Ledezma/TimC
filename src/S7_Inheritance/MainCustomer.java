package S7_Inheritance;

public class MainCustomer {

	public static void main(String[] args) {
		Customer customer = new Customer ("jairo" , 1000.00 , "jairo@abc.com");
		
		System.out.println(customer.getName());
		System.out.println(customer.getCreditLimit());
		System.out.println(customer.getEmailAddress());
		
		Customer secondCustomer = new Customer("leslie" , "l@l.com");
		System.out.println(secondCustomer.getName());
		System.out.println(secondCustomer.getCreditLimit());
		System.out.println(secondCustomer.getEmailAddress());
		
		Customer thirdCustomer = new Customer();
		
		System.out.println(thirdCustomer.getName());
		System.out.println(thirdCustomer.getCreditLimit());
		System.out.println(thirdCustomer.getEmailAddress());
		

	}

}
