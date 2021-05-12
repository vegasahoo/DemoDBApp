package test;

import java.util.ArrayList;
import java.util.Collections;

public class Try1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(7);
		list.add(4);
		list.add(8);
		list.add(0);
		list.add(10);
		list.add(2);
		Collections.sort(list);
		System.out.println(list);
	}

}
