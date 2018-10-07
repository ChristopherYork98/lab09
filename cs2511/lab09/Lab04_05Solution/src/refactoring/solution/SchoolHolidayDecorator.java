package refactoring.solution;

public class SchoolHolidayDecorator implements Discounts {

	private RentalBundles rental;
	
	public SchoolHolidayDecorator(RentalBundles rental) {
		this.rental = rental;
	}
	
	@Override
	public double applyDiscount() {
		return rental.getCharge()*0.75;
	}

}
