package methodoverloading;

public class demo
{
	
	public int add (int a,int b)
	{
		return a+b;
	}
	
	public int add (int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args) 
	{
		int a =10;
		int b =20;
		int c =30;
		
		demo d = new demo();
		System.out.println(d.add(a,b));
		System.out.println(d.add(a,b,c));

	}

}
