package com.coachsuggest.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachSuggestApp {

	public static void main(String[] args) {
		
		//This is not configurable
		/**Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());*/
		
		//1. ApplicationContext represents Spring Container and ClassPathXmlApplicationContext is a specific implementation of the Spring Container.
		// We are load the configuration file for configuring the Spring Container
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		//2. Retrieve bean from the spring container
		//When we pass the interface to the method, behind the scenes Spring will cast the object for you
		//and provides a measure of type safety by throwing a BeanNotOfRequiredTypeException if the bean is not of the required type
		//when compared to normal casting.
		Coach theCoach = appContext.getBean("myCoach", Coach.class);
		
		//3. Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the context
		
	}

}
