package starPattern;
import java.util.*;
public class RightArrow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height of arrow");
		int height=sc.nextInt();
		
		for(int i=1;i<height;i++)
		{
			int space=height+i-1;
					for(int s=1;s<=space;s++)
					{
						System.out.print("  ");
					}
					System.out.print("* ");
					System.out.println();
							
		}
		for(int j=1;j<=2*height;j++)
		System.out.print("* ");
		System.out.println();
		
		for(int i=1;i<height;i++)
		{   
			int space=height*2-i-1;
			for(int s=1;s<=space;s++)
				System.out.print("  ");
			System.out.print("* ");
			System.out.println();
		}
		sc.close();
	}

}
