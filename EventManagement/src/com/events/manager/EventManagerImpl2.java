package com.events.manager;

import com.events.entities.Event;

public class EventManagerImpl2 implements EventManager {

	@Override
	public Event create() {
		return new Event(123l, "NewInterface", "Abstraction and Runtime Plymorphism");
	}

}
