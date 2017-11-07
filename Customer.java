package storeManagement;//created package as storeManagement

/**
 * Creating class Customer and class knows about his customerID,customerName, customerNumber.
 * Constructor creates Customer object with the given id, name & contact no.
 * Creating method addBookedProduct.
 * addBookedProduct () method will add the product into cart which is booked by the customer to
    his bookedProductList. 
 */

import java.util.ArrayList;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly **/
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,international class list.
//arraylist class is an array-based implementation of list interface
//import keyword is used to import built-in and user defined packages into our java source file so that our class can refer to class thath is in another package by directly using its name
//java.util is a built-in package
/*ArrayList is one of the package in java.util
* ArrayList provides resizable array,implements all list operations,allows all elements includes null**/

public class Customer { // Creating class customer
	// Declaring variables as mention in the project
	int customerID;//by using integer initializng customerID
	String customerName;//string are sequence of characters,strings are objects,java provide string class to create or manipulate strings
	String customerNo;//customerNo
	
	/*
	 * Creating an ArrayList which extends AbstractList and implements the List
	     interface for bookedProductList.
	 */
	//by using new keyword created object ArrayList
	ArrayList<Product> bookedProductList = new ArrayList<Product>(); // Creating  an array list object
																		
	/**
	 * here we are creating constructor for the customer class
	 * constructor is used to initialize the object,provides data for the object
	 * customerId
	 *  StrinName
	 * phoneNo
	 */
	public Customer(int customId, String name, String phoneNo) { // Creating method
																
        // Super() is a reference variable which is used to refer immediate  parent class constructor.
		super();
		
		// Giving reference to the objects using this keyword
		this.customerID = customId;
		this.customerName = name;
		this.customerNo = phoneNo;

	}

	public void addBookedProduct(Product abp) { // Creating addBookedProduct()  method as mentioned in the project
		/**
		 * here customer will know which booked product is unavailable in his
		 * productList and also add product in his productList
		 **/
		//Here public is a access modifier which defines who can access this method
		//void is a keyword wont return any value after it is executed
		abp.setProductStatus("Booked"); // Creating object
		/*set is a collection that cannot contain duplicate elements*/
		bookedProductList.add(abp);
	}

	// Constructor creates Customer class objects with the given id, name & customer no.
	/**
	 * here we are using getter n setter with all three properties of customer
	 * class we are using the getter n setter because it help us to view the
	 * value of the variables,and we can also modify the value with the help of
	 * this getter n setter
	 * 
	 * @return
	 */
	public int getCustomerID() {//Here public is a access modifier which defines who can access this method
		//initializing customerId
        //here get method obtains customerId
		return customerID;//customerId will return using return keyword
	}

	public void setCustomerID(int customerID) {//Here public is a access modifier which defines who can access this method
		//set method stores the customerId details
        //using void because it does not return customerId after it gets executed
		this.customerID = customerID;//refering customerID
	}

	public String getCustomerName() {//by using string class we can create  customer name
		return customerName;//return customerName
	}

	public void setCustomerName(String customerName) {//Here public is a access modifier which defines who can access this method
		this.customerName = customerName;//refering customerName
	}

	public String getCustomerNo() {//by using string class we can take  customerNo
		return customerNo;//returning customerNo
	}

	public void setCustomerNo(String customerNo) {//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		this.customerNo = customerNo;//refering customerNo
	}

}
