package it.geoframe.blogspot.helloworld;

import oms3.annotations.In;
import oms3.annotations.Execute;


public class HelloWorld {
	
	@In
	public String message;
	
	
	@Execute
	public void printMessage() {
		
		System.out.println(message);
		
	}
	

}
