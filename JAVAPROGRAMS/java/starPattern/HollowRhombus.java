package starPattern;
import java.util.*;
public class HollowRhombus {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side of rhombus");
		int side=sc.nextInt();
		
		for(int i=1;i<=side;i++) 
		{
			int space=side-i;
			for(int s=1;s<=space;s++)
			{
				System.out.print("  ");
				
			}
			
			for(int j=1;j<=side;j++)
			{
				if(i==1||j==1||i==side||j==side)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println();
		
		}
		
		sc.close();


	}

}
