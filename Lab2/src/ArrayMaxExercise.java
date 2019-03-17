
public class ArrayMaxExercise {
	public double ArrayMax(double[] array) {
		double currentMax = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > currentMax) {
				currentMax = array[i];
			}
		}
		return currentMax;
	}
	
	public double ArrayMin(double[] array) {
		double currentMin = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < currentMin) {
				currentMin = array[i];
			}
		}
		return currentMin;
	}
	
	public void TestArrayMax() {
		double[] testArray = new double[(int)(Math.random()*100)+1];
		System.out.println("The array generated has the length of " + testArray.length);
		for(int i = 0; i<testArray.length;i++) {
			testArray[i] = Math.random()*100;
		}
		System.out.println("The largest number of this array is " + ArrayMax(testArray));
		System.out.println("The smallest number of this array is " + ArrayMin(testArray));
	}

	public static void main(String[] args) {
		new ArrayMaxExercise().TestArrayMax();
	}
}
