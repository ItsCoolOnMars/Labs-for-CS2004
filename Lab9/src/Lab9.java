import java.util.*;

public class Lab9 {
	
	public static ScalesSolution RMHC(ArrayList<Double> weights,int n,int iter)
	{
		ScalesSolution sol = new ScalesSolution(n);
		for(int i = 0; i<iter; i++) {
			ScalesSolution oldsol = new ScalesSolution(sol.GetSol());
			sol.SmallChange();
			if(sol.ScalesFitness(weights)>oldsol.ScalesFitness(weights)) {
				sol = new ScalesSolution(oldsol.GetSol());
			}
//			System.out.println("Current Iteration: "+ i + " Current Fitness: " + sol.ScalesFitness(weights));
		}
		System.out.println("Final Fitness: " + sol.ScalesFitness(weights));
		return(sol);
	}

	public static long RunAlgorithm(ArrayList<Double> weights,int n,int iter)
	{
		long StartTime, EndTime, ElapsedTime;

		// Save the time before the algorithm run
		StartTime=System.currentTimeMillis();

		// Run the algorithm
		RMHC(weights, n, iter); 
		

		// Save the time after the run
		EndTime=System.currentTimeMillis();

		// Calculate the difference
		ElapsedTime= EndTime- StartTime;
		
		return ElapsedTime;

	}

	public static void main(String args[])
	{
//		Exercise 1
//		ScalesSolution s = new ScalesSolution("11111");
//		s.println();
//		s.SmallChange();
//		s.println();
		
//		Exercise 2
//		ScalesSolution s1 = new ScalesSolution(10);
//		s1.println();
//		ScalesSolution s2 = new ScalesSolution(s1.GetSol());
//		s2.println();
		
//		Exercise 3
		ArrayList<Double> primes = CS2004.ReadNumberFile("src/1000 Primes.txt");
		
		
//		for(int i = 0; i<10; i++) {
//			System.out.println((i+1) + ". Time: " + RunAlgorithm(primes,1000,1000) + "ms");
//		}
		for(int i = 0; i<10; i++) {
			System.out.println((i+1) + ". Time: " + RunAlgorithm(primes,1000,10000) + "ms");
		}
		
//		Do you get the same average as in the lecture notes? (9.0) Approx. Yes
//		Time how long each run takes for 1,000 iterations. 30-40 ms
		
//		Now run the algorithm for as many times as possible within 5 minutes, running each repeat for 10,000 iterations.
//		Does a run for 10,000 iterations take ten times longer than a run for 1,000?  5-10 times longer
//		What average result do you get? 1.0 most common
//		How does it compare with the results in the lecture notes? Very similar
//
//		Finally do you think using a String for the representation was a good idea? 
//		good enough but could be better, String is too complex and not flexible enough
//		If not, what would have been better? probably array of booleans


		
	}

}
