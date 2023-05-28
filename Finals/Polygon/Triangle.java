import java.util.*;
import java.lang.Math.*;

public class Triangle extends Polygon
{
	
	private TriangleType type;

	public Triangle()
	{
		super();
		ArrayList<Point> vertices = super.getVertices();
		
		int ctr = 0;
		for(int i=0; i<vertices.size(); i++)
		{
			for(int j=i+1; j<vertices.size(); j++)
			{
				if(vertices.get(i).equals(vertices.get(j)))
					ctr++;
			}
		}
		if(ctr==3)
			this.type = TriangleType.Equilateral;
		else if(ctr<3 && ctr>0)
			this.type = TriangleType.Isosceles;
		else if(ctr==0)
			this.type = TriangleType.Scalene;
	}

	public Triangle(Point p1, Point p2, Point p3)
	{
		super(p1,p2,p3);

		ArrayList<Point> vertices = super.getVertices();
		int ctr = 0;
		for(int i=0; i<vertices.size(); i++)
		{
			for(int j=i+1; j<vertices.size(); j++)
			{
				if(vertices.get(i).equals(vertices.get(j)))
					ctr++;
			}
		}
		if(ctr==3)
			this.type = TriangleType.Equilateral;
		else if(ctr<3 && ctr>0)
			this.type = TriangleType.Isosceles;
		else if(ctr==0)
			this.type = TriangleType.Scalene;
	}

	public TriangleType getType()
	{
		return this.type;
	}

	@Override
	public void addVertex(Point vertex)
	{
		System.out.println("You cannot add another point in a triangle.");
	}

	@Override
	public boolean removeVertex(Point vertex)
	{
		System.out.println("You cannot remove another point in a triangle.");
		return false;
	}
}
