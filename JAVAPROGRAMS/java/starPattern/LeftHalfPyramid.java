package starPattern;

import java.util.Scanner;

public class LeftHalfPyramid {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter height of pyramid");
		int height = sc.nextInt();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();

	}
}