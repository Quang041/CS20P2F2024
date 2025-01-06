import com.phidget22.*;

public class SmartPhidget {

    public static void main(String[] args) throws Exception {
        
        // Create temperature sensor
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Temperature Event | Event runs when data input from the sensor changes
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                double tempInC = e.getTemperature();  // Get the updated temperature from the event
                double tempInF = (tempInC * 1.8) + 32;
                if (tempInC >= 21) {
                    System.out.println("Temperature: " + tempInC + " °C - " + tempInF + " °F");
                } else {
                    System.out.println("The room is too cold");
                }
            }
        });

        // Open the sensor with a timeout of 10000ms
        temperatureSensor.open(10000);

        // Keep program running to listen to events
        
        while (true) {
            // Sleep to avoid overwhelming the system
            Thread.sleep(150); 
        }
    }
}
