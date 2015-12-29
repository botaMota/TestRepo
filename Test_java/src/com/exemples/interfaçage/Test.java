package com.exemples.interfaçage;

public class Test {

	public static void main(String[] args) {

		A a = new A();
		a.displayMsg();
		System.out.println(A.i );
	}

}

class A implements OuterInterface {


	@Override
	public void displayMsg1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMsg() {
		// TODO Auto-generated method stub
		
	}

}
