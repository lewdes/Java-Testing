package com.lew.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.inheritance.lew.Male;

public class Boss {
	List<Male> employees;

	public Boss(List<Male> employees) {
		this.employees = employees;
	}

	public Set<Male> getAllEmployees() {
		Set<Male> employees = new TreeSet<Male>(this.employees);
		return employees;
	}

}
