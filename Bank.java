class Account
{
	private String cname;
	private int accno;
	private double balance;
	/*
	 trans[][0]= date
	  trans[][1]= transaction [Deposit/withdraw]
	  trans[][2]= amount
	 */
	private String trans[][]=new String[100][3];
	private int i=0;
	
	
	public void createAccount(String name, int ano, double bal)
	{
		cname=name;
		accno=ano;
		balance=bal;
		System.out.print("\nAccount created..");
	}
	
	public void printAccount()
	{
		System.out.print("\nCname="+cname+" Accno="+accno+" Balance="+balance);
	}
	
	
	public void deposit(String date, String tran, double amt)
	{
		balance=balance+amt;
		trans[i][0]=date;
		trans[i][1]=tran;
		trans[i][2]=""+amt;
		i++;
		System.out.print("\nAmount deposited..");
	}
	
	public void withdraw(String date, String tran, double amt)
	{
		if(amt<=balance)
		{
			balance=balance-amt;
			trans[i][0]=date;
			trans[i][1]=tran;
			trans[i][2]=""+amt;
			i++;
			System.out.print("\nAmount withdraw..");
		}
		else
			System.out.print("\nInsufficient funds..Transaction failed!!!");
			
	}
	
	public void miniStatement()
	{
		System.out.print("\nTransaction statements...");
		for (int j=0; j<i; j++)
		{
			System.out.print("\nDt:"+trans[j][0]+"    Trans:"+trans[j][1]+"  Amt:"+trans[j][2]);
		}
				
	}
	
	
	public double sumDeposits(){
		//implement code here
		
		
		
		return 0.0;
	}
	
	public double sumWithdraws(){
		//implement code here
		
		
		
		return 0.0;
	}
	
	
}



