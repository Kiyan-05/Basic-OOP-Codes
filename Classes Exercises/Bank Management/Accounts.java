import java.util.*;

class Accounts
{
	public String accountName;
	public String accountNumber;
	public String accountType;
	public double accountBalance;

	public Accounts()
	{
		this.accountName = null;
		this.accountNumber = null;
		this.accountType = null;
		this.accountBalance = 0.0;
	}

	public Accounts(String name, String acc_number, String type, double bal)
	{
		this.accountName = name;
		this.accountNumber = acc_number;
		this.accountType = type;
		this.accountBalance = bal;
	}

	public double getAccountBalance(){return this.accountBalance;}

	@Override
	public String toString()
	{
		return ("\nAccount Name: " + this.accountName + "\nBalance: " + this.accountBalance + "\n------------------");
	}

}