package ch10_accessmodifier;

public class BirthDayTest {

	public static void main(String[] args) {
		
		BirthDay date = new BirthDay();
		
		date.setYear(2021);
		date.setMonth(12);
		date.setDay(30);
		
		date.showDate();
	}

}
