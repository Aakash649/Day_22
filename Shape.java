abstract class circle
{
abstract void area(int r);
}

class Area extends circle
{
	double val;
	final double pi=3.14;
	void area(int r)
	{
		val=r*r*pi;
	System.out.println("Area: "+val);
	}
	
}
class Shape 
{
public static void main(String[] args)
	{
		circle a = new Area();
		a.area(4);
	}
}
