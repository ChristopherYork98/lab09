package refactoring.solution;

public class FourMovieDecorator implements Discounts {

	private RentalBundles rental;
	
	public FourMovieDecorator(RentalBundles rental) {
		this.rental = rental;
	}
	
	@Override
	public double applyDiscount() {
		return rental.getCharge()*0.9;
	}

}
