import java.util.*;

public class Quiz
{
	private String owner;
	private char[] answers;
	private char[] correct_answers;
	private int score;

	public Quiz(char[] correct_answers)
	{
		this.owner = " ";
		this.answers = new char[correct_answers.length];
		for(int i=0; i<this.answers.length; i++)
			this.answers[i] = ' ';
		this.correct_answers = Arrays.copyOfRange(correct_answers,0,correct_answers.length);
		this.score = 0;
	}

	public String getOwner()
	{
		return this.owner;
	}

	public boolean setOwner(String o)
	{
		boolean flag = true;
		for(int i=0; i<this.answers.length; i++)
		{
			if(this.answers[i] != ' ')
			{
				flag = false;
				break;
			}
		}
		if(flag)
			this.owner = o;
		return flag;	
	}

	public char[] getAnswers()
	{
		char[] copy = new char[this.answers.length];
		return Arrays.copyOfRange(this.answers,0,this.answers.length);
	}

	public boolean setAnswer(char answer, int questionNumber)
	{
		/*ArrayList<Character> options = new ArrayList<Character>();
		for(int i=0; i < 4; i++)
			options.add((char)('a'+i));*/
		if((answer < 'a' || answer > 'd') || (questionNumber < 1 || questionNumber > this.answers.length))
			return false;
		this.answers[questionNumber-1] = answer;
		return true;
	}

	public int getScore()
	{
		return this.score;
	}

	public void checkQuiz()
	{
		this.score = 0;
		for(int i=0; i<this.correct_answers.length; i++)
			if(this.answers[i] == this.correct_answers[i])
				this.score++;
	}
}