package PracticeJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExamTest2 {

	public static void main(String[] args) {
	
		String[] str = {"java", "java", "selenium", "java", "selenium", "java", "selenium","selenium"};
		List list = new ArrayList<>();
		
		Set set = new TreeSet<>();
		for (int i=0; i<str.length; i++) {
			String str1 = str[i];
			boolean status = set.add(str1);
			if (status) {
				;;;;
			}
			else {
				list.add(str1);
			}
			
		}
		System.out.println("after removing duplicates:" +set);
		System.out.println("removed duplicates are:"+list);
		

	}

}
