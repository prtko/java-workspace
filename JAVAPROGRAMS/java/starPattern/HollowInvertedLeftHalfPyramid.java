package starPattern;

import java.util.*;

public class HollowInvertedLeftHalfPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the height of pyramid");
		int height = sc.nextInt();

		for (int i = height; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i == height || j == 1 || i == j)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}
		sc.close();

	}

}
