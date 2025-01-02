package logics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequency {

	public static void main(String[] args) {
		
		List<Integer> frequency = Arrays.asList(1,2,2,3,4,3,4,5,6,6,5);
		
		Map<Integer, Integer> num = new HashMap<Integer, Integer>();
		
		for (Integer integer : frequency) {
			
			num.put(integer, num.getOrDefault(integer, 0)+1);
		}
		System.out.println(num);
	}
}
