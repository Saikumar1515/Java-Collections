package logics;

import java.util.*;

class ReverseElement {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int left = 0;
        int right = numbers.size() - 1;

        // Swap elements until left and right pointers meet
        while (left < right) {
            Integer temp = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temp);
            left++;
            right--;
        }

        System.out.println(numbers);
	}
}
