package refactoring.solution;

public abstract class Price {
	abstract double getCharge(int daysRented);	
	
	int getFrequentRenterPoints(int daysRented){
		return 1;
	}
	
	abstract String getStatus();
}
