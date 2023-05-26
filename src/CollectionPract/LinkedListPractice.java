package CollectionPract;

import java.util.*;

public class LinkedListPractice {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("S1");
		al.add("S2");
		al.add("S3");
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Y1");
		ll.add("Y2");
		ll.add("Y3");
		ll.add(1, "YY");
	//  ll.addAll(al);
		ll.addAll(0, al);
	//	ll.remove("YY");
	//	ll.removeAll(al);
		ll.set(2, "SSSSSS");
		
         System.out.println(ll);
	// System.out.println(ll.get(2));
    //     System.out.println(ll.contains("S1"));
		
		
		
	}
}
