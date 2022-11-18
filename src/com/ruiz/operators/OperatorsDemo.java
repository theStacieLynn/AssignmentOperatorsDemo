package com.ruiz.operators;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,k;
		j=10; //j gets the value 10
		j=5;//j gets the value 5, the value 10 gets overwritten
		k=j;
		
		System.out.println("j is : " +j);
		System.out.println("k is : "+k);
		
		//Multiple Assignments
		k=j=10;
		System.out.println("j is : " +j);
		System.out.println("k is : "+k);

	}

}
