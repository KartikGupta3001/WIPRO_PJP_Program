class Shape
{
	void draw()
	{
		System.out.println("Drawing Shape");
	}
	void erase()
	{
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	@Override
	void erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	@Override
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Square");
	}
	@Override
	void erase()
	{
		System.out.println("Erasing Square");
	}
}
public class OP2
{
	public static void main(String args[])
	{
		Shape c = new Circle();
		Shape t= new Triangle();
		Shape s = new Square();
		
		System.out.println("Circle : ");
		c.draw();
		c.erase();
		System.out.println("Triangle : ");
		t.draw();
		t.erase();
		System.out.println("Square : ");
		s.draw();
		s.erase();
	}
}