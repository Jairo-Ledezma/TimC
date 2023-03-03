package inheritance;

import java.time.LocalDate;

public class Worker {
	
	protected String name;
	private String birthDate;
	private String endDate;
	private boolean isActive;
	
	
	public Worker(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
		this.endDate = "active employee";
		this.isActive = true;
	}
	
	public boolean setIsActive(boolean isActive) {
		return this.isActive =isActive;
	}
	
	public int getAge() {
		int age = (LocalDate.now().getYear()) - (Integer.parseInt(birthDate));
		return age;
	}
	
	public void collectPay(double paidAmount) {
		if (!isActive) {
			System.out.println(name + " has been terminated and therefore no money can be collected");
		}else {
		System.out.println(name + " has collected " + paidAmount);
		}
	}
	
	public void terminate(String endDate) {
		this.endDate = endDate;
		isActive =false;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}
	
	

}
