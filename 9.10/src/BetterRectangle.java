import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
	public BetterRectangle(int h, int w, int x, int y)
	{
		setSize(w, h);
		setLocation(x, y);
	}
	
	public int getPerimeter()
	{
		return (2*super.height) + (2*super.width);
	}
	
	public int getArea()
	{
		return super.height*super.width;
	}
}
