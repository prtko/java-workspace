package starPattern;
import java.util.*;
public class SolidPyramid {

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
				if(j%2==1)
					System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			int t=i+1;
			for(int k=2;k<t;k++)
			{
				if(i%2==k%2)
					System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			 System.out.println();
		}
		sc.close();
		

	}

}
