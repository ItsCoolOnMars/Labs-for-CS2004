package implementation;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Lab5 {
	
	
	public static void PrintCollection(Collection<Data> c)
	{
		for (Iterator<Data> iter = c.iterator(); iter.hasNext();)
		{
			Data x = (Data)iter.next();
			x.Print();
		}
		System.out.println();
	}

	
	public static void main(String args[])
	{
		//Exercise 2: ArrayList and LinkedList
		
		Data x = new Data("Fred",21);
		Data y = new Data("Jo",43);
		Data z = new Data("Zoe",37);
		Data a = new Data("Harry",78);
//		
//		LinkedList<Data> linkedList = new LinkedList<Data>();
//		linkedList.add(x);
//		linkedList.add(y);
//		linkedList.add(z);
//		linkedList.add(2, a);
//		
//		ArrayList<Data> array = new ArrayList<Data>();
//		array.add(x);
//		array.add(y);
//		array.add(z);
//		array.add(2, a);
//		
//		PrintCollection(linkedList);
//		PrintCollection(array);
		
		//Exercise 3: ArrayList Implementation Considerations
		
//		ArrayList<Data> ArrayA = new ArrayList<Data>();
//		ArrayA.add(x);
//		ArrayA.add(y);
//		ArrayA.add(z);
//		
//		ArrayList<Data> ArrayB = new ArrayList<Data>();
//		
//		PrintCollection(ArrayA);
//		System.out.println();
//		ArrayB = ArrayA;
//		PrintCollection(ArrayB);
//		System.out.println();
//		ArrayA.remove(1);
//		PrintCollection(ArrayB);
//		
//		ArrayList<Data> ArrayC = new ArrayList<Data>();
//		ArrayC.add(x);
//		ArrayC.add(y);
//		ArrayC.add(z);
//
//		ArrayList<Data> ArrayD = new ArrayList<Data>();
//		
//		PrintCollection(ArrayC);
//		System.out.println();
//		ArrayD = (ArrayList<Data>)ArrayC.clone();
//		ArrayC.remove(1);
//		PrintCollection(ArrayC);
//		System.out.println();	
//		PrintCollection(ArrayD);
//		System.out.println();
		
		//Exercise 3: Stacks
		
//		Stack<Data> stack = new Stack<Data>();
//		
//		stack.push(x);
//		stack.push(y);
//		stack.push(z);
//		
//		PrintCollection(stack);
//		
//		while(stack.isEmpty() == false)
//		{
//			stack.pop().Print();
//		}
//		System.out.println(stack.size());
		
		//Exercise 4: Queues
		
		ArrayBlockingQueue<Data> q = new ArrayBlockingQueue<Data>(10);

		q.add(x);
		q.add(y);
		q.add(z);
		
		PrintCollection(q);
		
		while(q.isEmpty() == false)
		{
			q.poll().Print();
		}	
		System.out.println(q.size());
		
		for(int i=0;i<20;++i)
		{
			q.offer(new Data("Test:"+String.valueOf(i),i));
		}
		PrintCollection(q);



	}
}
