public class Quiz
{
	private boolean isAnswerable;
	private int[] answers;
	private int score;
	public List<Question> questions;
	public Student owner;

	public Quiz(Student o)
	{
		this.owner = o;
		this.isAnswerable = false;
		for(int i=0; i<this.answers.length; i++)
			this.answers = 0;
		this.score = 0;
		this.questions = new ArrayList<Question>();
	}

	public Student getOwner()
	{

	}

	public void setAnswerable(boolean isAnswerable)
	{

	}

	public void addQuestion(String question_text, String[] choices, int correctAnswer)
	{

	}

	public int setAnswer(int question_no, int answer)
	{

	}

	private void computeScore()
	{

	}

	public int getScore()
	{

	}

	public int getNoOfItems()
	{

	}
}