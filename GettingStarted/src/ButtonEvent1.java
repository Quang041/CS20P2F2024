//Add Phidgets Library
import com.phidget22.*;
public class ButtonEvent1 {
   //Handle Exceptions
   public static void main(String[] args) throws Exception {
     
       //Create
       DigitalInput redButton = new DigitalInput();
       //Address
       redButton.setIsHubPortDevice(true);
       redButton.setHubPort(0);
       //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
       redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               System.out.println("State: " + e.getState());
           }
       });
       //Open
       redButton.open(1000);
       //Keep program running
      
       for (int i = 0; i<5; i++) {
       	Thread.sleep(10);
       }
      
       for (int i = 0; i<5; i++) {
       	Thread.sleep(1000);
       }
                                                                                     
       for (int i = 0; i<5; i++) {
       	Thread.sleep(5000);
       }
   }
}
 

/*
CODE:
Lesson 2: Calls redButton.getState() repeatedly and prints the state.
Button Events: DigitalInputStateChangeList method is registered.
OUTPUT:
Lesson 2: Program repeatedly prints the button states to the screen even though the states don’t even change.
Button Events: Only prints the state when the state is changed (pressed or released).
*/
