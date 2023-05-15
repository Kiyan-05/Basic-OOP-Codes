public class EncapsulatedTermDay
{
	private int day;
	private int week;

	public int getDay()
	{
		return this.day;
	}

	public int getWeek()
	{
		return this.week;
	}

	public void setDay(int day)
	{
		if(day>=0 && day<=6)
			this.day = day;
		this.day = 0;
	}

	public void setWeek(int week)
	{
		if(week>=0 && week<=17)
			this.week = week;
		this.day = 0;
	}
}