package com.lew.comparable;

import java.util.Comparator;

public class AccountNameComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		int result = o2.getName().compareTo(o1.getName());
		
		return result;
	}

}
