import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lab7 {

	public static void PrintArray (double [][] array){
		System.out.println(Arrays.deepToString(array));
	}
	
	public static double[][] RandomArray(int n){
		Random rand = new Random();
		double matrix[][] = new double[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0+i; j < n; j++) {
				if(i==j) {
					matrix[i][j]=0;
				}else {
					rand.setSeed(System.nanoTime());
					Integer r = Math.abs(rand.nextInt() % 101);
					matrix[i][j]=r;
					matrix[j][i]=matrix[i][j];
				}
				
			}
		}
		return matrix;
	}
	
	public static long RunAlgorithm(int n)
	{
		long StartTime, EndTime, ElapsedTime;

		double g[][] = RandomArray(n);
		// Save the time before the algorithm run
		StartTime=System.nanoTime();

		// Run the algorithm
		MST.PrimsMST(g);

		// Save the time after the run
		EndTime=System.nanoTime();

		// Calculate the difference
		ElapsedTime= EndTime- StartTime;
		
		return ElapsedTime;

	}
	
	
	public static void main(String[] args) {
	
//		Exercise 1
//		double g[][] = {{0,1,2},{1,0,3},{2,3,0}};
//		double mst[][] = MST.PrimsMST(g);
//		PrintArray(mst);
		
//		Exercise 2
//		double g[][] = {{0,1,2,3,0},{1,0,6,0,5},{2,6,0,4,1},{3,0,4,0,2},{0,5,2,1,0}};
//		double mst[][] = MST.PrimsMST(g);
//		PrintArray(mst);
		
//		Exercise 3
		
		System.out.println("size,time");
		for(int i = 100; i<=500;i+=10) {
			for(int j = 0; j<10;j++) {
				System.out.println(i+","+RunAlgorithm(i));
			}
		}

	}

}
