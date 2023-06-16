package numberPattern;
import java.util.*;
public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PascalTriangle obj=new PascalTriangle();
		System.out.println("enter the height of triangle");
		
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
					System.out.print(obj.combi(i-1,j-1));
				
				else
					System.out.print("  ");
			}
			int t=i+1;
			for(int k=2;k<t;k++)
			{
				if(i%2==k%2)
					System.out.print(obj.combi(i-1,k-2));
				
				else
					System.out.print("  ");
			}
			 System.out.println();
		}
		sc.close();
		

	}
	public int combi(int a,int b)
	{
		int c=1;
		if(a==0||b==0)
			return 1;
		else
			c= fact(a)/(fact(b)*fact(a-b));
		return c;
	}
	public int fact(int n)
	{   int f=1;
		for(int i=1;i<=n;i++)
			 f=f*i;
		return f;
	}

}
