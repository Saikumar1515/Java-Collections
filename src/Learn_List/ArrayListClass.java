package Learn_List;

import java.util.ArrayList;
//import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		
//		List<Integer> arr = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(80);
		System.out.println(list.get(2));  //80
		System.out.println(list.size());  //3
		
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		
		for(int x: list) {
			System.out.println(x);
		}
		System.out.println(list.contains(5));
		
		list.remove(1);
	}
}
