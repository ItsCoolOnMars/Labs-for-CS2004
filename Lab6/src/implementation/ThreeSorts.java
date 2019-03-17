package implementation;

//Java Code for Laboratory 6 � Week 6 Sorting Algorithms
//Brunel University, Computer Science Module CS2004, 2018-2019

import java.util.*;
public class ThreeSorts 
{
	private static ArrayList<Integer> CopyArray(ArrayList<Integer> a)
	{
		ArrayList<Integer> resa = new ArrayList<Integer>(a.size());
		for(int i=0;i<a.size();++i) resa.add(a.get(i));
		return(resa);
	}
	public static ArrayList<Integer> SortA(ArrayList<Integer> a)
	{
		ArrayList<Integer> array = CopyArray(a);
		int n = a.size(),i;
		boolean noswaps = false;
		
		while (noswaps == false)
		{
			noswaps = true;
			for(i=0;i<n-1;++i)
			{
				if (array.get(i) < array.get(i+1))
				{
					Integer temp = array.get(i);
					array.set(i,array.get(i+1));
					array.set(i+1,temp);
					noswaps = false;
				}
			}
		}
		return(array);
	}
	public static ArrayList<Integer> SortB(ArrayList<Integer> a)
	{
		ArrayList<Integer> array = CopyArray(a);
		Integer[] zero = new Integer[a.size()];
		Integer[] one = new Integer[a.size()];
		int i,b;
		Integer x,p;
		//Change from 8 to 32 for whole integers - will run 4 times slower
		for(b=0;b<8;++b)
		{
			int zc = 0;
			int oc = 0;
			for(i=0;i<array.size();++i)
			{
				x = array.get(i);
				p = 1 << b;
				if ((x & p) == 0)
				{
					zero[zc++] = array.get(i);
				}
				else
				{
					one[oc++] = array.get(i);
				}
			}
			for(i=0;i<oc;++i) array.set(i,one[i]);
			for(i=0;i<zc;++i) array.set(i+oc,zero[i]);
		}
		return(array);
	}
	public static ArrayList<Integer> SortC(ArrayList<Integer> a)
	{
		ArrayList<Integer> array = CopyArray(a);
		SortC(array,0,array.size()-1);
		return(array);
	}
	public static void SortC(ArrayList<Integer> array,int first,int last)
	{
		if (first < last)
		{
		   int pivot = PivotList(array,first,last);
		   SortC(array,first,pivot-1);
		   SortC(array,pivot+1,last);
		}	
	}
	private static void Swap(ArrayList<Integer> array,int a,int b)
	{
		Integer temp = array.get(a);
		array.set(a,array.get(b));
		array.set(b,temp);
	}
	private static int PivotList(ArrayList<Integer> array,int first,int last)
	{
		Integer PivotValue = array.get(first);
		int PivotPoint = first;
		for(int index=first+1;index<=last;++index)
		{
			if (array.get(index) > PivotValue)
			{
				PivotPoint = PivotPoint+1;
				Swap(array,PivotPoint,index);
			}
		}
		Swap(array,first,PivotPoint);
		return(PivotPoint);
	}
	
	public static long RunAlgorithm(int n, ArrayList<Integer> arr)
	{
		long StartTime, EndTime, ElapsedTime;

		// Save the time before the algorithm run
		StartTime=System.nanoTime();

		// Run the algorithm
		if(n == 1) {
			SortA(arr);
		} 
		else if(n == 2) {
			SortB(arr);
		} 
		else if(n == 3) {
			SortC(arr);
		} 

		// Save the time after the run
		EndTime=System.nanoTime();

		// Calculate the difference
		ElapsedTime= EndTime- StartTime;
		
		return ElapsedTime;

	}
	
	private static ArrayList<Integer> RandomArray(int n){
		Random rand = new Random();
		ArrayList<Integer> array = new ArrayList<Integer>(n);
		for(int i = 0; i < n; i++) {
			//Changed to NanoTime
			rand.setSeed(System.nanoTime());
			Integer r = Math.abs(rand.nextInt() % 256);
			array.add(r);
		}
		return array;
	}
	
	private static void ShowArray(ArrayList<Integer> array) {
		System.out.println(array);
	}
	
	public static void main(String[] args) {
//		System.out.println("size,sortA,sortB,sortC");
//		for(int i = 1000; i<=25000;i+=1000) {
//			for(int j = 0; j<10;j++) {
//				ArrayList<Integer> x = RandomArray(i);
//				System.out.println(i+","+RunAlgorithm(1,x)+","+RunAlgorithm(2,x)+","+RunAlgorithm(3,x));
//			}
//		}
		System.out.println(RunAlgorithm(1,RandomArray(30000))/1000000000.0);
	}
	
	//5 Descending order
	//6 A - Bubble, B - Radix , C - Quick
//	7)	Which one is the overall fastest and which one is the slowest algorithm? Rank the algorithms from fastest to slowest.
//			8)	Is this ranking independent of the size of the input? I.e. does it always hold true? Would you use one algorithm for smaller sizes, and another for larger?
//			9)	What is the largest sized array the best method can sort? till the heap memory run out...
//			10)	What is the largest sized array the slowest can sort in a reasonable amount of time? 30,000 ish (5-6 sec)
//			 
}