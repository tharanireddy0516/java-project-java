package storeManagement;//created package as storeManagement
/**
 * The retail store wants to automate the following processes:
    -Booking a product by customer
      -Bill generation for customer
        -Inventory status check 
 * Creating MENU driven for good user interface by using Switch case .
 */

import java.io.BufferedReader;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly **/
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,international class list.
//bufferedreader class reads text from a character-input stream,buffering character
import java.io.IOException;//exception thrown where there has been an input/output error
import java.io.InputStreamReader;//this class is a bridge from byte streams to character streams.
                                 //reads byte and decode them into character

public class RetailStore_Main { // Creating main class as RetailStore_Main

	public static void main(String[] args) throws IOException { // Main Method
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter	

		// BufferedReader class is used to read the text from a character-based input stream.
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); // Creating Buffer reader object using new keyword
																						

		// Creating RetailStore class object using new keyword
		RetailStore retailStore = new RetailStore("Spencer Home Appliances");

		// adding products into product list using add method
		retailStore.addProduct("LG Television101", "Available", 35600);
		retailStore.addProduct("LG Television101", "Available", 35600);
		retailStore.addProduct("LG Television101", "Available", 35600);
		retailStore.addProduct("LG Television101", "Available", 35600);
		retailStore.addProduct("LG Refrigerator601", "Available", 20000);
		retailStore.addProduct("LG MicroovenM701", "Available", 20000);
		retailStore.addProduct("LG MicroovenM701", "Available", 20000);
		retailStore.addProduct("Sony24", "Available", 40000);
		retailStore.addProduct("Sony24", "Available", 40000);
		retailStore.addProduct("Sony24", "Available", 40000);
		retailStore.addProduct("Sony24", "Available", 40000);
		retailStore.addProduct("Sony24", "Available", 40000);
		retailStore.addProduct("Sony24", "Available", 40000);
		// adding Customer details into customer list using add method
		retailStore.addCustomer("THARANI","1234567890");
		retailStore.addCustomer("BHAVITHA","1543585690");
		retailStore.addCustomer("VIVEKA","18684567890");
		retailStore.addCustomer("ANEESHA","15674567890");
		retailStore.addCustomer("ALEKHYA","1334567890");
		   

		//Initializing variables 
		String choice;//string is used beacause it is a collection of characters
		String name = "";
		String status = "Available";//status will be available
		
		int id = 0;
		String num;//using long a primitive data type so we can take wider range values than int
		int noProducts = 1;
		int discount = 10;//discount
		double amount;////double is used for number having decimal amount can have decimal

		
		System.out.println("\t Spencer Home Appliances");//system is used to return code
        //out is a static member
      	//Println is used to print text  and gives output
		do { // in do above will statement excecutes
            
			// Creating menu 
			System.out.println("\nPress # for\n\t:New product" + "\n\nPress ! for\n\t:Customer List"+"\n\nPress & for\n\t:Product List"
					+ "\n\nPress * for\n\t:New customer" + "\n\nPress @ for\n\t:Availability of product"
					+ "\n\nPress + for\n\t:Add to Kart" + "\n\nPress % for\n\t:Total bill");//system is used to return code
	           //out is a static member
	         	//Println is used to print text  and gives output
			choice = buffer.readLine(); //readLine() method is used to read data line by line.

			switch (choice) { // Creating switch case to execute one statement from multiple conditions.
			
			case "#": // Condition 1 to add new product in product the list 
				System.out.println("\t\t\tNew Product");//system is used to return code
		           //out is a static member
	         	//Println is used to print text  and gives output
				System.out.println("Enter product name:");
				name = buffer.readLine();
				System.out.println("Enter the price of product:");//prints
				double price = Double.parseDouble(buffer.readLine());//used to initialise a string contains a numerical value
				retailStore.addProduct(name, status, price);//adding
				break;//terminates case #

			case "!": // Condition 2 to display lists 
				System.out.println("\t\t\tCustomer List");
				retailStore.display();//displaying retailStore
				break;//terminates case !
			case "&": // Condition 3 to display lists 
				System.out.println("\t\t\tProduct List");
				retailStore.displayProducts();//displaying retailStore
				break;//terminates case &

			case "*": // Condition 4 to add new customer in customer the list 
				System.out.println("\t\t\tNew Customer");//system is used to return code
		           //out is a static member
	         	//Println is used to print text int to byte and gives output
				System.out.println("Enter customer name:");
				name = buffer.readLine();
				System.out.println("Enter contact number:");
				//by using Integer.parseInt  we can convert integger to string
				num = buffer.readLine();//readLine() method is used to read data line by line.
				retailStore.addCustomer(name, num);//adds customer name
				break;

			case "@": // Condition 5 to check the availability of product
				System.out.println("\t\t\tAvailability of product");
				System.out.println("Enter product:");//prints
				name = buffer.readLine();//readLine() method is used to read data line by line.
				int number1 = retailStore.checkProductAvailability(name);
				System.out.println("Number of product:" + number1);
				break;

			case "+": // Condition 6 to book a product 
				System.out.println("\t\t\t Add to Kart");//system is used to return code
		           //out is a static member
	         	//Println is used to print text int to byte and gives output
				System.out.println("Enter the customer id:");
				id = Integer.parseInt(buffer.readLine());//by using this we can convert integger to string
				System.out.println("Enter Product:");
				name = buffer.readLine();//readLine() method is used to read data line by line.
				System.out.println("Enter the number of products:");//prints
				noProducts = Integer.parseInt(buffer.readLine());//by using this we can convert integger to string
				retailStore.bookProduct(id, name, noProducts);//books product of three variables
				System.out.println("Item is added into Kart");
				break;

			case "%": // Condition 6 to calculate the bill 
				System.out.println("\t\t\tTotal bill");
				System.out.println("Enter the customer id:");//prints
				id = Integer.parseInt(buffer.readLine());//by using this we can convert integger to string
				amount = retailStore.calculateAmount(id, discount);//calcutlating amount
				System.out.println("Discount: " + discount + ("%"));//prints
				System.out.println("Total cost=" + amount * noProducts);
				System.out.println("-x-x- Spencer Home Appliances -x-x-");//system is used to return code
		           //out is a static member
	         	//Println is used to print text int to byte and gives output
				break;

			default: // Default condition if the user selects an invalid option  
				System.out.println("Pressed invalid button");//system is used to return code
		           //out is a static member
	         	//Println is used to print text int to byte and gives output

			}

		} while (choice != "="); // in while the condition gets statisfy after exceuting in do
	}
}