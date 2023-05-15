public class Atom
{
	private int protons;
	private int neutrons;
	private int electrons;

	public Atom()
	{
		this.protons = 1;
		this.neutrons = 0;
		this.electrons = 1;
	}

	public int getProtons(){return this.protons;}
	public int getNeutrons(){return this.neutrons;}
	public int getElectrons(){return this.electrons;}

	public boolean setProtons(int protons)
	{
		boolean res = false;
		if(protons>=1)
		{
			this.protons = protons;
			res = true; 
		}
		return res;
	}

	public boolean setNeutrons(int neutrons)
	{
		boolean res = false;
		if(neutrons>=0)
		{
			this.neutrons = neutrons;
			res = true; 
		}
		return res;
	}

	public boolean setElectrons(int electrons)
	{
		boolean res = false;
		if(electrons>=1)
		{
			this.electrons = electrons;
			res = true; 
		}
		return res;
	}

	public boolean isIon()
	{
		boolean res = false;
		if(this.electrons != this.protons)
			res = true;
		return res;
	}

	public int getAtomicMassNumber()
	{
		return this.protons + this.neutrons;
	}
}