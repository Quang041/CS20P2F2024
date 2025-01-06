import com.phidget22.*;
public class Challange {
  public static void main(String[] args) throws Exception {
      // Create
      HumiditySensor humiditySensor = new HumiditySensor();
      TemperatureSensor temperatureSensor = new TemperatureSensor();
      DigitalInput redButton = new DigitalInput();
      DigitalOutput redLED = new DigitalOutput();
      DigitalInput greenButton = new DigitalInput();
      DigitalOutput greenLED = new DigitalOutput();
      // Open
      humiditySensor.open(1000);
      temperatureSensor.open(1000);
      redButton.setHubPort(0);
      redButton.setIsHubPortDevice(true);
      redLED.setHubPort(1);
      redLED.setIsHubPortDevice(true);
      greenButton.setHubPort(5);
      greenButton.setIsHubPortDevice(true);
      greenLED.setHubPort(4);
      greenLED.setIsHubPortDevice(true);
      redButton.open(1000);
      redLED.open(1000);
      greenButton.open(1000);
      greenLED.open(1000);
      // Initial button states
      boolean prevGreenButtonState = false;
      boolean prevRedButtonState = false;
      // Default temperature setting
      double setTempInC = 21;
      while (true) {
          boolean currentRedButtonState = redButton.getState();
          boolean currentGreenButtonState = greenButton.getState();
          // Red button state change detection
          if (currentRedButtonState!=prevRedButtonState) { // Button pressed
              setTempInC-=1;        
          }
          // Green button state change detection
          if (currentGreenButtonState != prevGreenButtonState) { // Button pressed
              setTempInC+=1;
              }
          Thread.sleep(150);
          double currentTemp = temperatureSensor.getTemperature();
        
          if (Math.abs(currentTemp - setTempInC) <= 2.0) {
          	greenLED.setState(true);
          	redLED.setState(false);
          }
          else {
          	redLED.setState(true);
          	greenLED.setState(false);
          }
        
          System.out.println("Set temperature is: " + setTempInC + " °C");
          System.out.println("[Current Temperature: " + currentTemp + " °C]");
          System.out.println(" ");
          Thread.sleep(3000);
        
          		
      }
  }
}



