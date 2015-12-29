package com.exemples.interfaçage;

public interface OuterInterface extends InnerInterface {
	
	int i = 10 ;
	
	void displayMsg();
	
	

}

interface InnerInterface{
	void displayMsg1();
}
