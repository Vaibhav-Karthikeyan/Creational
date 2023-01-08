package com.masai.singleton;

import java.lang.reflect.Field;

public class Singleton {

	public static void main(String[] args) {
		DatabaseConnector a = DatabaseConnector.INSTANCE;
		DatabaseConnector s = DatabaseConnector.INSTANCE;
		System.out.println(a.hashCode());
		try {
		Field field = DatabaseConnector.class.getDeclaredField("username");
		field.setAccessible(true);
		field.set(s, "user");
		field.setAccessible(false);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(a.getUsername());
		System.out.println(s.getUsername());
		System.out.println(s.hashCode());
	}

}
