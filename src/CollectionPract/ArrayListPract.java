package CollectionPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPract {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,5,8,9,2};
		ArrayList<Integer> all = new ArrayList<>(Arrays.asList(arr));
		all.add(5);
		
		
		/* all.add(0, 8);
		all.add(5);
		all.add(0, 8);
		all.add(5);
		all.add(0, 8);
		all.add(5);
		all.add(0, 8);
		all.add(5);
		all.add(0, 8);
		all.add(456); */
		System.out.println(all);
		System.out.println(all.size());
       // System.out.println(all.get(2));
		
		//all.remove(3);
		//System.out.println(all);
		
	//	all.containsAll(all);
	//	System.out.println(all.contains(9));
		
	//	all.set(2,27);
	//	System.out.println(all);
		
		/*for(int i=0; i<all.size(); i++) {
			System.out.print(all.get(i) + " ");
		} */
		
		for (Integer integer: all) {
			System.out.println(integer);
		}
		Collections.synchronizedCollection(all);
		
	}

}
