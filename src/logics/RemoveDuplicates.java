package logics;

import java.util.*;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,3,2,0);
		Set<Integer> uniqueNumbers = new HashSet<Integer>(numbers);
		List<Integer> result = new ArrayList<Integer>(uniqueNumbers);
		System.out.println(result);
	}
}