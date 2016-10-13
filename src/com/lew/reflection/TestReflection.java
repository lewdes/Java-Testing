package com.lew.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestReflection {
	public static void main(String[] args) {
		Class<?> clazz = MyAnnotation.class;
		System.out.println(getNumAnnotatedMethods(clazz));
		
	}

	public static int getNumAnnotatedMethods(Class<?> clazz) {
		int count = 0;

		Method[] methods = clazz.getMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(MyAnnotation.class))
				count++;
		}

		return count;
	}

}
