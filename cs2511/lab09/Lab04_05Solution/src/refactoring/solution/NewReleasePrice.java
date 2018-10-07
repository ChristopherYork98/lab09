package refactoring.solution;

public class NewReleasePrice extends Price {

	@Override
	double getCharge(int daysRented){
		if(daysRented > 1) {
			return 5*daysRented + (daysRented-1)*5; 
		} else {
			return 5;
		}
	}
	
	@Override
	int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2: 1;
	}

	@Override
	String getStatus() {
		return "New";
	}
}
