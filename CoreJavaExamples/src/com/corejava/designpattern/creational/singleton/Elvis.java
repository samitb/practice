package com.corejava.designpattern.creational.singleton;

//Singleton with static factory
public class Elvis {
	private static final Elvis INSTANCE = new Elvis();

	private Elvis() {
		//TODO
	}

	public static Elvis getInstance() {
		return INSTANCE;
	}

	public void leaveTheBuilding() { 
		//TODO
	}
	
	private Object readResolve() {
		// Return the one true Elvis and let the garbage collector
		// take care of the Elvis impersonator.
		return INSTANCE;
	}
}
