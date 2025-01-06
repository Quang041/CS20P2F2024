//Add Phidgets Library
import com.phidget22.*;
public class AttachAndDetach {
   public static void main(String[] args) throws Exception {
     
        //Create
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       DigitalInput redButton = new DigitalInput();
       DigitalOutput redLED = new DigitalOutput();      
    
       redButton.setHubPort(0);
       redButton.setIsHubPortDevice(true);
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       //Open | Connect your program to your physical devices.
      
       //Data Event | Event code runs when data from sensor changes.
      
       //Attach Event | Attach Events run when a Phidget is connected to the Object
       temperatureSensor.addAttachListener(new AttachListener() {
           public void onAttach(AttachEvent e) {
               System.out.println("Attach: Temperatture");
           }
       });
       //Detach Event | Detach Events run when a Phidget is disconnected from the Object
       temperatureSensor.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Detach: Temperature");
           }
       });
       redButton.addAttachListener(new AttachListener() {
       	public void onAttach(AttachEvent e) {
               System.out.println("Attach: Button");
           }
       });
       redButton.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Detach: Button");
           }
       });
       redLED.addAttachListener(new AttachListener() {
           public void onAttach(AttachEvent e) {
               System.out.println("Attach: LED");
           }
       });
       redLED.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Detach: LED");
           }
       });
       //Open
       redButton.open(1000);
       redLED.open(1000);
       temperatureSensor.open(1000);
       //Keep program running
       while (true) {
           Thread.sleep(150);
       }
   }
}

