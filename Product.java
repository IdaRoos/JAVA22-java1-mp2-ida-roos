package miniprojekt2;

class Product {
	private String prodName;
	 private int prodPrice;
	private int prodStock;
	
	
	Product(String prodName, int prodPrice, int prodStock)
	{
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodStock = prodStock;
		
	}
	
	void setStockupdate() {
		if(this.prodStock <= 0) 
		{this.prodStock=0;}
		this.prodStock--;

		
		
	}
	

	
	int getStockUpdate() {
		return prodStock;
	}
	
	int getProdPrice() {
		return prodPrice;
	}
	
	String getProdName() {
		return prodName;
	}
	

}
