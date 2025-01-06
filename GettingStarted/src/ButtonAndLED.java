//Add Phidgets Library
import com.phidget22.*;
public class ButtonAndLED {
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
       //Use your Phidgets | In the button events you recorded the Button State. Here we will use that data to turn on/off the LEDs
       while(true) {
           //turn red LED on based on red button input
           redLED.setState(turnGreenLEDOn);
           //turn green LED on based on green button input
           greenLED.setState(turnRedLEDOn);
           //sleep for 150 milliseconds
           Thread.sleep(150);
       }
   }
}
 
/*
Buttons and LEDs:
Use variables turnRedLEDOn and turnGreenLEDOn to store button states and control LEDs.
Use addStateChangeListener to monitor button state changes and update the variables.
Code complexity: Slightly more complex but more resource-efficient due to event-driven design.
Output: Button state changes are captured immediately through event listeners
Lesson 3 code:
Directly checks button states using getState().
No event listeners. It continuously checks button states in the main loop
Code complexity: Simpler but may consume more CPU due to continuous polling in the loop.
Output: State updates depend on the polling interval (Thread.sleep(150)), which might introduce a slight delay.
*/