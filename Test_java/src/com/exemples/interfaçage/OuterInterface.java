package com.exemples.interfa�age;

public interface OuterInterface extends InnerInterface {
	
	int i = 10 ;
	
	void displayMsg();
	
	

}

interface InnerInterface{
	void displayMsg1();
}
