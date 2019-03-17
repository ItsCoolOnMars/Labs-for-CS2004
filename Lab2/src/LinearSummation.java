
public class LinearSummation {

	public int LinearSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public int LinearSum2(int n) {
		return ((n+1)*n)/2;
	}
	
	public static void main(String[] args) {
		System.out.println(new LinearSummation().LinearSum(50));
	}
}
