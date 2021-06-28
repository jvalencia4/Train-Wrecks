package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection = 0;
		while (menuSelection != 4) {
			//System.out.println("Please select type the number you want to select");
			// 1. Cups to Teaspoons
			System.out.println("1.Cups to Teaspoons");
			// 2. Miles to Kilometers
			System.out.println("2.Miles to Kilometers");
			// 3. US Gallons to Imperial Gallons
			System.out.println("3.US Gallons to Imperial Gallons");
			// 4. Quit
			System.out.println("4.Quit");

			Scanner myScanner = new Scanner(System.in);
			System.out.println("Please select a number");
			int numberChoosen = myScanner.nextInt();
			//myScanner.close();
			switch (numberChoosen) {
			case 1:
				Scanner cups2Teaspoons = new Scanner(System.in);
				System.out.println("How many cups?");
				int cups = cups2Teaspoons.nextInt();
				int conv1 = cups * 48;
				System.out.println(cups + " cups are " + conv1 + " teaspoons.");
				//cups2Teaspoons.close();
				break;
			case 2:
				Scanner miles2Kilometers = new Scanner(System.in);
				System.out.println("How many miles?");
				double miles = miles2Kilometers.nextDouble();
				double conv2 = miles * 48.28032;
				System.out.println(miles + " miles are " + conv2 + " kilometers.");
				//miles2Kilometers.close();
				break;
			case 3:
				Scanner gallons2ImperialGallon = new Scanner(System.in);
				System.out.println("How many US Gallons?");
				double USgallon = gallons2ImperialGallon.nextDouble();
				double conv3 = USgallon * 0.83267;
				System.out.println(USgallon + " US gallons are " + conv3 + " imperial gallons.");
				//gallons2ImperialGallon.close();
				break;
			case 4:
				System.exit(4);
			default:
				System.out.println(" OOPS !!This isn't a conversion I know");
			}

		}

	}
}
