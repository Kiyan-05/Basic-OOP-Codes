import java.util.*;

class Bank
{

	public static void main(String[] args)
	{
		Accounts acc1 = new Accounts("Josh", "0001", "Savings Account", 15000.00);
		Accounts acc2 = new Accounts("John", "0002", "Salary Account", 25000.00);
		Accounts acc3 = new Accounts("Nova", "0003", "Savings Account", 5000.00);
		Accounts acc4 = new Accounts("Felix", "0004", "Salary Account", 50000.00);
		Accounts acc5 = new Accounts("Mona", "0005", "Current Account", 500.00);
		
		BankAccountManagement manage = new BankAccountManagement();
		manage.addAccount(acc1);
		manage.addAccount(acc2);
		manage.addAccount(acc3);
		manage.addAccount(acc4);
		manage.addAccount(acc5);
		System.out.println("Default values: ");
		manage.printAccounts();

		manage.deposit(acc1,500.00);
		manage.withdraw(acc2,5000.00);
		System.out.println("\nUpdated data: ");
		manage.printAccounts();

		System.out.println("\n" + acc5.accountName + " your current balance is: " + manage.checkBalance(acc5));

		Scanner verify = new Scanner(System.in);
		String v = "";
		System.out.println("\nAre you sure to delete this account" + " Name: "+acc3.accountName + " No. " + acc3.accountNumber + " permanently? (YES/NO)");
		v = verify.next();
			if(v.equals("YES"))
			{
				System.out.println(v);
				manage.removeAccount(acc3);
			}

		System.out.println("\nUpdated data: ");
		manage.printAccounts();
		
	}
}