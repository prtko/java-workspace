package array;
import java.util.*;
public class SpiralForm 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int len=sc.nextInt();
		int breath=sc.nextInt();
		int array[][]= new int[len][breath];
		System.out.println("enter array elements");
		
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<breath;j++)
				array[i][j]=sc.nextInt();
		}
		
		System.out.println("the matrix is");

		for(int i=0;i<len;i++)
		{
			for(int j=0;j<breath;j++)
				System.out.print(array[i][j]+"  ");
					
			System.out.println();
		
	    }
		System.out.println("the spiral form is");
		
		int  l=len;
		int b=breath;
		int m=0;int n=0;
		
		while(m<l&&n<b)
		{
			for(int i=n;i<b;i++)
				System.out.print(array[m][i]+" ");
			m++;
			
			for(int j=m;j<b;j++)
				System.out.print(array[b][j]+" ");
			b--;
			
			if(m<b)
			{
				for(int i=b-1;i>0;i--)
					System.out.print(array[n][i]+" ");
				n++;
				
				for(int j=b-1;j>0;j++)
				System.out.print(array[b][j]+" ");
				b--;
			}
			
		}
		

    }
}

