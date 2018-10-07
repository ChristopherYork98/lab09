package refactoring.solution;

public class ClassicPrice extends Price {

	@Override
	double getCharge(int daysRented) {
		if(daysRented > 5) {
			return 2.5*daysRented + (daysRented-5)*0.5;
		} else {
			return 2.5*daysRented;
		}
	}
	
	@Override
	String getStatus() {
		return "Classic";
	}

}
