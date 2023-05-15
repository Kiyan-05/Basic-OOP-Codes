import java.util.*;
import java.lang.Math.*;

public class Line
{
	public Point p1;
	public Point p2;

	public Line(Point p1, Point p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getMidpoint()
	{
		int pt1 = ((p1.getX()+p2.getX())/2);
		int pt2 = ((p1.getY()+p2.getY())/2);
		Point mid = new Point(pt1,pt2);
		return mid;
	}

	public double computeLength()
	{
		double x2 = (p2.getX()-p1.getX())*(p2.getX()-p1.getX());
		double y2 = (p2.getY()-p1.getY())*(p2.getY()-p1.getY());
		return Math.sqrt(x2+y2);
	}

	public double computeSlope()
	{
		double y = (p2.getY()-p1.getY());
		double x = (p2.getX()-p1.getX());
		if(x==0)
		{
			return 8.0;
		}
		return ((y)/(x));
	}
}