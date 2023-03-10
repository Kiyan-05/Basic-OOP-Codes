import java.util.*;

class Matrix
{
	public String[][] numbers;

	public Matrix()
	{
		this.numbers = new String[3][3];
		String[][] num = {
			{"1","2","3"},
			{"4","5","6"},
			{"7","8","9"}
		};
		this.numbers = num;
	}

	public void printMatrix()
	{
		for(String[] i : this.numbers)
		{
			for(String e : i)
				System.out.print(e + " ");
			System.out.println();
		}
	}

	public boolean isPicked(Player player)
	{
		boolean pick = true;
		for(String[] i : this.numbers)
		{
			for(String e : i)
				if(player.chosenMove.equals(e))
					pick = false;
		}
		return pick;
	}
	
	public void addMove(Player player)
	{
		for(int i=0; i<this.numbers.length; i++)
		{
			for(int j=0; j<this.numbers[i].length; j++)
				if(player.chosenMove.equals(this.numbers[i][j]))
					this.numbers[i][j] = player.moveValue;
		}
	}

	public boolean isWin(Player p)
	{
		boolean h = true, v = true, d1=true, d2=true;

		for(int i=0; i < this.numbers.length; i++)
		{
			h = (this.numbers[i][0] == p.moveValue);
			v = (this.numbers[0][i] == p.moveValue);
			d1 &= (this.numbers[i][i] == p.moveValue);
			d2 &= (this.numbers[2-i][i] == p.moveValue);
			for(int j=1; (h || v) && j < this.numbers[i].length; j++)
			{
				h &= (this.numbers[i][j] == p.moveValue);
				v &= (this.numbers[j][i] == p.moveValue);
			}
			if(h || v)
				return true;
		}
		return (h || v || d1 || d2)? true : false;
	}

}