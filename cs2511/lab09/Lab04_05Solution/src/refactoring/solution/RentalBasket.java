package refactoring.solution;

import java.util.ArrayList;
import java.util.List;

public class RentalBasket implements RentalBundles {

	private List<RentalBundles> Items = new ArrayList<RentalBundles>();
	
	@Override
	public double getCharge() {
		double charge = 0;
		for(RentalBundles r: Items) {
			charge += r.getCharge();
		}
		return charge;
	}

	@Override
	public int getFrequentRenterPoints() {
		int points = 0;
		for(RentalBundles r: Items) {
			points += r.getFrequentRenterPoints();
		}
		return points;
	}
	public void addRental(RentalBundles r) {
		Items.add(r);
	}
	
	public void removeRental(RentalBundles r) {
		Items.remove(r);
	}
	
	@Override
	public String getStatement() {
		String result = "";
		for(RentalBundles r: Items) {
			result += getStatement();
		}
		return result;
	}
}
