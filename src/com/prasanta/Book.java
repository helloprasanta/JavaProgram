package com.prasanta;
 
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Book {
 
	public String title;
	public String author;
	public String publisher;
	public String publicationYear;
	public String status;
	public String borrower;
	public String borrowDate;
	public String returnDate;
 
	public String status1 = "Available";
	public String status2 = "Borrowed";
	public int BookChoice;
 
 
	static ArrayList<String> UserList = new ArrayList<String>();
	static ArrayList<Book> BookList = new ArrayList<Book>();
 
	static int choice ;
 
	static Scanner userInput = new Scanner(System.in);
	static Scanner choiceInput = new Scanner(System.in);
	/*
	 * Book Constructor:
	 */
 
	/**
	 * ===================================================================================================
	 * Class Methods here:
	 * ===================================================================================================
	 */
 
	public static void displayFirstMenu(){
		System.out.println(">########################################################################");
		System.out.println("> Choose one of the options below by typing the corresponding number: ");
		System.out.println(">====================================================================");
		System.out.println("2- Add a book to the Library.");
		System.out.println("6- Blow up library.");
		System.out.println("7- Back to main menu.");
		System.out.println("0- Exit.");
		System.out.println(">########################################################################");
		System.out.println("> Enter your option here: ");
		choice = choiceInput.nextInt();//User inputs a choice (integer).
 
	}
 
	public static void displaySecondMenu(){
		System.out.println(">########################################################################");
		System.out.println("> Choose one of the options below by typing the corresponding number: ");
		System.out.println(">====================================================================");
		System.out.println("1- Check library list.");
		System.out.println("2- Add a book to the Library.");
		System.out.println("3- Borrow a book.");
		System.out.println("4- Return a book.");
		System.out.println("5- Delete a book.");
		System.out.println("6- Blow up library.");
		System.out.println("7- Back to main menu.");
		System.out.println("0- Exit.");
		System.out.println(">########################################################################");
		System.out.println("> Enter your option here: ");
		choice = choiceInput.nextInt();//User inputs a choice (integer).
 
	}
 
	public String displayBook(){
 
		String BookInfo = "----------------------------"+
						"\nTitle:.................."+title+
						"\nAuthor:................."+author+
						"\nPublisher:.............."+publisher+ 
						"\nPublicationYear:........"+publicationYear+
						"\nStatus:................."+status+
						"\nBorrower:..............."+borrower+
						"\nDate Borrowed:.........."+borrowDate+
						"\nReturn date:............"+returnDate+
						"\n----------------------------";
		return BookInfo;	
	}
 
	public void createBook(){
		System.out.println("> Enter the title of the book: ");
		title = userInput.nextLine();
 
		System.out.println("> Enter the author of the book: ");
		author = userInput.nextLine();
 
		System.out.println("> Enter the publisher of the book: ");
		publisher = userInput.nextLine();
 
		System.out.println("> Enter the publication year of the book: ");
		publicationYear = userInput.nextLine();
 
		borrower = "nobody";
		borrowDate = "none";
		returnDate = "none";
 
		status = "Available";
	}
 
	public void addBook(){
		Book newBook = new Book(); //create new book object with status "Available."
		newBook.createBook();
		BookList.add(newBook);//add the book to the BookList ArrayList.
		System.out.println("---------------------------------------------------------");
		System.out.println("> You have successfully added the book to the library!\n");
		System.out.println("---------------------------------------------------------");	
	}
 
	public void displayBookList(){
		if (BookList.size() == 0){//If the library is empty, it goes back to main menu and choice.
			System.out.println(">-------------------------------------------------------------");
			System.out.println("> There Library is Emply! Please add a book first!\n");
			System.out.println(">-------------------------------------------------------------");
			Book.displayFirstMenu();//Display to main menu.
			choice = choiceInput.nextInt();//Register new choice.
 
		} else {					
			for (int i = 0; i < BookList.size(); i++){
				System.out.printf("\n>-----------Book Index: [%s]---------------------------------\n",i+1);
				System.out.println(BookList.get(i).displayBook());	
				System.out.println(">-------------------------------------------------------------");
			}//End of For Loop.			
		}// End of Else Statement.			
	}//End of if Statement.
 
	public void borrowBook(){
		System.out.println("---------------------------------------------------------");
		System.out.println("> Here are all the books registered in the library: ");
		System.out.println("---------------------------------------------------------");		
		displayBookList();
 
		borrowLoop1:
		while(choice == 3){
			System.out.println("\n\n> Choose an available book from the above list and write down it's index number: ");
			BookChoice = choiceInput.nextInt()-1;//register user's book choice.
			if(BookChoice > BookList.size()){
				System.out.println("> The number of the book you entered is not in the list!");
				choice = 7;
			}else if(BookChoice <= BookList.size()){
				break borrowLoop1;
			}
		}		
 
		borrowLoop2:
		while(choice == 3){
			//Check if the book to be borrowed is available.
			if (BookList.get(BookChoice).status.equalsIgnoreCase(status1) && BookList.size() >= BookChoice){
				//Print the borrowed book information and change the book status to borrowed.
				BookList.get(BookChoice).status = "Borrowed";
				System.out.printf("\n> You have chosen the following book: %s\n", BookList.get(BookChoice).displayBook());
 
				//add the user name to the book borrower variable:
				BookList.get(BookChoice).borrower = borrower;
				BookList.get(BookChoice).borrowDate = "Today.";
				BookList.get(BookChoice).returnDate = "In two weeks.";
				System.out.println("> You have to return the book in two weeks!");
				choice = 7;
				break borrowLoop2;
 
			}else if(BookList.get(BookChoice).status.equalsIgnoreCase(status2) && BookList.size() >= BookChoice){
				System.out.println("> The Book you are trying to borrow is unavailable!");
				choice = 7;
				break borrowLoop2;
			}else if(BookChoice > BookList.size()-1){
				System.out.println("> The number you entered in not in the list!");
				choice = 7;
				break borrowLoop2;
			}
		}
	}
 
 
	public void returnBook(){
		System.out.println("> Enter the Title of the book you want to return: ");
		String returnBookTitle = userInput.nextLine();
		int x = 0;
		while (x < BookList.size()){//Search for the book by title, if it exists change it's status,
									//it's borrower and borrowDate.
			if (BookList.get(x).title.equalsIgnoreCase(returnBookTitle)){
				BookList.get(x).status = "Available";
				BookList.get(x).borrower = "none";
				BookList.get(x).borrowDate = "none";
				System.out.println("> You have successfully returned the book to the library!");
				Book.displayFirstMenu();//Display main menu.
				choice = choiceInput.nextInt();//Register new choice.
				break;//if a title is found, break out of the loop and display choice menu.
			}
			x = x+1;
		}//end of while loop.
		x = 0;
		while (x < BookList.size() && BookList.size() > 0){//Search for the title and if it's not in the library, 
									//print a warning message to the user, and register a new menu choice.
			if (BookList.get(x).title.equalsIgnoreCase(returnBookTitle)){
		}else{
			System.out.println("> The are no books with this title in the library." +
					" Please make sure the title is spelt correctly or choose to add the book " +
					"to the library from the main menu. ");
			Book.displayFirstMenu();//Display main menu.
			choice = choiceInput.nextInt();//Register new choice.					
			}//End of else statement.
		}//End of while loop.
		Book.displayFirstMenu();//Display main menu.
		choice = choiceInput.nextInt();//Register new choice.
	}
 
 
	public void removeBook(){
		int i = 0;
		System.out.println("---------------------------------------------------------");
		System.out.println("> Here are all the books registered in the library: ");
		System.out.println("---------------------------------------------------------");
 
		while (i < BookList.size() && BookList.size() > 0){//show the user the list of all the books
			System.out.printf("\n> Book number %s:\n%s",i+1,BookList.get(i));
			i = i+1;
		}//end of while loop.
 
		System.out.println("\n\n> Choose an available book from the above list and write down it's number: ");
		int BookChoice = choiceInput.nextInt()-1;//register user's book choice.
 
		while(choice == 5){
			try{
				if (BookChoice > 0 && BookChoice < BookList.size() && BookList.get(BookChoice).status.equalsIgnoreCase("Available")){//Check if the book to be borrowed is available.
					//Print the borrowed book information and change the book status to borrowed.
					BookList.remove(BookChoice);
					System.out.printf("\n> You have chosen to delete the following book: %s\n", BookList.get(BookChoice));
					System.out.printf("\n> The Book %s is deleted.\n", BookList.get(BookChoice));
					choice = 7;
				}
			}catch(InputMismatchException error){
				System.out.println("<ERROR> Please enter a number of book from the list: ");
				choiceInput.nextInt();
				choice = 5;
			}catch(IndexOutOfBoundsException error){
				System.out.println("<ERROR> Please enter a number of book from the list: ");
				choice = 5;
			}
		}		
	}
 
 
	public void emptyLibrary(){
		System.out.println("> WARNING < You have chosen to delete all books in the library! ");
		System.out.println("> Are you sure?? Enter yes or no: ");
		String confirmation = userInput.nextLine();
		try{
			if(confirmation.equalsIgnoreCase("yes")){
				System.out.println("> Library is being deleted...");
				BookList.clear();
				System.out.println("> Library is Empty!");
				choice = 7;
			}
		}catch(InputMismatchException error){
			System.out.println("<ERROR> Make sure you spell yes or no correctrly: ");
			choice = 6;
		}
	}
 
 
	public void addUser(){
		System.out.println("> Enter your name: ");
		borrower = userInput.nextLine();
		UserList.add(borrower);	//Add the userName to the UserList arrayList.	
	}
 
	public void run(){
 
		System.out.println("@TEST@ <<< 1 >>>>");
 
		addUser();
		System.out.println("@TEST@ <<< 2 >>>>");
 
		Book.displayFirstMenu();//Displays the main menu and ask for choice.
 
		System.out.println("@TEST@ <<< 3- Entering main while loop...>>>>");
 
		exit:
 
			while(choice != 0){	
				try{
//Choice 1:					
					if(choice == 1 && BookList.size() > 0){
 
						displayBookList();
						choice = 7;
					}
 
					if(choice == 1 && BookList.size() == 0){
						System.out.println("<ERROR> Library is empty! Please add a Book first!");
						choice = 7;
					}
//Choice 2:					
					if(choice == 2){
						//createBook();
						addBook();
						displaySecondMenu();
					}
//Choice 3:					
					if(choice == 3){
						if(BookList.size() > 0){
							borrowBook();							
						}						
					}
//Choice 4:					
					if(choice == 4){
						returnBook();
					}
//Choice 5:					
					if(choice == 5){
						removeBook();
						try{
							if(BookList.size() > 0){
								displaySecondMenu();
							}
						}catch(IndexOutOfBoundsException error){
							System.out.println("<ERROR> The array is Empty! Please add a book first!");
							choice = 7;
							//break; //Test the Break statement!!!!!!!!!!!!!!!!!!!
						}
					}
//Choice 6:					
					if(choice == 6){
						emptyLibrary();						
					}
//Choice 7:					
					if(choice == 7){
						if(BookList.size() > 0){
							displaySecondMenu();
						}else if(BookList.size() == 0){							
							displayFirstMenu();
						}
					}
//Choice 0:					
					if(choice == 0){
						break exit;
					}
				}catch(InputMismatchException error){				
					System.out.println("@TEST@ <<< 5- Breaking from main while loop... >>>>");
					break exit;
				}
 
			}//end of while loop.
 
		System.out.println("####  You have Exited the Library!  ####");
 
		}//End of run() method.
 
 
	/**
	 * ===================================================================================================
	 * End of Class Methods.
	 * ===================================================================================================
	 */
 
	public static void main(String[] args){
 
		System.out.println("> Welcome to the library!");
 
		Book newBook = new Book();
		newBook.run();
 
	}//End of Main Method.
 
}