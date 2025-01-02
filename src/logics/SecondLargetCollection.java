package logics;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargetCollection {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		Set<Integer> secondLargest = new TreeSet<Integer>(numbers);
		
		Integer[] sortedArray = secondLargest.toArray(new Integer[0]);
		
		if(sortedArray.length >= 2) {
			System.out.println(sortedArray[sortedArray.length-2]);
		}else {
			System.out.println("No second largest element");
		}
		
	}

}
