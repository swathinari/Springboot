package com.java.basics;

// here i used static class because in the same class i extended the another class. if you are 
//trying to override the same method you can use 2 different classes then extends it.


public class RuntimePoly {
	int res;
	
	public int add(int a, int b) {
		
		res=a+b;
		return res;
	}
	
	static class DynamicMethodDispatch extends RuntimePoly{
		public int add(int a, int b) {
			res= a+b;
			return res;
		}
	}
	static class Swathi extends DynamicMethodDispatch{
		public int add(int a, int b) {
			res= a*b;
			return res;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimePoly 	dynamicMethodDispatch = new DynamicMethodDispatch();
		RuntimePoly swathi= new Swathi();
		System.out.println("dynamic method dispatch: "+dynamicMethodDispatch.add(10, 100));
		System.out.println("printing from swathi class: "+swathi.add(10, 10));
	
		
	}

}
