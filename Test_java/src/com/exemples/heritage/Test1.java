package com.exemples.heritage;

public class Test1 {
	
	public static void main(String[] args) {
		A a = new C();
		a.f();
	}

}

class A {

	void f() {
		System.out.println("A.f");
		this.g();
	}

	void g() {
		System.out.println("A.f");
	}

}

class B extends A {

	void f() {
		System.out.println("B.f");
		super.f();
	}

	void g() {
		System.out.println("B.f");
	}
}

class C extends B {
	void f() {

		System.out.println("C.f");
		super.f();
	}

	void g() {
		System.out.println("C.g");
		f();
	}
}

//class D extends C {
//	void f() {
//
//		System.out.println("D.f");
//		super.f();
//	}
//
//	void g() {
//		System.out.println("D.g");
//		f();
//	}
//}
