package overload;

class demo
{
	int x;
	public demo (int i)
	{
		x=i;
	}
	public demo()
	{
		x=10;
	}
	public void display()
	{
		System.out.println("value of x:"+x);
	}
}

public class constructoroverload
{
	public static void main(String[] args) 
	{
		demo d1=new demo();
		d1.display();
		demo d2=new demo(200);
		d2.display();
		d2.x=300;
		d2.display();
	}

}
