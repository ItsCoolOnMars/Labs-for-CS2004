
public class GeoSummation {

	public long GeoSum(int n, int a) {
		long sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += Math.pow(a, i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		System.out.println(new GeoSummation().GeoSum(200, 2));
		long time2 = System.nanoTime();
		System.out.println("The time taken is " + (time2-time1)/1000);
	}
}
