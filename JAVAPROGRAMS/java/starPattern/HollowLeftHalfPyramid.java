package starPattern;

import java.util.*;

public class HollowLeftHalfPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the height of pyramid");
		int height = sc.nextInt();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || i == j || i == height)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();

	}

}
