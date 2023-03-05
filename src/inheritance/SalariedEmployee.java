package inheritance;

public class SalariedEmployee extends Employee{
	
	private double annualSalary;
	private boolean isRetired;
	public SalariedEmployee(String name, String birthDate, long employeeID, String hireDate, double annualSalary) {
		super(name, birthDate, employeeID, hireDate);
		this.annualSalary = annualSalary;
		this.isRetired = false;
	}
	
	public void retire(String endDate) {
		System.out.println(name + " is now retired, thank you for your service");
		terminate(endDate);
		setIsActive(false);
		isRetired = true;
	}

}
