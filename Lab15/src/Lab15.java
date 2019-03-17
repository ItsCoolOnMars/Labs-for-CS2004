import java.util.ArrayList;
import java.util.Collection;

public class Lab15 {
	
	public static double getFitness(Integer [] tour, double[][] data) {
		double s = 0;
		for (int i = 0; i < tour.length-1; i++) {
			int a = tour[i];
			int b = tour[i+1];
			s += data[a][b];
		}
		s += data[tour[0]][tour[tour.length-1]];
		return s;
	}
	
	private static void printSolution(Integer[] tour) {
		String output;
		output = Integer.toString(tour[0]);
		for (int i = 1; i < tour.length; i++) {
			output += " -> " + Integer.toString(tour[i]);
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		double [][] data = TSP.ReadArrayFile("src/TSPData/TSP_48.txt", " ");
		ArrayList<Integer> optTour = TSP.ReadIntegerFile("src/TSPData/TSP_48_OPT.txt");
		Integer[] optTourArr = optTour.toArray(new Integer[optTour.size()]);
		HillClimbing name = new HillClimbing(data,100000);
		System.out.println("OPTIMUM: " + getFitness(optTourArr,data));
		printSolution(optTourArr);
	}

}
