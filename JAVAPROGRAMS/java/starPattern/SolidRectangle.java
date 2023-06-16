package starPattern;

import java.util.Scanner;

public class SolidRectangle {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);

		System.out.println("enter the lenght of rectangle");

		int length = var.nextInt();
		System.out.println("enter the breath of rectangle");
		int breath = var.nextInt();
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= breath; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		var.close();

	}
}
