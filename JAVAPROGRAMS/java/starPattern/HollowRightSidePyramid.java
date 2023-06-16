package starPattern;
import java.util.*;
public class HollowRightSidePyramid {

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
       		  if(i==j||j==1)
       		  System.out.print("* ");
       		  else
       			  System.out.print("  ");
       		  
       	  }
       	  System.out.println();
         }
	
		 for(int i=height-1;i>=1;i--)
		 {    int space=height-i;
			 for(int s=1;s<=space;s++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 if(j==1||i==j)
				 System.out.print("* ");
				 else
					 System.out.print("  ");
			 }
	
			 System.out.println();
		 }
         sc.close();

	}

}
