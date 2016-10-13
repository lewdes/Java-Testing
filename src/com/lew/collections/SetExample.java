package com.lew.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.inheritance.lew.Male;

public class SetExample {
	public static void main(String[] args) {
		List<Male> empList = new ArrayList<Male>();
		empList.add(new Male("Lew"));
		empList.add(new Male("Ali"));
		empList.add(new Male("Kael"));
		empList.add(new Male("Gg"));
	
		Boss boss = new Boss(empList);
		
		
//		for(Male m : boss.getAllEmployees()){
//			System.out.println);
//		}
		System.out.println(boss.getAllEmployees().toString());
		
		List<Male> empList2 = new ArrayList<Male>();
		
		Iterator<Male> iterator = empList2.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	}
	
}
