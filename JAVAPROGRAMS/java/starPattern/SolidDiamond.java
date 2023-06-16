package starPattern;
import java.util.*;
public class SolidDiamond {

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
				if(i%2==1&&j%2==1)
					System.out.print("* ");
				else if(i%2==0&&j%2==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			int t=i+1;
			for(int k=2;k<t;k++)
			{
				if(i%2==0&&k%2==0)
					System.out.print("* ");
				else if(i%2==1&&k%2==1)
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
				 if(i%2==0&&j%2==1)
					 System.out.print("* ");
				 else if(i%2==1&&j%2==1)
					 System.out.print("* ");
				 else 
					 System.out.print("  ");
			 }
			 
			 for(int k=1;k<=i-1;k++)
			 {
				 if(i%2==0&&k%2==1)
					 System.out.print("* ");
				 else if(i%2==1&&k%2==0)
					 System.out.print("* ");
				 else 
					 System.out.print("  ");
			 }
			 
			 System.out.println();

}
		sc.close();
}
}