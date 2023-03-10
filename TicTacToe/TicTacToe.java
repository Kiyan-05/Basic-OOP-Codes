import java.util.*;

class TicTacToe
{
	
	public static void main(String[] args)
	{
		GameFlow game = new GameFlow(9);
		Matrix mtx = new Matrix();
		System.out.println("This is a tic-tac-toe game. This game requires two players.");
		System.out.println("Player 1 will be marked by 'X' and Player 2 will be marked 'O'.");
		System.out.println("Whosoever first creates 3-X line or 3-O line wins." + "\n"); 
		mtx.printMatrix();

		Player player1 = new Player("Player 1","X");
		Player player2 = new Player("Player 2","O");
		
		int counter = 0;
		while(game.rounds != 0)
		{
			if(game.rounds%2 != 0)
			{
				game.gameRounds(mtx,player1);
			}
			else
			{
				game.gameRounds(mtx,player2);
			}
			counter++;
		}
		if(counter >= 9)
		{
			System.out.println("\nThe Game was a Draw!");
		}
	}

}