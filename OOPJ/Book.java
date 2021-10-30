import java.util.*;

class Book {
	int id,price;
	String name;
	int highestPrice;
	Scanner scan = new Scanner(System.in);

	Book(int i){
		System.out.println("Enter id of book "+(i+1));
		id = scan.nextInt();
		System.out.println("Enter name of book "+(i+1));
		scan.nextLine();
		name = scan.nextLine();
		System.out.println("Enter price of book "+(i+1));
		price = scan.nextInt();
	}

	void searchBookWithHighestPrice(Book book[]){
		highestPrice = price;

		for(int i=1;i<5;i++){
			if(book[i].price>highestPrice)
				highestPrice = book[i].price;
		}

		System.out.println("Highest Price: "+highestPrice);

		for(int i=1;i<5;i++){
			if(book[i].price==highestPrice)
				System.out.println(book[i]);
		}
	}

	public String toString(){
		return "Id: "+id+"\nName: "+name+"\nPrice: "+price;
	}

	public static void main(String args[]){
		Book book[] = new Book[5];

		for(int i=0;i<5;i++){
			book[i] = new Book(i);
		}

		book[0].searchBookWithHighestPrice(book);

	}
}