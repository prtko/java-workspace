package starPattern;
import java.util.*;
public class LeftArrow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height of arrow");
		int height=sc.nextInt();
		
		for(int i=1;i<height;i++)
		{
			int space=height-i;
			for(int s=1;s<=space;s++)
			System.out.print("  ");
			System.out.println("* ");
			
		}
		for(int j=1;j<=height*2;j++)
			System.out.print("* ");
		System.out.println();
		
		for(int i=1;i<height;i++)
		{
			int space=i;
			for(int s=1;s<=space;s++)
				System.out.print("  ");
			System.out.println("* ");
			
		}
		
		
sc.close();
	}

}
