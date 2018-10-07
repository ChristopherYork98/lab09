package refactoring.solution;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String _name;
	private List<RentalBundles> _rentals = new ArrayList<>();
	public Customer (String name) {
		_name = name;
	};
	
	public void addRental(RentalItem rental) {
		_rentals.add(rental);
	}
	
	public String getName (){
		return _name;
	}
	
	public String statement() {
		
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";
		
		for (RentalBundles r: _rentals) {
			//show figures for this rental
			result += r.getStatement();
		}

		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) +	"\n";
		result += "You earned " + String.valueOf(getTotalFrequentPoints()) 	+ " frequent renter points";
		return result;
	}

	private int getFrequentRenterPoints(RentalItem r) {
		return r.getFrequentRenterPoints();
	}

// Two options: Sometimes leave the old method to delegate to the old method.  This is useful if it is a public
// method 
	
//	private double getCharge(Rental r) {
//		return r.getCharge();
//	}
	
	private double getTotalCharge() {
		double result = 0;
		for (RentalBundles r: _rentals) {
			result += r.getCharge();
		}
		return result;
		}

	private int getTotalFrequentPoints() {
		int result = 0;
		for (RentalBundles r: _rentals) {
			result += r.getFrequentRenterPoints();
		}
		return result;
		}

}