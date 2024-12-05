/*
Program: EvenAndOdd.java          Date: December 5, 2024

Purpose: Application that generates 25 randoms integers between 0 and 99 and then displays all the evens on one line and all the odds on
the next line.

Author: Quang Nguyen
School: CHHS
Course: Computer Programming 20
*/
package Mastery;

public class EvenAndOdds {

	public static void main(String[] args) {
		final int cons = 25;
		int[] EvenAndNum = new int[cons];
		
		
		int Even = 0;
		int Odd = 0;
		for (int i = 0; i<cons; i++) {
			EvenAndNum[i] = (int) (100 * Math.random() + 0);
		}
		
		for (int i = 0; i<cons; i++) {
			if ( EvenAndNum[i] % 2 ==0) {
				Even ++;
			}
			else if ( EvenAndNum[i]%2==1) {
				Odd ++;
			}
		}
		int[] even = new int[Even];
		int[] odd = new int[Odd];
		
		int evenindex = 0;
		int oddindex = 0;
		for (int i =0; i<cons; i++) {
			if (EvenAndNum[i]%2==0) {
				even[evenindex] = EvenAndNum[i];
				evenindex ++;
			}
			else if (EvenAndNum[i]%2==1) {
				odd[oddindex] = EvenAndNum[i];
				oddindex ++;
			}
		}
		
		System.out.println("Even: ");
		for (int i = 0; i<even.length; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Odd: ");
		for (int i = 0; i<odd.length; i++) {
			System.out.print(odd[i]+" ");
		}
	}
}
/* Screen Dump
Even: 
26 30 68 90 16 74 48 96 22 54 76 52 58 26 46 78  
Odd: 
55 73 25 5 33 5 27 75 91 
___________________________________________________
Even: 
74 64 44 30 74 46 32 24 52 16 94  
Odd: 
11 75 33 23 99 67 79 9 67 59 47 51 87 89 
 */
