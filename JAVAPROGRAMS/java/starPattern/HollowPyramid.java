package starPattern;
import java.util.*;
public class HollowPyramid {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hieght of pyramid");
		int height=sc.nextInt();
		
		for(int i=1;i<=height;i++)
		{
			int space=height-i;
			for(int s=1;s<=space;s++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||(i==height&&j%2==1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			int t=i+1;
			for(int k=2;k<t;k++)
			{
				if((i==height&&k%2==height%2)||k==i)
					System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			 System.out.println();
		}
		sc.close();
		
	

	}

}
