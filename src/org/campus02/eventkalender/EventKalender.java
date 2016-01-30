package org.campus02.eventkalender;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {
	private ArrayList<Event> events = new ArrayList<>();

	public void add(Event e) {
		events.add(e);
	}

	public Event getByTitle(String title) {
		for (Event event : events) {
			if (event.getTitle().equals(title)) {
				return event;
			}
		}
		return null;
	}

	public ArrayList<Event> getByOrt(String ort) {
		ArrayList<Event> eventsbyort = new ArrayList<>();
		for (Event event : events) {
			if (event.getOrt().equals(ort)) {
				eventsbyort.add(event);
			}
		}
		return eventsbyort;
	}
	
	public Event getMostExpensiveByOrt(String ort){
		Event mostexpensiveevent=null;
		double preis=0.0;
		for (Event event : events) {
			if(event.getEintrittspreis()>preis){
				preis=event.getEintrittspreis(); //böse nicht vergessen!!
				mostexpensiveevent=event;
			}			
		}		
		return mostexpensiveevent;
	}
	
	public double getAvgPreisByOrt(String ort){
		double preis=0;
		int counter=0;
		
		for (Event event : events) {
			counter++;
			preis+=event.getEintrittspreis();
		}
		return preis/counter;
	}
	
	public HashMap<String, Integer> getCountByOrt(){
		HashMap<String, Integer> eventsbyort = new HashMap<>();		
		for (Event event : events) {
			Integer currentValue=eventsbyort.get(event.getOrt());
			if (currentValue != null){				
				eventsbyort.put(event.getOrt(), currentValue+1);
			}
			else{
				eventsbyort.put(event.getOrt(), 1);
			}		
		}
		return eventsbyort;

	}

}
