import java.util.*;

class Player
{
	public String name;
	public String moveValue;
	public String chosenMove;

	public Player(String n, String moveValue)
	{
		this.name = n;
		this.moveValue = moveValue;
	}

	public String getName(){return this.name;}
	public void setName(String name){this.name = name;}

	public String getMoveValue(){return this.moveValue;}
	public void setMoveValue(String move){this.moveValue = moveValue;}

}