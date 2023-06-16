package starPattern;

import java.util.*;

public class HollowButterfly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of butterfly");

		int size = sc.nextInt();

		for (int i = 1; i <= size; i++) {
			int space = size - i;
			for (int j = 1; j <= i; j++) {
				if (j == 1 || i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for (int s = 1; s <= space; s++) {
				System.out.print("  ");
			}
			for (int m = 1; m <= size - 1 - i; m++) {
				System.out.print("  ");
			}
			for (int n = 1; n <= i; n++) {

				if (i == size) {
					if (n == size - 1)
						System.out.print("* ");
					else
						System.out.print("  ");
				} else {
					if (n == 1 || i == n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();

		}

		int space = 1;
		for (int i = size - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for (int s = 1; s <= space; s++)
				System.out.print("  ");
			for (int k = 1; k <= i; k++) {
				if (i == k || k == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			space += 2;
			System.out.println();

		}
		sc.close();

	}

}
