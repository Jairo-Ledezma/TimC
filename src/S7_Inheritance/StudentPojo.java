package S7_Inheritance;

public class StudentPojo {
	
	
	// POJO's are simply classes that hold data which can be used later by other classes or methods, think of they BYB code you created that used to 
	//give the user the actual won amount as well as the reinvestment, those classes were not modeled correctly but they were basically POJOs since they did nothing other than 
	// be used by the logic in main to get data from them and calculate the profit and investment. 
	
	private String id;
	private String name;
	private String dateOfBirth;
	private String  classList;
	
	public StudentPojo(String id , String name, String dateOfBirth, String classList) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.classList = classList;
	}

	@Override
	public String toString() {
		return "StudentPojo [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", classList=" + classList
				+ "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getClassList() {
		return classList;
	}

	public void setClassList(String classList) {
		this.classList = classList;
	}
	
	
	
	
	
	

}
