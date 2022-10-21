package miniprojekt2;

class Discountproduct extends Product {
	
	private double discount;
	
	Discountproduct(String prodName, int prodPrice, int prodStock, double discount) {
		super(prodName, prodPrice, prodStock);
		this.discount = discount;
	}

	
	double discountedPrice() {
		return getProdPrice() - (getProdPrice() * discount);
	}
}
