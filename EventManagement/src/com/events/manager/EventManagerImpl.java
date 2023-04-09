package com.events.manager;

import com.events.entities.Event;

public class EventManagerImpl implements EventManager {

	@Override
	public Event create() {
		
		return new Event(456l,null,null);
		
		
	}

}
