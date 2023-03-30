public class TestQuiz
{
	public static void main(String[] args) 
	{
		Quiz q = new Quiz(new char[]{'a','a','d','c'});
		q.setOwner("Juan");
		q.setAnswer('a',1);
		q.setAnswer('d',3);
		q.setAnswer('d',2);
		q.setAnswer('b',4);
		q.setOwner("Pedro");

		char[] x = q.getAnswers();
		for(char c : x)
			System.out.print(c + " ");
		System.out.println();
		q.checkQuiz();
		System.out.println(q.getOwner()+" Score: "+q.getScore());	
	}
}