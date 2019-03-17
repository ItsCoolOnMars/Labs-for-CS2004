import java.io.File;
import java.util.*;

public class Lab8 {

	public static void main(String args[])
	{
		
//		Exercise 2	
//		for(int i=0;i<10;++i)
//		{
//			double x = CS2004.UR(-1, 1);
//			System.out.println(x);
//		}
		
//		Exercise 3
//		ScalesSolution s = new ScalesSolution("10101");
//		s.println();
//		
//		s = new ScalesSolution("10101x");
//		s.println();
//		
//		ArrayList<Double> fig = new ArrayList<Double>();
//		for(int i = 1; i<11;i++) {
//			fig.add((double) i);
//		}
//		
//		ScalesSolution rand = new ScalesSolution(10);
//		System.out.println(rand.ScalesFitness(fig));
		
//		Exercise 4
		ArrayList<Double> primes = CS2004.ReadNumberFile("src/1000 Primes.txt");
//		ScalesSolution rand = new ScalesSolution(8);
//		System.out.println(rand.ScalesFitness(primes));
		
		double fitness;
		double average;
		double total = 0;
		int numOfWeights;
		int zeroes = 0;
		for(int i = 0; i < 5;i++) {
			
			fitness = 0;
			zeroes = 0;
			if(i == 0) {
				numOfWeights = 10;
			}else if (i == 1) {
				numOfWeights = 100;
			}else if (i == 2) {
				numOfWeights = 250;
			}else if(i == 3) {
				numOfWeights = 500;
			}else {
				numOfWeights = 1000;
			}
			for(int j = 0; j < 1000;j++) {
				ScalesSolution rand = new ScalesSolution(numOfWeights);
				fitness = rand.ScalesFitness(primes);
				total += fitness;
				if(fitness < 10) {
					zeroes++;
				}
			}
			
			average = total / 1000;
			System.out.println("The evaluation of the case number " + (i+1));
			System.out.println("average = " + average);
			System.out.println("number of good solutions = " + zeroes);
			System.out.println();
		}
		
		
	
	}

// Only for very small size, as the probability of a good solution gets significantly lower

}
