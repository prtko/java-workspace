package demo;
class calc
{
	public int add(int...n)
	{
		int sum=0;
		for(int i:n)
			sum=sum+i;
		return sum;
		
	}
}

public class VarargsDemo 
{

	public static void main(String[] args) 
	{
		calc obj=new calc();
		System.out.println(obj.add(5,5,6,8,7,25,565,3,7,89,2));
	}

}
