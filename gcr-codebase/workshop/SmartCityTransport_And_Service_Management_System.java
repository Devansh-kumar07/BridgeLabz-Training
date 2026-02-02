package scenario_based_real_wala;

interface TransportService {
	default void printServiceDetails() {
		
	}
}

interface GeoUtils{
   static void calculateDistance() {
		
	}
}

interface FareCalculator{
	void calculateFare();
}

class VehicleServices{
	
	 protected boolean isAvailable;
	 protected String departureTime;
	 protected String arrivalTime;
	 protected int fare;
	 
	 public VehicleServices(boolean isAvailable, String departureTime, String arrivalTime, int fare) {
		
			this.isAvailable = isAvailable;
			this.departureTime = departureTime;
			this.arrivalTime = arrivalTime;
			this.fare = fare;
		}
	    
	    public boolean isAvailable() {
			return isAvailable;
		}
		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
		public String getDepartureTime() {
			return departureTime;
		}
		public void setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
		}
		public String getArrivalTime() {
			return arrivalTime;
		}
		public void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}
		public int getFare() {
			return fare;
		}
		public void setFare(int fare) {
			this.fare = fare;
		}
	 
	 
	    
class BusService extends VehicleServices implements TransportService,FareCalculator{
	
	int distanceCoverage;

	public BusService(boolean isAvailable, String departureTime, String arrivalTime, int fare) {
		super(isAvailable, departureTime, arrivalTime, fare);
		this.distanceCoverage=distanceCoverage;
	}
	
	public int getdistanceCoverage() {
		return distanceCoverage;
	}
  		
}


class MetroService extends VehicleServices implements TransportService,FareCalculator{

	public MetroService(boolean isAvailable, String departureTime, String arrivalTime, int fare) {
		super(isAvailable, departureTime, arrivalTime, fare);
		
	}
	
}

class TaxiService extends VehicleServices implements TransportService,FareCalculator{

	public TaxiService(boolean isAvailable, String departureTime, String arrivalTime, int fare) {
		super(isAvailable, departureTime, arrivalTime, fare);
		
	}
	
	
   }
}

public class SmartCityTransport_And_Service_Management_System {

	public static void main(String[] args) {
		

	}

}
