package org.osuosl.ocw.BusinessLogic;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


public class Event {
	
    private int id;
    private String title;
    private Date start_time;
    private Date end_time;
    private String description;
    private String room_title;
    private Track track;
    private ArrayList<Speaker> speakers;
    private Speaker presenter = null;
	
	public Event(){
		this.id = -1; //important so as to not be a valid event in the hash map of events
		this.title = null;
		this.start_time = null;
		this.end_time = null;
		this.description = null;
		this.title = null;
		this.room_title = null;
		this.track = null;
		this.speakers = new ArrayList<Speaker>();
		this.presenter = null;
	}
	
	public Event(int id, String event_title, Date start_time,
  			Date end_time, String description, String room_title, Track track){
		
		this.id = id;
		this.title = event_title;
		this.description = description;
		this.start_time = start_time;
		this.end_time = end_time;
		this.room_title = room_title;
		this.track = null;
		
		this.speakers = new ArrayList<Speaker>();
		
	}
	
	
//	//Constructor with all parameters as Strings to facilitate when retrieving from the database
//	
//	public Event(String event_id, String event_title, String start_time,
//  			String end_time, String description, String room_title, String track_id, String[] speaker_ids,
//  			String presenter){
//		
//		DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy");
//		
//		this.id = Integer.parseInt(event_id);
//		this.title = event_title;
//		this.description = description;
//		try{
//			this.start_time = formatter.parse(start_time);
//			this.end_time = formatter.parse(end_time);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		this.room_title = room_title;
//		this.track_id = Integer.parseInt(track_id);
//		this.speaker_ids = speaker_ids;
//		this.presenter = presenter;
//	}
	
	
	// Getters and Setters auto-generated by eclipse //

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoom_title() {
		return room_title;
	}

	public void setRoom_title(String room_title) {
		this.room_title = room_title;
	}

	public Track getTrack() {
		return track;
	}

	public void setTrack(Track track) {
		this.track = track;
	}

	public ArrayList<Speaker> getSpeakers() {
		return speakers;
	}

	public void setSpeakers(ArrayList<Speaker> speakers) {
		this.speakers = speakers;
	}
	
	public void addSpeaker(Speaker speaker) { 
		this.speakers.add(speaker);
	}
	
	public void removeSpeaker(Speaker speaker) { 
		this.speakers.remove(speaker);
	}

	public Speaker getPresenter() {
		return presenter;
	}

	public void setPresenter(Speaker presenter) {
		this.presenter = presenter;
	}
	    
	public boolean hasSpeaker(Speaker speaker) {
		return speakers.contains(speaker);
	}
	
	public boolean isPresenter(Speaker speaker) {
		
		return presenter.getId() == speaker.getId();
	}
	
}
