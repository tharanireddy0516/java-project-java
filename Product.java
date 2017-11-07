package storeManagement;//created package as storeManagement
/**
 * Create class Product and class knows about productID,productName,productStatus and productPrice.
 * Constructor initializes the value of productID, name & price with the given values.
 *.Initially the status of the product is set to “Available”.
 */


 class Product { // Creating class as product
	// Declaring variables as mention in the project
	public int productID;//Here public is a access modifier which defines who can access this method
	String productName;//string is used beacause it is a collection of characters
	double productPrice;//double is used for number having decimal so taking productPrice
	String productStatus="Available";//productstatus will be available if we taken provided project
	
	public Product(int pid, String name, double price) {
		//Here public is a access modifier which defines who can access this method
		 // Super() is a reference variable which is used to refer immediate  parent class constructor..
		super();
		
		// Giving reference to the objects using this keyword
		this.productID = pid;
		this.productName = name;
		this.productPrice = price;
	}
	
	
	// Constructor creates Product class objects with the given id, name & contact no.
	//Using getter and setter functions 
	public  String getProductStatus(String status) {//Here public is a access modifier which defines who can access this method
		return productStatus;//returning productStatus
	}
	public void setProductStatus(String productStatus) {//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		this.productStatus = productStatus;
	}
	public int quantity;//Here public is a access modifier which defines who can access this method
	               
	public int getQuantity() {//initializing Quantity
		return quantity;//returning quantity
	}
	public void setQuantity(int quantity) {//using integer storing quantity
		this.quantity = quantity;//reffering quantity
	}
	public int getProductID() {///initializing ProductID
		return productID;//returning productID
	}
	public void setProductID(int productID) {//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		this.productID = productID;//reffering productID
	}
	public String getProductName() {
		return productName;//returning productName
	}
	public void setProductName(String productName){ //set method stores product name details
		//void is used to define return type of the method,void means method wont return any value
		this.productName = productName;//reffering productName
		
	}
	public double getProductPrice() {//here double is taken beacause product price can  have decimal
		return productPrice;//returning productPrice
	}
	public void setProductPrice(double productPrice) {//stores productprice
		//void is used to define return type of the method,void means method wont return any value
		this.productPrice = productPrice;//reffering productprice
	}
	
	
	
}