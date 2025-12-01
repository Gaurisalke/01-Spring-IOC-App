package com.gaurinova.beans;

public class Car 
{
	private Engine eng = null;
	
	
	  // Costructor Injection 
	  public Car(Engine eng) 
	  { 
		  this.eng = eng;
	  System.out.println("Car :: constructor");
	  }
	 
	
	// Setter injection
	public void setEng(Engine eng)
	{
		this.eng = eng;
		System.out.println("Setter Method :: Called");
		
	}
	
	public void drive()
	{
		boolean status = eng.start();
		
		if(status)
			System.out.println("Journey Started...");
		else
			System.out.println("Engine Trouble ...");
	}
}