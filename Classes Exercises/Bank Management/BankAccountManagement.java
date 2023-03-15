import java.util.*;

class BankAccountManagement
{
	
	public ArrayList<Accounts> account;

	public BankAccountManagement()
	{
		this.account = new ArrayList<Accounts>();
	}

	public double deposit(Accounts acc, double amount)
	{
		return acc.accountBalance += amount;
	}

	public double withdraw(Accounts acc, double amount)
	{
		return (acc.accountBalance >= amount)? acc.accountBalance -= amount : 0;
	}

	public double checkBalance(Accounts acc)
	{
		return acc.getAccountBalance();
	}

	public void addAccount(Accounts acc)
	{
		this.account.add(acc);
	}

	public void removeAccount(Accounts acc)
	{
		this.account.remove(acc);
	}

	public void printAccounts()
	{
		System.out.println(this.account);
	}

}