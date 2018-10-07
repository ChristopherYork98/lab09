package refactoring.solution;

public class RentalItem implements RentalBundles, Discounts{
	private Movie _movie;
	private int _daysRented;
	
	public RentalItem(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}

	@Override
	public double getCharge() {
		return _movie.getCharge(_daysRented);
	}

	@Override
	public int getFrequentRenterPoints() {
		 return _movie.getFrequentRenterPoints(_daysRented);
	}
	
	@Override
	public String getStatement() {
		String result = "";
		return result = "\t" + this.getMovie().getTitle() + "\t" + 	String.valueOf(this.getCharge()) + "\n";
	}
	
	@Override
	public double applyDiscount() {
		return this.getCharge();
	}
}
