package numberPattern;
import java.util.*;
public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the row number");
		int row=sc.nextInt();
		int c=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
			c++;
			}
			System.out.println();
		}
		sc.close();

	}

}
