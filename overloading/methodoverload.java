package overload;

class sum{
	public void add(int a,int b)
	{
		System.out.println("add method with 2 variables");
		int res=a+b;
		System.out.println("result of addition:"+res);
		
	}
	public void add(int a,int b,int c)
	{
		System.out.println("add method with 3 variables");
		int res=a+b+c;
		System.out.println("result of addition:"+res);
		
	}
	public void add(int a,double b)
	{
		System.out.println("add method with 2 different variables");
		double res=a+b;
		System.out.println("result of addition:"+res);
		
	}
}

public class methodoverload {
 
	{
		sum s=new sum();
		s.add(10, 20);
		s.add(10, 20,30);
		s.add(10, 20.5);
		

	}

}
