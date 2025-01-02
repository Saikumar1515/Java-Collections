package logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OccurencesOfWord {
	
	public static void main(String[] args) {
		
		String sentence = "I am Learning core java";
		
		String[] words = sentence.split("\\s+");
		
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for(String count1 : words) {
			count.put(count1, count.getOrDefault(count, 0)+1);
		}
		
      for (String word : count.keySet()) {
          System.out.println(word + ": " + count.get(word));
      }	
		
	}

}







