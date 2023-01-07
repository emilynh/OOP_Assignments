package javabasics1;

public class PrintDayInWord {
	public static void main(String[] args) {
		int dayNumber = 2;
		
		if(dayNumber == 0) {
			System.out.println("Sunday");
		}else if(dayNumber == 1) {
			System.out.println("Monday");
		}else if(dayNumber == 2) {
			System.out.println("TUESDAY");
		}else if(dayNumber == 3) {
			System.out.println("WENESSDAY");
		}else if(dayNumber == 4) {
			System.out.println("THURSDAY");
		}else if(dayNumber == 5) {
			System.out.println("FRIDAY");
		}else {
			System.out.println("SATURDAY");
		}
	}

}
