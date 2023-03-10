package S7_Inheritance;

public class MainStudent {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			RecordStudent s = new RecordStudent(" S92300" + i, switch (i) {
			case 1 -> " Mary";
			case 2 -> " Carol";
			case 3 -> " Tim";
			case 4 -> " Harry";
			case 5 -> " Lisa";
			default -> " Anonymous";
			}, " 05/11/1985", " Java MasterClass");
			System.out.println(s);
		}

		StudentPojo pojoStudent = new StudentPojo("S923006", "Ann", "5/11/1985", "Java masterClass");
		RecordStudent recordStudent = new RecordStudent("S9230074", "Bill", "05/11/1985", "Java MasterClass");
		System.out.println(pojoStudent);
		System.out.println(recordStudent);
		
		pojoStudent.setClassList(pojoStudent.getClassList() +  ", JAVA OCP Exam 829");
		//recordStudent.setClassList(pojoStudent.getClassList() +  ", JAVA OCP Exam 829");
		System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
		System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
		
		
		
	}

}
