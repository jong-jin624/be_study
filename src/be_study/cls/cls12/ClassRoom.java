package be_study.cls.cls12;

import java.util.ArrayList;

public class ClassRoom {

	int floor;
	int roomNumber;
	double area;
	boolean hasWhiteBoard;

	WhiteBoard whiteBoard;

	Aircon aircon;

//	Desk[] deskArr;
	ArrayList<Desk> deskList;

	public ClassRoom() {
		floor = 0;
		roomNumber = 0;
		area = 0;
		hasWhiteBoard = false;
//		whiteBoard = ;
		aircon = null;
		deskList = null;
	}

	public ClassRoom(int floor, int roomNumber) {
		this.floor = floor;
		this.roomNumber = roomNumber;
	}

	public ClassRoom(WhiteBoard whiteBoard, Aircon aircon) {
		this.whiteBoard = whiteBoard;
		this.aircon = aircon;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setDeskList(ArrayList<Desk> deskList) {
		this.deskList = deskList;
	}
	
	public void setWhiteBoard(WhiteBoard whiteBoard) {
		this.whiteBoard = whiteBoard;
	}
	
	public void addDesk(Desk desk) {
		
		if(deskList == null) {
			deskList = new ArrayList<Desk>();
		}
		
		deskList.add(desk);
	}
}
