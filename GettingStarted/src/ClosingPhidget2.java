//Add Phidgets Library
import com.phidget22.*;
public class ClosingPhidget2 {
   public static void main(String[] args) throws Exception{
       //Create
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       //Open
       temperatureSensor.open(1000);
       //Use your Phidgets
       System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
      
       //Close your Phidgets
       temperatureSensor.close();
       temperatureSensor.open(1000);
       //Use your Phidgets
       System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
       System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
       System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
      
       //Close your Phidgets
       temperatureSensor.close();
   }
}
 
