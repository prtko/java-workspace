package starPattern;
import java.util.*;
public class HollowInvertedRightHalfPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height of pyramid");
		int height=sc.nextInt();
		
		for(int i=height;i>=1;i--)
		{
			int space=height-i;
			for(int s=1;s<=space;s++)
			{
				System.out.print("  ");
				
			}
			for(int j=1;j<=i;j++)
			{
				if(i==height||j==i||j==1)
				System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
			
		}
		
		sc.close();
	

	}

}
