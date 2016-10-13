package com.lew.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable{

	public static void main(String[] args) {
		List<Account> array = new ArrayList<Account>();
		Account a1 = new Account("cew", "D", "N/A");
		Account a2 = new Account("abc", "A", "N/A");
		Account a3 = new Account("bsd3", "B", "N/A");
		Account a4 = new Account("rLew4", "A", "N/A");
		Account a5 = new Account("yLew5", "C", "N/A");
		
		array.add(a1);
		array.add(a2);
		array.add(a3);
		array.add(a4);
		array.add(a5);
		
		AccountNameComparator comparator = new AccountNameComparator();
		
		Collections.sort(array,comparator);
		
		for(Account a : array){
			System.out.println("Name: "  + a.getName() );
		}
		

		

	}



}
