/*
Program: Election.java          Date: September 24, 2024
Purpose: Write a program that prompts the users for the election results, and then displays output similar to

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.text.NumberFormat;
import java.util.*;
public class Election {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		int AwbreyNY = 314159;
		int MartinezNY = 271860;
		int AwbreyNJ = 89008;
		int MartinezNJ = 121032;
		int AwbreyC = 213451;
		int MartinezC = 231034;
	
		System.out.println("Election Results for New York: ");
		System.out.println("Awbrey: " + AwbreyNY);
		System.out.println("Martinez: " + MartinezNY);
		System.out.println(" ");
		
		System.out.println("Election Results for New Jersey: ");
		System.out.println("Awbrey: " + AwbreyNJ);
		System.out.println("Martinez: " + MartinezNJ);
		System.out.println(" ");
		
		System.out.println("Elections Results for Connecticut: ");
		System.out.println("Awbrey: " + AwbreyC);
		System.out.println("Martinez: " + MartinezC);
		System.out.println(" ");
		
		int TotalVote = AwbreyNY + MartinezNY + AwbreyNJ + MartinezNJ + AwbreyC + MartinezC;
		int AwbreyTotal = AwbreyNY + AwbreyNJ + AwbreyC;
		int MartinezTotal = MartinezNY + MartinezNJ + MartinezC;
		
		double AwbreyP = (double) AwbreyTotal/TotalVote *100;
		double MartinezP = (double) MartinezTotal/TotalVote *100;

		System.out.println("Candidate        Votes        Percentage");
		System.out.println("Awbrey           "+ AwbreyTotal+"       "+nf.format(AwbreyP/0.1));
		System.out.println("Martinez         "+MartinezTotal+"       "+nf.format(MartinezP/0.1));
		System.out.println("TOTAL VOTES:     "+TotalVote);
	} 
}
/* Screen Dump
Election Results for New York: 
Awbrey: 314159
Martinez: 271860
 
Election Results for New Jersey: 
Awbrey: 89008
Martinez: 121032
 
Elections Results for Connecticut: 
Awbrey: 213451
Martinez: 231034
 
Candidate        Votes        Percentage
Awbrey           616618       49,705%
Martinez         623926       50,295%
TOTAL VOTES:     1240544
 */
