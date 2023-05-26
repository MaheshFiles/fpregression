package PracticeJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExamTest3 {

	public static void main(String[] args) {
	
		List list = new ArrayList<>();
		
		list.add("java");
		list.add(456);
		list.add('d');
		list.add(456.456);
		list.add("java");
		list.add(456);
		list.add('d');
		list.add(456.456);
		list.add("java");
		list.add(456);
		
		System.out.println(list);
	//	 approch 1 removing duplicate elements
		HashSet hs = new HashSet(list);
		System.out.println(hs);
		
		// approch 2
		HashSet set = new HashSet();
		set.addAll(list);
		System.out.println(set);
		
		//approch 3
		LinkedHashSet lhs = new LinkedHashSet();
		for (int i=0; i<list.size();i++) {
				Object obj = list.get(i);
				lhs.add(obj);
		}
		System.out.println(lhs);
		
		//approch 4
		List listdup = new ArrayList();
		LinkedHashSet lhs1 = new LinkedHashSet();
		for (int i=0; i<list.size();i++) {
			
			Object obj = list.get(i);
			boolean status = lhs1.add(obj);
			if (status) {
				;;;;
			}
			else {
			listdup.add(obj);	
			}
		}
		System.out.println(lhs1);
		System.out.println("removed duplicate elements are:"+listdup);


	}

}
