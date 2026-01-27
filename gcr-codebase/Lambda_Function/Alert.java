import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient needs urgent attention"),
            new Alert("Info", "New patient admitted"),
            new Alert("Reminder", "Medication due")
        );
        Predicate<Alert> criticalFilter = a -> a.type.equals("Critical");

        List<Alert> filteredAlerts = alerts.stream()
                                           .filter(criticalFilter)
                                           .collect(Collectors.toList());

        System.out.println("Filtered Alerts: " + filteredAlerts);
    }
}
