package com.example;

public class TestPath {
	
	public static void main(String[] args) {
		String path = ClassLoader.getSystemClassLoader().getResource("data2excel.xlsx").getPath();
System.out.println(path);
	}

}
