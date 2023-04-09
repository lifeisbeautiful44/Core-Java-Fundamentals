package com.events.entities.test;

import com.events.entities.Event;
import com.events.entities.Organizer;
import com.events.manager.EventManager;
//import com.events.manager.EventManagerImpl;
import com.events.manager.EventManagerImpl2;

public class Test {
	
	public static void main(String[] args) {
		Organizer organizer =new Organizer();
		
		organizer.setId(123l);
		organizer.setName("Srijansil");
		System.out.println(organizer.getName());
		System.out.println(organizer.getName());
		
		Event evt = new Event(1l, "Java Company", "Best Java wisdom");
		System.out.println(evt.getName());
		System.out.println(evt.getDescription());
		
		EventManager evM = new EventManagerImpl2();
	
		System.out.println(evM.getClass());
		System.out.println(evM.create().getClass());

		System.out.println(evM.create().getId());
		
	
		
	}

}
