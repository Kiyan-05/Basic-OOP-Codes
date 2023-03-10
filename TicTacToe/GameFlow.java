import java.util.*;

class GameFlow
{
	public Matrix mtx;
	public Player p;
	public int rounds;

	public GameFlow(int r)
	{
		this.rounds = r;
	}

	public void gameRounds(Matrix mtx, Player player)
	{
		if(this.rounds >= 1)
		{
			gameFlow(mtx,player);
			gameWin(mtx,player);
			this.rounds -= 1;
		}
	}

	public void gameFlow(Matrix mtx, Player player)
	{
		Scanner move = new Scanner(System.in);

		System.out.println("\n" + player.name + ", your turn.");
		System.out.print("Choose a pattern in the board: ");
		player.chosenMove = move.next();
		if(mtx.isPicked(player))
		{
			System.out.println("\nError: Invalid position. Please choose a position not marked an 'X' or 'O'.\n");
			mtx.printMatrix();
			this.rounds++;
		}else{	
			mtx.addMove(player);
			System.out.println();
			mtx.printMatrix();
		}
	}

	public static void gameWin(Matrix mtx, Player p)
	{
		if(mtx.isWin(p) == true)
		{
			System.out.println("\n" + p.name + " wins!");
			System.exit(0);
		}
	}

}