package scenario_based;

public class EarthVolume {
	public static void main(String[] args) {
		 double radiusKm = 6378;
	        double pi = Math.PI;

	        // Volume in cubic kilometers
	        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

	        // Convert radius to miles
	        double radiusMiles = radiusKm / 1.6;

	        // Volume in cubic miles
	        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

	        System.out.printf(
	            "The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",
	            volumeKm, volumeMiles);
	}

}
