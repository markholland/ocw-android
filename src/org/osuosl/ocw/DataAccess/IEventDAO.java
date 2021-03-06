package org.osuosl.ocw.DataAccess;

import java.util.ArrayList;

import org.osuosl.ocw.BusinessLogic.Event;


public interface IEventDAO {

	public Long addEvents(ArrayList<Event> mEvents);
	public int updateEvents(ArrayList<Event> events);
	public Event getEventRow(String id);
	public ArrayList<Event> getAllEvents();
	public long numRows();
	public void deleteAllRows();
	
}
