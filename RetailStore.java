package storeManagement;//created package as storeManagement

/**
 * Creating RetailStore class.
 * RetailStrore class knows about the storeName,customers registered with the store and product details available in the store.
 * Creating RetailStore(String storeName) constructor .This constructor initialize the storeName with the given input value.
 * Creating following methods
    -generateCustomerID():This method generates the customerID.
    -generateProductID():This method generates the productID.
    -addCustomer():This method creates a customer ID , with that it creates a customer object and then it adds to the customerList.
    -addProduct():This method creates a product ID , with that it creates a product object and then it adds to the productList.
    -checkProductAvailability(): This method returns the count of products.
    -bookProduct():This method checks for the availability of the given product in the productList of retail store.
    -calculateNetAmount():This method takes a customer ID and discount percentage as input parameters and calculates and returns the net amount.
 * 
 */

import java.util.ArrayList;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly **/
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,international class list.
//arraylist class is an array-based implementation of list interface

public class RetailStore {//created another class name RetailStore
	//Here public is a access modifier which defines who can access this method

	String storeName; // Declaring variable
	//providing string class to create or manipulate strings so here name can be modified
	/*
	 * Creating two ArrayList 
	     -custList for Customer list and 
	     -prodList for product list.
	 */
	ArrayList<Customer> custList = new ArrayList<Customer>(); // Creating Customer list object
	ArrayList<Product> prodList = new ArrayList<Product>();  // Creating Product list object 

	public int generateCustomerID() { // Creating method
		// Initializing variables 
		int count = 0;//count is use to know iteration of code
		int custId = 0;
		// It will initialize customer ID to 1 if the size of the customer list is equals to 0. 
		if (custList.size() == 0) /*using if we can control the program flow based on some condition
            used to execute these statement code bloack if expression is evaluated to true,easy to modify control flow */
            
			custId = 1;
		else {//if statement is followed by else  if above expression is false
			// It will increment the customer ID by 1 when the size of customer list increases .
			for (Customer cust : custList) { // For loop uses to provide compact way to iterate over a range of values
				                            //we can repeatedly loop until the condition is satisfied
				count++;//incrementing count by 1 return the old value,later we can assign the old value to your count variable
				if (count == custList.size()) {/*using if we can control the program flow based on some condition
				                              used to execute these statement code bloack if expression is evaluated to true,easy to modify control flow */
					                             
					custId = cust.getCustomerID() + 1;//initializing customerId
			        //here get method obtains customerId
					break;//terminates 
				}
			}
		}
		return custId;  // Return Customer ID 
	}

	public int generateProductID() { // Creating method 
		//Here public is a access modifier which defines who can access this method
		//Initializing the variables 
		int count = 0;
		int prodId = 0;
		
		// It will initialize customer ID to 1 if the size of the product list is equals to 0. 
		if (prodList.size() == 0) // If statement 
			prodId = 1;
		else {
			// It will increment the product ID by 1 when the size of product list increases .
			for (Product prod : prodList) {// For loop uses to provide easy way to iterate over a range of values
				count++;//increment
				if (count == prodList.size()) {//taking size using if statement
					prodId = prod.getProductID() + 1;//getting productID
					break;//break
				}
			}
		}
		return prodId; //Returns product id 

	}

	// This method will add new customer into the customer list and initialize a customer ID.
	public void addCustomer(String name, String phoneNo) { //Creating method
		 //addCustomer():This method creates a customer ID , with that it creates a customer object and then it adds to the customerList.
		int customId = generateCustomerID();  // Initializing value 
		Customer c = new Customer(customId, name, phoneNo); // Creating object customer using new keyword
		custList.add(c); // Adding new customer into list 

	}

	// This method will add new product into the customer list and initialize a product ID.
	public void addProduct(String name, String status, double price) { //Creating method addProduct
		//addProduct():This method creates a product ID , with that it creates a product object and then it adds to the productList.
        int pid = generateProductID(); // Initializing value and generatingProductID
        Product p = new Product(pid, name, price); // Creating object using new keyword
		prodList.add(p); // Adding new prodList into list using add method

	}

	// This method will checks the availability of product by ProductName
	public int checkProductAvailability(String ProductName) { // Creating method checkProductAvailability
		 //checkProductAvailability(): This method returns the count of products.
		int count = 0;
		for (Product prod : prodList) // For loop 
			try {//using try block beacause it enclose the code that might throw an exception
				// If getProductName equals to ProductName and status equals to Available..then it will increment the product count. 
				if ((prod.getProductName().equals(ProductName)) && (prod.getProductStatus(null).equals("Available"))) {
					count++;
				}
		// NullPointerException is thrown when the program attempts to use an object reference that has the null value. 		
			} catch (NullPointerException e) {//exception occurs in try block wll handle in catch block 
				e.printStackTrace();//it is a method of the class,prints several lines in the output console

			}

		return count; // Return product count

	}

	//Using getter and setter functions 
	public String getStoreName() {  // Creating method 
		return storeName;//returning storeName
	}

	public void setStoreName(String storeName) {//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		this.storeName = storeName;
	}

	public RetailStore(String storeName) {
		super();// Super() is a reference variable which is used to refer immediate  parent class constructor.
		this.storeName = storeName;//this kewyword reffers storeName
	}

	public void display() {  // Creating display method 

		for (Customer cust : custList) { // For loop 
			//Prints CustomerName , CustomerNo , CustomerID .
			System.out.println("\nCustomer: " + cust.getCustomerName() + "\nPhone number: " + cust.getCustomerNo()
					+ "\nCustomer_ID: " + cust.getCustomerID());//prints
		}
		

	}
	public void displayProducts(){//displaysProducts 
for (Product pd : prodList) {
			
			//Prints ProductName , ProductPrice , ProductID , ProductStatus .
			System.out.println("\nProduct: " + pd.getProductName() + "\nPrice: Rs " + pd.getProductPrice()
					+ "\nProduct_ID: " + pd.getProductID() + "\nProduct Status: " + pd.getProductStatus(null));
			//system is used to return code
			//out is a static member
			//Println is used to print text area of circle and gives output
		}
	}

	//This method will return the total number of products booked.
	public int bookProduct(int customerID, String productName, int numberOfProduct) { // Creating Method bookProduct
		//bookProduct():This method checks for the availability of the given product in the productList of retail store.
		// Initializing variables 
		int availProduct = 1;
		int count1 = 0;
		int count2 = 0;
		availProduct = checkProductAvailability(productName);//checks the availability of product
		int count3 = availProduct;
		int count4 = numberOfProduct;

		/**
		 * If the given product is not available in the product list or no stock available, it will return 0.
		 * If the given customer is not available in the customer list, then the method will return -1.
		 **/
		for (Customer cust : custList) {// For loop uses to provide easy way to iterate over a range of values
			count1++;//increment
			if (cust.getCustomerID() == customerID) {//taking if statement
				for (Product prod : prodList) {//product list
					count2++;

					if (prod.getProductName().equals(productName)) { //initalizing productname

						if (availProduct <= numberOfProduct) {//if statement is followed by else  if above expression is false otherwise returns true
							cust.addBookedProduct(prod);//bookProduct():This method checks for the availability of the given product in the productList of retail store.
							count3--;//product not available
							if (count3 == 0)//if product is available
								break;//break
						}
						if (availProduct > numberOfProduct) // If availProduct is greater than numberOfProduct

						{
							availProduct = numberOfProduct;//if it equals then we can bookproduct
							cust.addBookedProduct(prod);//bookProduct():This method checks for the availability of the given product in the productList of retail store.
							count4--;//decrement
							if (count4 == 0)//if product is available
								break;//break
						}

					} else if (count2 == prodList.size()) {//size of product
						availProduct = 0;//if product is available
						break;//break
					}
				}

			} else if (count1 == custList.size()) {//here we can provide custlist size and can provide details according to size
				availProduct = -1;//if the product is not available
				break;//break
			}
		}
		return availProduct; // Return available product 
	}

	// This method will returns the net amount that the customer need to pay for the entire booking he has made.
	public double calculateAmount(int customerID,int discount) {//calculateAmount():This method takes a customer ID and discount percentage as input parameters and calculates and returns the net amount.
		double amount = 0;//double is used for number having decimal so taken amount
		for (Customer cust : custList)
			// The method takes a customer ID as input parameters and calculates the net amount . 
			if (cust.getCustomerID() == customerID) {//if statement is followed by else  if above expression is false otherwise returns true
				ArrayList<Product> prodList1 = cust.bookedProductList;//created prodList1 is a object
				for (Product p : prodList1) {// For loop uses to provide easy way to iterate over a range of values
					// Net amount is calculated by the sum of price of all products that the customer has booked. 
					amount += p.getProductPrice();//initializing ProductPrice
			        //here get method obtains ProductPrice

				}

				break;//terminates
			}
		// Discount is applied on the sum of price of all products.
		amount=amount-((amount*discount)/100);
		
		return amount; // Returns amount 
	}

}