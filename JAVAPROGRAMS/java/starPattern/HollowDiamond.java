package starPattern;
import java.util.*;
public class HollowDiamond {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the base of diamond");
		int base=sc.nextInt();
		
		for(int i=1;i<=base;i++)
		{
			int space=base-i;
			for(int s=1;s<=space;s++)
			{
				System.out.print("  ");
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
			 System.out.println();
		}
		
		 for(int i=base-1;i>=1;i--)
		 {
			 int space=base-i;
			 for(int s=1;s<=space;s++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 if(j==1||(i==base&&j%2==1))
					 System.out.print("* ");
				
				 else 
					 System.out.print("  ");
			 }
			 
			 for(int k=1;k<=i-1;k++)
			 {
				 if((i==base&&k%2!=base%2)||k==i-1)
					 System.out.print("* ");
				
				 else 
					 System.out.print("  ");
			 }
			 
			 System.out.println();
		 }
		 
		 sc.close();
	}

}
