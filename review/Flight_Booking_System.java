package review;
import java.util.ArrayList;
import java.util.Scanner;

class Flight{
	String flightNo;
	String source;
	String destination;
	
	Flight(String flightNo,String source,String destination){
		this.flightNo=flightNo;
		this.source=source;
		this.destination=destination;
	}
	void display(){
		System.out.println(flightNo + " : " + source + " -> " + destination);
	}
}

public class Flight_Booking_System {
	static Flight[] flights = {
			new Flight("A01","bareily","SPN"),
			new Flight("A02","lucknow","Delhi"),
			new Flight("A03","Delhi","Dubai")
	};
	
	static ArrayList<Flight> bookings = new ArrayList<>();
	
	static void searchFlight(String src,String dest) {
		boolean found =false;
		for(Flight f : flights) {
			if(f.source.equalsIgnoreCase(src)&&
			 f.destination.equalsIgnoreCase(dest)) {
				f.display();
				found=true;
			}
		}
		if(!found) {
			System.out.println("no flight found");
		}
		
	}
	
	static void bookTicket(String flightNum) {
		for(Flight f : flights) {
			if(f.flightNo.equalsIgnoreCase(flightNum)) {
				bookings.add(f);
				System.out.println("flight booked");
				return;
			}
		}
		System.out.println("invalid flight number!");
		
	}
	
    static void displayBooking() {
    	if(bookings.isEmpty()) {
    		System.out.println("no booking yet");
    		
    	}else {
    		System.out.println("your booking status is-->");
    		for(Flight f:bookings) {
    			f.display();
    		}
    	}
		
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice ;
		
		do {
			 System.out.println("\n1. Search Flight");
	            System.out.println("2. Book Flight");
	            System.out.println("3. View Bookings");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();
	            
	            switch(choice) {
	            case 1:
	            	     System.out.println("enter source");
	            	     String src =sc.nextLine();
	            	     System.out.println("enter destination");
	            	     String dest = sc.nextLine();
	            	     searchFlight(src,dest);
	            	     break;
	            case 2:
	            	      System.out.println("enter flight number");
	            	      String flightNo=sc.nextLine();
	            	      bookTicket(flightNo);
	            	      break;
	            case 3:
	            	      displayBooking();
	            	      break;
	            case 4:
	            	      System.out.println("thank you");
	            	 default:
	            		    System.out.println("invalid choice!");
	            }
		}while(choice!=4);
		sc.close();

	}

}
