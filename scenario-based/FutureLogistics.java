package scenario_based_real_wala;

import java.util.Scanner;

// ===================== GoodsTransport =====================
abstract class GoodsTransport {

    protected String transportId;
    protected String transportDate;
    protected int transportRating;

    public GoodsTransport(String transportId, String transportDate, int transportRating) {
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    public String getTransportId() {
        return transportId;
    }

    public String getTransportDate() {
        return transportDate;
    }

    public int getTransportRating() {
        return transportRating;
    }

    public abstract String vehicleSelection();
    public abstract float calculateTotalCharge();
}

// ===================== BrickTransport =====================
class BrickTransport extends GoodsTransport {

    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportId, String transportDate, int transportRating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }

    @Override
    public String vehicleSelection() {
        if (brickQuantity < 300)
            return "Truck";
        else if (brickQuantity <= 500)
            return "Lorry";
        else
            return "MonsterLorry";
    }

    @Override
    public float calculateTotalCharge() {

        float price = brickPrice * brickQuantity;
        float tax = price * 0.30f;

        float discount = 0;
        if (transportRating == 5)
            discount = price * 0.20f;
        else if (transportRating == 3 || transportRating == 4)
            discount = price * 0.10f;

        int vehiclePrice = 0;
        String vehicle = vehicleSelection();

        if (vehicle.equalsIgnoreCase("Truck"))
            vehiclePrice = 1000;
        else if (vehicle.equalsIgnoreCase("Lorry"))
            vehiclePrice = 1700;
        else if (vehicle.equalsIgnoreCase("MonsterLorry"))
            vehiclePrice = 3000;

        return (price + tax + vehiclePrice) - discount;
    }
}

// ===================== TimberTransport =====================
class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    @Override
    public String vehicleSelection() {

        double area = 2 * 3.147 * timberRadius * timberLength;

        if (area < 250)
            return "Truck";
        else if (area <= 400)
            return "Lorry";
        else
            return "MonsterLorry";
    }

    @Override
    public float calculateTotalCharge() {

        double volume = 3.147 * timberRadius * timberRadius * timberLength;

        float rate;
        if (timberType.equalsIgnoreCase("Premium"))
            rate = 0.25f;
        else
            rate = 0.15f;

        double price = volume * timberPrice * rate;
        double tax = price * 0.30;

        float discount = 0;
        if (transportRating == 5)
            discount = (float) (price * 0.20);
        else if (transportRating == 3 || transportRating == 4)
            discount = (float) (price * 0.10);

        int vehiclePrice = 0;
        String vehicle = vehicleSelection();

        if (vehicle.equalsIgnoreCase("Truck"))
            vehiclePrice = 1000;
        else if (vehicle.equalsIgnoreCase("Lorry"))
            vehiclePrice = 1700;
        else if (vehicle.equalsIgnoreCase("MonsterLorry"))
            vehiclePrice = 3000;

        return (float) ((price + tax + vehiclePrice) - discount);
    }
}

// ===================== Utility =====================
class Utility {

    public boolean validateTransportId(String transportId) {

        if (!transportId.matches("RTS[0-9]{3}[A-Z]")) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return false;
        }
        return true;
    }

    public GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");

        String transportId = data[0];
        String transportDate = data[1];
        int transportRating = Integer.parseInt(data[2]);
        String transportType = data[3];

        if (!validateTransportId(transportId))
            return null;

        if (transportType.equalsIgnoreCase("BrickTransport")) {
            return new BrickTransport(
                    transportId,
                    transportDate,
                    transportRating,
                    Float.parseFloat(data[4]),
                    Integer.parseInt(data[5]),
                    Float.parseFloat(data[6])
            );
        }

        if (transportType.equalsIgnoreCase("TimberTransport")) {
            return new TimberTransport(
                    transportId,
                    transportDate,
                    transportRating,
                    Float.parseFloat(data[4]),
                    Float.parseFloat(data[5]),
                    data[6],
                    Float.parseFloat(data[7])
            );
        }

        return null;
    }

    public String findObjectType(GoodsTransport goodsTransport) {

        if (goodsTransport instanceof TimberTransport)
            return "TimberTransport";
        else if (goodsTransport instanceof BrickTransport)
            return "BrickTransport";

        return "Unknown";
    }
}

// ===================== UserInterface =====================
public class FutureLogistics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        GoodsTransport gt = utility.parseDetails(input);

        if (gt == null)
            return;

        System.out.println("\nTransporter id : " + gt.getTransportId());
        System.out.println("Date of transport : " + gt.getTransportDate());
        System.out.println("Rating of the transport : " + gt.getTransportRating());

        if (gt instanceof BrickTransport) {
            BrickTransport bt = (BrickTransport) gt;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
        }

        System.out.println("Vehicle for transport : " + gt.vehicleSelection());
        System.out.println("Total charge : " + gt.calculateTotalCharge());
    }
}
