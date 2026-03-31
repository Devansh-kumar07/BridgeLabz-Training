package M1Sets;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class GlobalShipmentManifestValidation {

    // Shipment Code Validation
    public static boolean validateCode(String code) {
        return code.matches("^SHIP-(?!.*(\\d)\\1{3})[1-9]\\d{5}$");
    }

    // Leap Year Check
    public static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Date Validation
//    public static boolean validateDate(String date) {
//        try {
//            String[] parts = date.split("-");
//            int year = Integer.parseInt(parts[0]);
//            int month = Integer.parseInt(parts[1]);
//            int day = Integer.parseInt(parts[2]);
//
//            if (year < 2000 || year > 2099) return false;
//            if (month < 1 || month > 12) return false;
//
//            int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
//
//            if (month == 2 && isLeap(year)) {
//                days[1] = 29;
//            }
//
//            return day >= 1 && day <= days[month - 1];
//
//        } catch(Exception e) {
//            return false;
//        }
//    }
    public static boolean validateDate(String s) {
    	try {
        LocalDate ld = LocalDate.parse(s);
        int year = ld.getYear();

        if (year < 2000 || year > 2099) {
            return false;
        }

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (ld.getMonth() == Month.FEBRUARY) {
            int day = ld.getDayOfMonth();

            if (isLeap && day > 29) return false;
            if (!isLeap && day > 28) return false;
        }
        return true;
    	}catch(Exception e) {
    		
    	

        return true;}
    }
    

    // Mode Validation
    public static boolean validateMode(String mode) {
        return mode.equals("AIR") ||
               mode.equals("SEA") ||
               mode.equals("ROAD") ||
               mode.equals("RAIL") ||
               mode.equals("EXPRESS") ||
               mode.equals("FREIGHT");
    }

    // Weight Validation
    public static boolean validateWeight(String weight) {

        try {

            double value = Double.parseDouble(weight);

            if(value < 0 || value > 999999.99) {
                return false;
            }

            if(weight.contains(".")) {

                String[] parts = weight.split("\\.");
                String decimal = parts[1];

                if(decimal.length() > 2) {
                    return false;
                }
            }

            if(weight.length() > 1) {

                if(weight.startsWith("0") && !weight.startsWith("0.")) {
                    return false;
                }
            }

            return true;

        }
        catch(Exception e) {
            return false;
        }
    }
    

    // Status Validation
    public static boolean validateStatus(String status) {
        return status.equals("DELIVERED") ||
               status.equals("CANCELLED") ||
               status.equals("IN_TRANSIT");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- >0 &&  sc.hasNextLine()) {

            String input = sc.nextLine();
            String[] values = input.split("\\|");

            String code = values[0];
            String date = values[1];
            String mode = values[2];
            String weight = values[3];
            String status = values[4];

            if (validateCode(code) &&
                validateDate(date) &&
                validateMode(mode) &&
                validateWeight(weight) &&
                validateStatus(status)) {

                System.out.println("COMPLIANT RECORD");
            } else {
                System.out.println("NON-COMPLIANT RECORD");
            }
        }
    }
}