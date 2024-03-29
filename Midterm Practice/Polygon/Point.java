import java.lang.Math.*;

public class Point
{
	private int x;
	private int y;

	public Point()
	{
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX()
	{
		return this.x;
	}

	public int getY(){return this.y;}

	public void setX(int x){this.x = x;}

	public void setY(int y){this.y = y;}

	public double computeDistanceFromOrigin()
	{
		double res = 0.0;
		res = Math.sqrt((x*x)+(y*y));
		return res; 
	}
}