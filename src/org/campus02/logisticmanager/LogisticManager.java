package org.campus02.logisticmanager;

import java.util.ArrayList;

public class LogisticManager {
	private ArrayList<Moveable> move = new ArrayList<>();
	
	public void addMoveable(Moveable m){
		move.add(m);
	}
	
	public void moveAll(String destination){
		for (Moveable moveable : move) {
			moveable.move(destination);
		}
	}

}
