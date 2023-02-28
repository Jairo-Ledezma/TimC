package S5expressionsStatements;

public class SecondsAndMinutesChallengeMain {
	
	public static String getdurationString(int seconds) {
		if(seconds<0) {
			return "invalid data given";
		}
		int minutes = seconds/60;
		int remSeconds = seconds%60;
		
		
		
		return getdurationString(minutes , remSeconds);
	}
	
	public static String getdurationString(int minutes , int seconds ) {
		
		if((minutes <0)  || (seconds <0)  || (seconds>59)) {
			return "invalid data given";
		}
		
		int hours = minutes/60;
		int remMinutes = minutes%60;
		
		
		
		return hours+"h " + remMinutes + "m " + seconds +"s";
	}
	

	public static void main(String[] args) {
		System.out.println(getdurationString(7000));
	}

}
