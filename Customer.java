package miniprojekt2;

class Customer {
	private int prodAmount= 0;
	private double sumPrice = 0;
	
	Customer(int prodAmount, double sumPrice) {
		this.prodAmount = prodAmount;
		this.sumPrice = sumPrice;
	}
	
	void setAddtoCart(int prodAmount,double sumPrice) {
		this.prodAmount += prodAmount; // this.prodAmount = this.prodAmount + prodAmount
		this.sumPrice += sumPrice;
							
	}
	
	
	 double getSumPrice() {
		return sumPrice;
	}
	 
	 int getProdAmount() {
		 return prodAmount;
	 }

	

}
