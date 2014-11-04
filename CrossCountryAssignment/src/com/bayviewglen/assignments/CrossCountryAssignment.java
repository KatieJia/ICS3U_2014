package com.bayviewglen.assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryAssignment {

	public static void main(String[] args) {

		// Create a variable for SECONDS_PER_MINUTE as to not use magic numbers
		final int SECONDS_PER_MINUTE = 60;
		// Create a keyboard to prompt users for their time
		Scanner keyboard = new Scanner(System.in);

		// displays the last only the last two decimals of the Split
		DecimalFormat formatter = new DecimalFormat("00.00");

		System.out.print("Please enter your First and Last name: ");
		String name = keyboard.nextLine();

		// imputing the mile one time and changing the string into an integer
		// for Runner
		System.out.print(name + " Please enter your Mile One Time (mm:ss.sss) ");
		String mileOneRunner1 = keyboard.nextLine();
		int MinRunner1 = Integer.parseInt(mileOneRunner1.substring(0, mileOneRunner1.indexOf(':')));
		int MinInSecRunner1 = MinRunner1 * SECONDS_PER_MINUTE;
		double SecondsRunner1 = Double.parseDouble(mileOneRunner1.substring(mileOneRunner1.indexOf(':') + 1));
		double totalSecondsRunner1 = SecondsRunner1 + MinInSecRunner1;

		// imputing mile two for runner converting string into an integer
		System.out.print(name + " Please enter your Mile Two Time: ");
		String mileTwoRunner1 = keyboard.nextLine();
		int Min2Runner1 = Integer.parseInt(mileTwoRunner1.substring(0, mileTwoRunner1.indexOf(':')));
		int Min2InSecRunner1 = Min2Runner1 * SECONDS_PER_MINUTE;
		double Seconds2Runner1 = Double.parseDouble(mileTwoRunner1.substring(mileTwoRunner1.indexOf(':') + 1));
		double totalSeconds2Runner1 = Seconds2Runner1 + Min2InSecRunner1;

		// imputing mile three for runner converting string into an integer
		System.out.print(name + " Please enter your completeted time: ");
		String FinishRunner1 = keyboard.nextLine();
		int Min3Runner1 = Integer.parseInt(FinishRunner1.substring(0, FinishRunner1.indexOf(':')));
		int Min3InSecRunner1 = Min3Runner1 * SECONDS_PER_MINUTE;
		double Seconds3Runner1 = Double.parseDouble(FinishRunner1.substring(FinishRunner1.indexOf(':') + 1));
		double totalSeconds3Runner1 = Seconds3Runner1 + Min3InSecRunner1;

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split1Runner1 = totalSecondsRunner1;
		int MinLeft1Runner1 = (int) Split1Runner1 / SECONDS_PER_MINUTE;
		double SecondsLeft1Runner1 = Split1Runner1 % SECONDS_PER_MINUTE;
		String FinalSplitRunner1 = MinLeft1Runner1 + ":" + formatter.format(SecondsLeft1Runner1);

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split2Runner1 = totalSeconds2Runner1 - totalSecondsRunner1;
		int MinLeftRunner1 = (int) Split2Runner1 / SECONDS_PER_MINUTE;
		double SecondsLeftRunner1 = Split2Runner1 % SECONDS_PER_MINUTE;
		String FinalSplit2Runner1 = MinLeftRunner1 + ":" + formatter.format(SecondsLeftRunner1);

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split3Runner1 = totalSeconds3Runner1 - totalSeconds2Runner1;
		int MinLeft2Runner1 = (int) Split3Runner1 / SECONDS_PER_MINUTE;
		double SecondsLeft2Runner1 = Split3Runner1 % SECONDS_PER_MINUTE;
		String FinalSplit3Runner1 = MinLeft2Runner1 + ":" + formatter.format(SecondsLeft2Runner1);

		// Display the information summary of Runner and format into a table
		System.out.println("Runner One Summary");
		System.out.println("__________________");
		System.out.println("Runner:" + name);
		System.out.printf("%-20s%-10s\n", "Split One", FinalSplitRunner1);
		System.out.printf("%-20s%-10s\n", "Split Two", FinalSplit2Runner1);
		System.out.printf("%-20s%-10s\n", "Split Three", FinalSplit3Runner1);
		System.out.printf("%-20s%-10s\n", "Total", FinishRunner1);

		// place a line to differentiate between the runners
		System.out.println("______________________________________________");

		System.out.print("Please enter your First and Last name:");
		String name2 = keyboard.nextLine();

		// imputing the mile one time and changing the string into an integer
		// for Runner
		System.out.print(name2 + " Please enter your Mile One Time (mm:ss.sss) ");
		String mileOneRunner2 = keyboard.nextLine();
		int MinRunner2 = Integer.parseInt(mileOneRunner2.substring(0, mileOneRunner2.indexOf(':')));
		int MinInSecRunner2 = MinRunner2 * SECONDS_PER_MINUTE;
		double SecondsRunner2 = Double.parseDouble(mileOneRunner2.substring(mileOneRunner2.indexOf(':') + 1));
		double totalSecondsRunner2 = SecondsRunner2 + MinInSecRunner2;

		// imputing mile two for runner converting string into an integer
		System.out.print(name2 + " Please enter your Mile Two Time: ");
		String mileTwoRunner2 = keyboard.nextLine();
		int Min2Runner2 = Integer.parseInt(mileTwoRunner2.substring(0, mileTwoRunner2.indexOf(':')));
		int Min2InSecRunner2 = Min2Runner2 * SECONDS_PER_MINUTE;
		double Seconds2Runner2 = Double.parseDouble(mileTwoRunner1.substring(mileTwoRunner2.indexOf(':') + 1));
		double totalSeconds2Runner2 = Seconds2Runner2 + Min2InSecRunner2;

		// imputing mile three for runner converting string into an integer
		System.out.print(name2 + " Please enter your completeted time: ");
		String FinishRunner2 = keyboard.nextLine();
		int Min3Runner2 = Integer.parseInt(FinishRunner2.substring(0, FinishRunner2.indexOf(':')));
		int Min3InSecRunner2 = Min3Runner2 * SECONDS_PER_MINUTE;
		double Seconds3Runner2 = Double.parseDouble(FinishRunner1.substring(FinishRunner2.indexOf(':') + 1));
		double totalSeconds3Runner2 = Seconds3Runner2 + Min3InSecRunner2;

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split1Runner2 = totalSecondsRunner2;
		int MinLeft1Runner2 = (int) Split1Runner2 / SECONDS_PER_MINUTE;
		double SecondsLeft1Runner2 = Split1Runner2 % SECONDS_PER_MINUTE;
		String FinalSplitRunner2 = MinLeft1Runner2 + ":" + formatter.format(SecondsLeft1Runner2);

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split2Runner2 = totalSeconds2Runner2 - totalSecondsRunner2;
		int MinLeftRunner2 = (int) Split2Runner2 / SECONDS_PER_MINUTE;
		double SecondsLeftRunner2 = Split2Runner2 % SECONDS_PER_MINUTE;
		String FinalSplit2Runner2 = MinLeftRunner2 + ":" + formatter.format(SecondsLeftRunner2);

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split3Runner2 = totalSeconds3Runner2 - totalSeconds2Runner2;
		int MinLeft2Runner2 = (int) Split3Runner2 / SECONDS_PER_MINUTE;
		double SecondsLeft2Runner2 = Split3Runner2 % SECONDS_PER_MINUTE;
		String FinalSplit3Runner2 = MinLeft2Runner2 + ":" + formatter.format(SecondsLeft2Runner2);

		// Display the information summary of Runner and format into a table
		System.out.println("Runner One Summary");
		System.out.println("__________________");
		System.out.println("Runner:" + name2);
		System.out.printf("%-20s%-10s\n", "Split One", FinalSplitRunner2);
		System.out.printf("%-20s%-10s\n", "Split Two", FinalSplit2Runner2);
		System.out.printf("%-20s%-10s\n", "Split Three", FinalSplit3Runner2);
		System.out.printf("%-20s%-10s\n", "Total", FinishRunner1);

		// place a line to differentiate between the runners
		System.out.println("______________________________________________");

		System.out.print("Please enter your First and Last name: ");
		String name3 = keyboard.nextLine();

		// imputing the mile one time and changing the string into an integer
		// for Runner
		System.out.print(name3 + " Please enter your Mile One Time (mm:ss.sss) ");
		String mileOneRunner3 = keyboard.nextLine();
		int MinRunner3 = Integer.parseInt(mileOneRunner3.substring(0, mileOneRunner3.indexOf(':')));
		int MinInSecRunner3 = MinRunner3 * SECONDS_PER_MINUTE;
		double SecondsRunner3 = Double.parseDouble(mileOneRunner3.substring(mileOneRunner3.indexOf(':') + 1));
		double totalSecondsRunner3 = SecondsRunner3 + MinInSecRunner3;

		// imputing mile two for runner converting string into an integer
		System.out.print(name3 + " Please enter your Mile Two Time: ");
		String mileTwoRunner3 = keyboard.nextLine();
		int Min2Runner3 = Integer.parseInt(mileTwoRunner3.substring(0, mileTwoRunner3.indexOf(':')));
		int Min2InSecRunner3 = Min2Runner3 * SECONDS_PER_MINUTE;
		double Seconds2Runner3 = Double.parseDouble(mileTwoRunner3.substring(mileTwoRunner3.indexOf(':') + 1));
		double totalSeconds2Runner3 = Seconds2Runner3 + Min2InSecRunner3;

		// imputing mile three for runner converting string into an integer
		System.out.print(name3 + " Please enter your completeted time: ");
		String FinishRunner3 = keyboard.nextLine();
		int Min3Runner3 = Integer.parseInt(FinishRunner3.substring(0, FinishRunner3.indexOf(':')));
		int Min3InSecRunner3 = Min3Runner3 * SECONDS_PER_MINUTE;
		double Seconds3Runner3 = Double.parseDouble(FinishRunner3.substring(FinishRunner3.indexOf(':') + 1));
		double totalSeconds3Runner3 = Seconds3Runner3 + Min3InSecRunner3;

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split1Runner3 = totalSecondsRunner3;
		int MinLeft1Runner3 = (int) Split1Runner3 / SECONDS_PER_MINUTE;
		double SecondsLeft1Runner3 = Split1Runner3 % SECONDS_PER_MINUTE;
		String FinalSplitRunner3 = MinLeft1Runner3 + ":" + formatter.format(SecondsLeft1Runner3);

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split2Runner3 = totalSeconds2Runner3 - totalSecondsRunner3;
		int MinLeftRunner3 = (int) Split2Runner3 / SECONDS_PER_MINUTE;
		double SecondsLeftRunner3 = Split2Runner3 % SECONDS_PER_MINUTE;
		String FinalSplit2Runner3 = MinLeftRunner3 + ":" + formatter.format(SecondsLeftRunner3);

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split3Runner3 = totalSeconds3Runner3 - totalSeconds2Runner3;
		int MinLeft2Runner3 = (int) Split3Runner3 / SECONDS_PER_MINUTE;
		double SecondsLeft2Runner3 = Split3Runner3 % SECONDS_PER_MINUTE;
		String FinalSplit3Runner3 = MinLeft2Runner3 + ":" + formatter.format(SecondsLeft2Runner3);

		// Display the information summary of Runner and format into a table
		System.out.println("Runner One Summary");
		System.out.println("__________________");
		System.out.println("Runner:" + name3);
		System.out.printf("%-20s%-10s\n", "Split One", FinalSplitRunner3);
		System.out.printf("%-20s%-10s\n", "Split Two", FinalSplit2Runner3);
		System.out.printf("%-20s%-10s\n", "Split Three", FinalSplit3Runner3);
		System.out.printf("%-20s%-10s\n", "Total", FinishRunner3);

		// place a line to differentiate between the runners
		System.out.println("______________________________________________");

		System.out.print("Please enter your First and Last name");
		String name4 = keyboard.nextLine();

		// imputing the mile one time and changing the string into an integer
		// for Runner
		System.out.print(name4 + " Please enter your Mile One Time (mm:ss.sss) ");
		String mileOneRunner4 = keyboard.nextLine();
		int MinRunner4 = Integer.parseInt(mileOneRunner4.substring(0, mileOneRunner4.indexOf(':')));
		int MinInSecRunner4 = MinRunner4 * SECONDS_PER_MINUTE;
		double SecondsRunner4 = Double.parseDouble(mileOneRunner4.substring(mileOneRunner4.indexOf(':') + 1));
		double totalSecondsRunner4 = SecondsRunner4 + MinInSecRunner4;

		// imputing mile two for runner converting string into an integer
		System.out.print(name4 + " Please enter your Mile Two Time: ");
		String mileTwoRunner4 = keyboard.nextLine();
		int Min2Runner4 = Integer.parseInt(mileTwoRunner4.substring(0, mileTwoRunner4.indexOf(':')));
		int Min2InSecRunner4 = Min2Runner4 * SECONDS_PER_MINUTE;
		double Seconds2Runner4 = Double.parseDouble(mileTwoRunner3.substring(mileTwoRunner3.indexOf(':') + 1));
		double totalSeconds2Runner4 = Seconds2Runner4 + Min2InSecRunner4;

		// imputing mile three for runner converting string into an integer
		System.out.print(name4 + " Please enter your completeted time: ");
		String FinishRunner4 = keyboard.nextLine();
		int Min3Runner4 = Integer.parseInt(FinishRunner4.substring(0, FinishRunner4.indexOf(':')));
		int Min3InSecRunner4 = Min3Runner4 * SECONDS_PER_MINUTE;
		double Seconds3Runner4 = Double.parseDouble(FinishRunner4.substring(FinishRunner4.indexOf(':') + 1));
		double totalSeconds3Runner4 = Seconds3Runner4 + Min3InSecRunner4;

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split1Runner4 = totalSecondsRunner4;
		int MinLeft1Runner4 = (int) Split1Runner4 / SECONDS_PER_MINUTE;
		double SecondsLeft1Runner4 = Split1Runner4 % SECONDS_PER_MINUTE;
		String FinalSplitRunner4 = MinLeft1Runner4 + ":" + formatter.format(SecondsLeft1Runner4);

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split2Runner4 = totalSeconds2Runner4 - totalSecondsRunner4;
		int MinLeftRunner4 = (int) Split2Runner4 / SECONDS_PER_MINUTE;
		double SecondsLeftRunner4 = Split2Runner4 % SECONDS_PER_MINUTE;
		String FinalSplit2Runner4 = MinLeftRunner4 + ":" + formatter.format(SecondsLeftRunner4);

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split3Runner4 = totalSeconds3Runner4 - totalSeconds2Runner4;
		int MinLeft2Runner4 = (int) Split3Runner4 / SECONDS_PER_MINUTE;
		double SecondsLeft2Runner4 = Split3Runner4 % SECONDS_PER_MINUTE;
		String FinalSplit3Runner4 = MinLeft2Runner4 + ":" + formatter.format(SecondsLeft2Runner4);

		// Display the information summary of Runner and format into a table
		System.out.println("Runner One Summary");
		System.out.println("__________________");
		System.out.println("Runner:" + name4);
		System.out.printf("%-20s%-10s\n", "Split One", FinalSplitRunner4);
		System.out.printf("%-20s%-10s\n", "Split Two", FinalSplit2Runner4);
		System.out.printf("%-20s%-10s\n", "Split Three", FinalSplit3Runner4);
		System.out.printf("%-20s%-10s\n", "Total", FinishRunner4);

		// place a line to differentiate between the runners
		System.out.println("______________________________________________");

		System.out.print("Please enter your First and Last name: ");
		String name5 = keyboard.nextLine();

		// imputing the mile one time and changing the string into an integer
		// for Runner
		System.out.print(name5 + " Please enter your Mile One Time (mm:ss.sss) ");
		String mileOneRunner5 = keyboard.nextLine();
		int MinRunner5 = Integer.parseInt(mileOneRunner5.substring(0, mileOneRunner5.indexOf(':')));
		int MinInSecRunner5 = MinRunner5 * SECONDS_PER_MINUTE;
		double SecondsRunner5 = Double.parseDouble(mileOneRunner5.substring(mileOneRunner5.indexOf(':') + 1));
		double totalSecondsRunner5 = SecondsRunner5 + MinInSecRunner5;

		// imputing mile two for runner converting string into an integer
		System.out.print(name5 + " Please enter your Mile Two Time: ");
		String mileTwoRunner5 = keyboard.nextLine();
		int Min2Runner5 = Integer.parseInt(mileTwoRunner5.substring(0, mileTwoRunner5.indexOf(':')));
		int Min2InSecRunner5 = Min2Runner5 * SECONDS_PER_MINUTE;
		double Seconds2Runner5 = Double.parseDouble(mileTwoRunner5.substring(mileTwoRunner5.indexOf(':') + 1));
		double totalSeconds2Runner5 = Seconds2Runner5 + Min2InSecRunner5;

		// imputing mile three for runner converting string into an integer
		System.out.print(name5 + " Please enter your completeted time: ");
		String FinishRunner5 = keyboard.nextLine();
		int Min3Runner5 = Integer.parseInt(FinishRunner5.substring(0, FinishRunner5.indexOf(':')));
		int Min3InSecRunner5 = Min3Runner5 * SECONDS_PER_MINUTE;
		double Seconds3Runner5 = Double.parseDouble(FinishRunner5.substring(FinishRunner5.indexOf(':') + 1));
		double totalSeconds3Runner5 = Seconds3Runner4 + Min3InSecRunner5;

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split1Runner5 = totalSecondsRunner5;
		int MinLeft1Runner5 = (int) Split1Runner5 / SECONDS_PER_MINUTE;
		double SecondsLeft1Runner5 = Split1Runner5 % SECONDS_PER_MINUTE;
		String FinalSplitRunner5 = MinLeft1Runner5 + ":" + formatter.format(SecondsLeft1Runner5);

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split2Runner5 = totalSeconds2Runner5 - totalSecondsRunner5;
		int MinLeftRunner5 = (int) Split2Runner5 / SECONDS_PER_MINUTE;
		double SecondsLeftRunner5 = Split2Runner5 % SECONDS_PER_MINUTE;
		String FinalSplit2Runner5 = MinLeftRunner5 + ":" + formatter.format(SecondsLeftRunner5);

		// calculating the Split time by subtracting the integers then convert
		// back into string
		// Format the Final Split time so only to two decimal places
		double Split3Runner5 = totalSeconds3Runner5 - totalSeconds2Runner5;
		int MinLeft2Runner5 = (int) Split3Runner5 / SECONDS_PER_MINUTE;
		double SecondsLeft2Runner5 = Split3Runner5 % SECONDS_PER_MINUTE;
		String FinalSplit3Runner5 = MinLeft2Runner5 + ":" + formatter.format(SecondsLeft2Runner5);

		// Display the information summary of Runner and format into a table 
		System.out.println("Runner One Summary");
		System.out.println("__________________");
		System.out.println("Runner:" + name5);
		System.out.printf("%-20s%-10s\n", "Split One", FinalSplitRunner5);
		System.out.printf("%-20s%-10s\n", "Split Two", FinalSplit2Runner5);
		System.out.printf("%-20s%-10s\n", "Split Three", FinalSplit3Runner5);
		System.out.printf("%-20s%-10s\n", "Total", FinishRunner5);

		// place a line to differentiate between the previous information to the
		// summary chart
		System.out.println("_________________________________________________________________________________");

		// Create a summary Chart of all the runners information
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Name", "Split One", "Split Two", "Split Three", "Split Final");
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", name, FinalSplitRunner1, FinalSplit2Runner1, FinalSplit3Runner1, FinishRunner1);
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", name2, FinalSplitRunner2, FinalSplit2Runner2, FinalSplit3Runner2, FinishRunner2);
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", name3, FinalSplitRunner3, FinalSplit2Runner3, FinalSplit3Runner3, FinishRunner3);
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", name4, FinalSplitRunner4, FinalSplit2Runner4, FinalSplit3Runner4, FinishRunner4);
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", name5, FinalSplitRunner5, FinalSplit2Runner5, FinalSplit3Runner5, FinishRunner5);
		
		keyboard.close();
	}
}