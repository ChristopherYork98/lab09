package refactoring.solution;

public class PublicHolidayDecorator implements Discounts {

	private RentalBundles rental;
	
	public PublicHolidayDecorator(RentalBundles rental) {
		this.rental = rental;
	}
	
	@Override
	public double applyDiscount() {
		return rental.getCharge()*1.1;
	}

}
