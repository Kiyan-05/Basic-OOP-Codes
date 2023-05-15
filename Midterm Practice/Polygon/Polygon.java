import java.util.*;
import java.lang.Math.*;

public class Polygon
{
	private List<Point> vertices;

	public Polygon()
	{
		this.vertices = new ArrayList<Point>();
		this.vertices.add(new Point(0,0));
		this.vertices.add(new Point(0,1));
		this.vertices.add(new Point (1,0));
	}

	public Polygon(Point p1, Point p2, Point p3)
	{
		this.vertices = new ArrayList<Point>();
		this.vertices.add(p1);
		this.vertices.add(p2);
		this.vertices.add(p3);
	}

	public double computePerimeter()
	{
		double perimeter=0;
		int lastIndex = this.vertices.size()-1;
		for(int i=0; i<lastIndex; i++)
		{
			Line length = new Line(this.vertices.get(i),this.vertices.get(i+1));
			double var1 = length.computeLength();
			perimeter += var1;
		}
		Line last = new Line(this.vertices.get(0),this.vertices.get(lastIndex));
		double var2 = last.computeLength();
		perimeter += var2;
		return perimeter;
	}

	public double computeArea()
	{
		int n = vertices.size();
		Point p0 = vertices.get(0);
		Point pn_1 = vertices.get(n-1);
		int xLast = vertices.size()-1;
		double area=0;

		for(int k=0; k<=n-2; k++)
		{
			area += (vertices.get(k).getX()*vertices.get(k+1).getY()) - (vertices.get(k+1).getX()*vertices.get(k).getY());
		}
		area += (pn_1.getX()*p0.getY())-(p0.getX()*pn_1.getY());
		return Math.abs(area/2);
	}

	public void addVertex(Point vertex)
	{
		this.vertices.add(vertex);
	}

	public boolean removeVertex(Point vertex)
	{
		for(int i=0; i<this.vertices.size(); i++)
		{
			int ptX = vertices.get(i).getX();
			int ptY = vertices.get(i).getY();
			if(vertex.getX()==ptX && vertex.getY()==ptY)
			{
				this.vertices.remove(i);
				return true;
			}
		}
		return false;
	}

	public int getNumberOfSides()
	{
		return this.vertices.size();
	}

	public ArrayList<Point> getVertices()
	{
		return this.vertices;
	}
}