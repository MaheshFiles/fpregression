package com.mahesh.automation.corejava;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(456);
		list.add(91456);
		list.add(91);
		list.add(56);
		list.add(9191456);
		list.add(456456);
		
		for (Object obj:list) {
			Integer i=(Integer) obj;
			if (i==91456) {
				System.out.println("hi");
			}
			System.out.println(i);
		}

	}

}
