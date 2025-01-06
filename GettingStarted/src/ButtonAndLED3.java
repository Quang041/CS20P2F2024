//Add Phidgets Library
import com.phidget22.*;
public class ButtonAndLED3 {
   //Turn on/off LEDs with Global Variables
   static boolean turnRedLEDOn = false;
   static boolean turnGreenLEDOn = false;
   //Handle Exceptions
   public static void main(String[] args) throws Exception {
       //Create
       DigitalInput redButton = new DigitalInput();
       DigitalInput greenButton = new DigitalInput();
       DigitalOutput redLED = new DigitalOutput();
       DigitalOutput greenLED = new DigitalOutput();
       //Address
       redButton.setHubPort(0);
       redButton.setIsHubPortDevice(true);
       greenButton.setHubPort(5);
       greenButton.setIsHubPortDevice(true);
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       greenLED.setHubPort(4);
       greenLED.setIsHubPortDevice(true);
       //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
       redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               //Record button state to turn on/off the red LED
               turnRedLEDOn = e.getState();
           }
       });
       //Event | Event code runs when data input from the sensor changes. The following event is a state change event. It will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
       greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               //Record button state to turn on/off the green LED
               turnGreenLEDOn = e.getState();
           }
       });
       //Open
       redLED.open(1000);
       greenLED.open(1000);
       redButton.open(1000);
       greenButton.open(1000);
       int countRed = 0;
       int countGreen = 0;
       //Use your Phidgets | In the button events you recorded the Button State. Here we will use that data to turn on/off the LEDs
       while(true) {
          
       	if (turnRedLEDOn) {
       		countRed +=1;
       		turnRedLEDOn = false;
       	}
       	if (turnGreenLEDOn) {
       		countGreen +=1;
       		turnGreenLEDOn = false;
       	}
       	
       	
       	if (countRed==10||countGreen==10) {
       		redLED.setState(true);
       		greenLED.setState(true);
       	
       		if (countRed==10) {
       			System.out.println("Red player won");
       		}
       		else if (countGreen==10) {
       			System.out.println("Green player won");
       	}
       		break;
       	}
           Thread.sleep(150);
       }
   }
}
 
