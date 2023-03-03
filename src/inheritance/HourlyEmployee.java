package inheritance;

public class HourlyEmployee extends Employee {
	
	private double hourlyPayRate;

	public HourlyEmployee(String name, String birthDate, long employeeID, String hireDate, double hourlyPayRate) {
		super(name, birthDate, employeeID, hireDate);
		this.hourlyPayRate = hourlyPayRate;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hourlyPayRate=" + hourlyPayRate + ", toString()=" + super.toString() + "]";
	}
	
	public void getDoublePay(double workedHours) {
		double pay = workedHours * hourlyPayRate;
		 super.collectPay(pay);
	}

}
