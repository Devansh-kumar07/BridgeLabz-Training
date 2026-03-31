package scenario_based_real_wala;


class RobotSafetyException extends Exception {
 public RobotSafetyException(String message) {
     super(message);
 }
}


class RobotHazardAuditor {

 public double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState)
         throws RobotSafetyException {

    
     if (armPrecision < 0.0 || armPrecision > 1.0) {
         throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
     }

     // Validate worker density
     if (workerDensity < 1 || workerDensity > 20) {
         throw new RobotSafetyException("Error: Worker density must be 1-20");
     }

     // Determine machine risk factor
     double machineRiskFactor;

     if (machineryState.equals("Worn")) {
         machineRiskFactor = 1.3;
     } else if (machineryState.equals("Faulty")) {
         machineRiskFactor = 2.0;
     } else if (machineryState.equals("Critical")) {
         machineRiskFactor = 3.0;
     } else {
         throw new RobotSafetyException("Error: Unsupported machinery state");
     }

    
     double hazardRisk =
             ((1.0 - armPrecision) * 15.0) +
             (workerDensity * machineRiskFactor);

     return hazardRisk;
 }
}


public class FactoryRobotHazard {
 public static void main(String[] args) {

     RobotHazardAuditor auditor = new RobotHazardAuditor();

     try {
         // Sample input (you can change these values)
         double armPrecision = 0.85;
         int workerDensity = 10;
         String machineryState = "Faulty";

         double risk = auditor.CalculateHazardRisk(
                 armPrecision, workerDensity, machineryState);

         System.out.println("Robot Hazard Risk Score: " + risk);

     } catch (RobotSafetyException e) {
         System.out.println(e.getMessage());
     }
 }
}

