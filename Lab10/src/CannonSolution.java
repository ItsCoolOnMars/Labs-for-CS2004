public class CannonSolution
{
	private double angsol;
	private double velsol;
	//Creates a new scales solution based on a string parameter
	//The string parameter is checked to see if it contains all zeros and ones
	//Otherwise the random binary string generator is used (n = length of parameter)
	public CannonSolution(double angle, double velocity)
	{
		boolean ok = true;

			if (angle<25 || angle>55) ok = false;
			if (velocity<1500 || velocity>1650) ok = false;

		if (ok)
		{
			angsol = angle;
			velsol = velocity;
		}
		else
		{
			angsol = CS2004.UR(25, 55);
			velsol = CS2004.UR(1500, 1650);
		}
	}
	
	//This is the fitness function for the Scales problem
	//This function returns -1 if the number of weights is less than
	//the size of the current solution
	public double CannonFitness(double TargetRange)
	{
	double range = Cannon.GetMaxRange(angsol, velsol);
	return Math.abs(range-TargetRange);
	}
	//Display the string without a new line
	public void print()
	{
		System.out.print(angsol + "," + velsol);
	}
	//Display the string with a new line
	public void println()
	{
		print();
		System.out.println();
	}
	
	public void SmallChange()
	{
		if (CS2004.UI(0, 1)==1) {
			angsol = angsol + CS2004.UR(-0.3, 0.3);
			if (angsol>55) {angsol = 55;}
			if (angsol<25) {angsol = 25;}
		} else {
			velsol = velsol + CS2004.UR(-1.5, 1.5);
			if (velsol>1650) {velsol = 1650;}
			if (velsol<1500) {velsol = 1500;}
		}
		
	}
	
	public double GetAng()
	{
		return(angsol);
	}
	
	public double GetvVel()
	{
		return(velsol);
	}


}