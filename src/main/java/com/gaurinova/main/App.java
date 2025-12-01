package com.gaurinova.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaurinova.beans.Car;
import com.gaurinova.beans.Engine;

public class App {

	public static void main(String[] args) 
	{
		
		// Start IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		//Get bean object from IOC
		Car car = context.getBean(Car.class);
		
		// Calling bean method
		car.drive();
	}
}