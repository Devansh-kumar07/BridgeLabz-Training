import java.util.*;

public class SmartLighting {
    public static void main(String[] args) {
         Runnable motionTrigger = () -> System.out.println("Lights ON with motion sensor pattern");
        Runnable timeTrigger   = () -> System.out.println("Dim lights for evening mode");
        Runnable voiceTrigger  = () -> System.out.println("Voice command activated: Bright lights!");

        motionTrigger.run();
        timeTrigger.run();
        voiceTrigger.run();
    }
}
