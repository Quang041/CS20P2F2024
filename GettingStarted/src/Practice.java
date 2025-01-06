//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file.
import com.phidget22.*;
public class Practice {
   public static void main(String[] args) throws Exception{
       //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       DigitalOutput redLED = new DigitalOutput();
       DigitalOutput greenLED = new DigitalOutput();
       //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.    
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       greenLED.setHubPort(4);
       greenLED.setIsHubPortDevice(true);
      
       temperatureSensor.open(2000);
       redLED.open(2000);
       greenLED.open(2000);
       //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
       while(true) {
       	double tempInC = temperatureSensor.getTemperature();
       	double tempInF = (tempInC*1.8)+32;
       	if (20<tempInC||tempInC<24) {
       		greenLED.setState(true);
       		Thread.sleep(500);
       		System.out.println("Temperature: "+tempInC+" °C ("+tempInF+"°F)");
       	}
       	else {
       		redLED.setState(true);
       		Thread.sleep(500);
       		System.out.println("Temperature: "+tempInC+" °C ("+tempInF+"°F)");
       	}
       	Thread.sleep(500);
       }
   }
}
 
