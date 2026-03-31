package M1Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Festival{
	public Festival(String name, String location, int date) {
		super();
		this.name = name;
		this.location = location;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public int getDate() {
		return date;
	}
	String name;
	String location;
	int date;
	
	public abstract void printDetails();
	
}
class Food extends Festival{
	String cuisine;
	int numStalls;
	int entryFees;
	
	public Food(String name,String location,int date,String cuisine,int numStalls,int entryFee) {
		super(name,location,date);
		this.cuisine=cuisine;
		this.numStalls=numStalls;
		this.entryFees=entryFee;
	}
	@Override
	public void printDetails() {
		System.out.println("Festival Name: "+name+"\n"+"Location: "+location+"\n"+"Date: "+date+"\n"+"Cuisine: "+cuisine+"\n"+"Number of Stalls: "+numStalls+"\n"+"Entry fee: "+ entryFees);
	}
	
}
class Music extends Festival{
	public Music(String name, String location, int date, String headliner, String musicGenre, int ticketPrice) {
		super(name, location, date);
		this.headliner = headliner;
		this.musicGenre = musicGenre;
		this.ticketPrice = ticketPrice;
	}
	String headliner;
	String musicGenre;
	int ticketPrice;
	@Override
	public void printDetails() {
		System.out.println("Festival Name: "+name+"\n"+"Location: "+ location +"\n"+"Date: "+date+"\n"+"headliner: "+headliner+"\n"+"musicGenre: "+musicGenre+"\n"+"ticketPrice: "+ ticketPrice);
		
	}
	
}
class Art extends Festival{
	public Art(String name, String location, int date, String artType, int numArtist, int exhibitionFee) {
		super(name, location, date);
		this.artType = artType;
		this.numArtist = numArtist;
		this.exhibitionFee = exhibitionFee;
	}
	String artType;
	int numArtist;
	int exhibitionFee;
	@Override
	public void printDetails() {
		System.out.println("Festival Name: "+name+"\n"+"Location: "+location+"\nDate: " +date+"artType: " +artType+"\n"+"numArtist: "+numArtist+"\n"+"exhibitionFee: "+ exhibitionFee);
		
	}
}
class Util{
	List<Festival> list = new ArrayList<>();
	public void addFest(Festival f) {
		list.add(f);
		
	}
	public void displayFest(String name) {
		for(Festival f : list) {
			if(f.getName().equalsIgnoreCase(name)) {
				f.printDetails();
			}
		}
	}
}

public class EventPlannerManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Util u = new Util();
		
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			String[] values = input.split(" ");
			
			if(values[0].equalsIgnoreCase("add_festival")) {
				if(values[1].equalsIgnoreCase("music")) {
					String name = values[2];
					String location =  values[3];;
					int date = Integer.parseInt(values[4]);
					String headliner = values[5];
					String musicGenre = values[6];
					int ticketPrice = Integer.parseInt(values[7]);
					
					u.addFest(new Music(name,location,date,headliner,musicGenre,ticketPrice));
					
				}else if(values[1].equalsIgnoreCase("food")) {
					
						String name = values[2];
						String location =  values[3];;
						int date = Integer.parseInt(values[4]);
						String cuisine = values[5];
						int numStalls = Integer.parseInt(values[6]);
						int entryFees = Integer.parseInt(values[7]);
						
						u.addFest(new Food(name,location,date,cuisine,numStalls,entryFees));
					
				}else if(values[1].equalsIgnoreCase("art")) {
					
						String name = values[2];
						String location = values[3];
						int date = Integer.parseInt(values[4]);
						String artType = values[5];
						int numArtist = Integer.parseInt(values[6]);
						int exhibitionFee = Integer.parseInt(values[7]);
						
						u.addFest(new Art(name,location,date,artType,numArtist,exhibitionFee));
					}
				
				
					
				}else if(values[0].equalsIgnoreCase("display_details")) {
					String name = values[1];
					u.displayFest(name);
				
				}
				else if(values[0].equalsIgnoreCase("exit")) {
					System.out.println("exit");
				}
				
		}
			
	}

}
