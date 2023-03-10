import java.util.*;

class PrimeNumber
{
	public static void main(String[] args)
	{
		int ctr = 0;
		for(int i=1; i<100; i++)
		{
			if(isPrime(i))
			{
				if(ctr%5==0 && ctr!=0)
					System.out.println();
				System.out.print(i + "\t");
				ctr++;
			}
		}
	}

	public static boolean isPrime(int num)
	{
		if(num == 1)
			return	 false;
		if(num == 2)
			return	true;

		for(int i=2; i<num; i++)
			if(num%i== 0)
				return false;
		return true;
	}
}