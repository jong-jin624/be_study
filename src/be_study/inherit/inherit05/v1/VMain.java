package be_study.inherit.inherit05.v1;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class VMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();
		Cleaner c3 = new WindowCleaner();
		Cleaner c4 = new FloorCleaner();
		
		List<Cleaner> list = new ArrayList<Cleaner>();
		
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		
		
		DustCleaner[] dustArr = new DustCleaner[3];
		dustArr[0] = new DustCleaner();
		dustArr[1] = new DustCleaner();
		dustArr[2] = new DustCleaner();
		
		List<WindowCleaner> windowList = new ArrayList<WindowCleaner>();
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		
		List<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
		windowList.add(new FloorCleaner());
		windowList.add(new FloorCleaner());
		windowList.add(new FloorCleaner());
		
		for(int i=0; i<dustArr.length; i++) {
			dustArr[i].removeDust();
		}
		
		for(int i=0; i<windowList.size(); i++) {
			windowList.get(i).washWindow();
		}
		
		
		
	}

}
