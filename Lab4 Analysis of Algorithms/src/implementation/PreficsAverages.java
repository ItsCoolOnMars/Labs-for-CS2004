package implementation;

public class PreficsAverages {
	
	
	public double[] PrefixAverages1(double[] x) {
		double[] a = new double[x.length];
		for(int i = 0; i < x.length; i++) {
			double s = x[0];
			for(int j = 1; j < x.length; j++) {
				if(j<=i) {
					s = s + x[j];
				}
			}
			a[i] = s/(i+1);
		}
		return a;
	}
	
	public double[] PrefixAverages2(double[] x) {
		double [] a = new double[x.length];
		double s = 0;
		for(int i = 0; i < x.length; i++) {
			s = s + x[i];
			a[i] = s/(i+1);
		}
		return a;
	}
	
	public double[] makeAnArray(int size) {
		double[] array = new double[size];
		for(int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 100;
		}
		return array;
	}
	
	public void RunAlgorithm(int n, double[] x)
	{
		long StartTime, EndTime, ElapsedTime;

		// Save the time before the algorithm run
		StartTime=System.nanoTime();

		// Run the algorithm
		if(n == 1) {
			new PreficsAverages().PrefixAverages1(x);
		} 
		
		else if(n == 2) {
			new PreficsAverages().PrefixAverages2(x);
		} 

		// Save the time after the run
		EndTime=System.nanoTime();

		// Calculate the difference
		ElapsedTime= EndTime- StartTime;

		// Print it out
		System.out.println(ElapsedTime);
	}


	public static void main(String[] args) {
		int numOfTries = 50;
		System.out.print("Size,RunningTime");
		for(int i = 0; i < 50; i++) {
		}
		System.out.println();
		PreficsAverages test = new PreficsAverages();
		for(int size = 1; size <= 500; size++) {
			double[] testArray = test.makeAnArray(size);
			for (int i = 0; i < numOfTries; i++) {
				System.out.print(size + ",");
				test.RunAlgorithm(2, testArray);
				testArray = test.makeAnArray(size);
			}
			System.out.println();
		}
		
	}

}
