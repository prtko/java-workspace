package starPattern;
import java.util.*;
public class HollowDiamondInRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height ");
		int height=sc.nextInt();
		
		for(int i=1;i<=height;i++)
		{
			int space=height-i;
			for(int s=1;s<=space;s++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			int t=i+1;
			for(int k=2;k<t;k++)
			{
				if(k==i)
					System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			for(int l=1;l<=height-i;l++)
			{
				System.out.print("* ");
			}
			
			 System.out.println();
		}
		
		 for(int i=height-1;i>=1;i--)
		 {
			 int space=height-i;
			 for(int s=1;s<=space;s++)
			 {
				 System.out.print("* ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 if(j==1||(i==height&&j%2==1))
					 System.out.print("* ");
				
				 else 
					 System.out.print("  ");
			 }
			 
			 for(int k=1;k<=i-1;k++)
			 {
				 if((i==height&&k%2!=height%2)||k==i-1)
					 System.out.print("* ");
				
				 else 
					 System.out.print("  ");
			 }
			 
			 for(int l=1;l<=height-i;l++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 
		
sc.close();		
	}
}
