package PracticeJava;

import java.util.Set;
import java.util.TreeSet;

public class ExamTest1 {

	public static void main(String[] args) {
	
		String[] str = {"java", "java", "selenium", "java", "selenium", "java", "selenium","selenium"};
		
		Set set = new TreeSet<>();
		for (int i=0; i<str.length; i++) {
			String str1 = str[i];
			set.add(str1);
		}
		System.out.println(set);
		

	}

}
