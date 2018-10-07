package refactoring.solution;

public class RegularPrice extends Price {

	@Override
	double getCharge(int daysRented){
		if(daysRented < 3) {
			return daysRented*3;
		} else {
			return daysRented*3 + (daysRented-3)*1;
		}
	}
	
	@Override
	String getStatus() {
		return "Regular";
	}
}
