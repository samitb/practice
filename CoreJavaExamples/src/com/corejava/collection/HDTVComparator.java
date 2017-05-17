package com.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HDTVComparator {

	private int size;
	private String brand;
 
	public HDTVComparator(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
 
	public int getSize() {
		return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}


	public static void main(String[] args) {
		HDTVComparator tv1 = new HDTVComparator(55, "Samsung");
		HDTVComparator tv2 = new HDTVComparator(60, "Sony");
		HDTVComparator tv3 = new HDTVComparator(42, "Panasonic");
 
		ArrayList<HDTVComparator> al = new ArrayList<HDTVComparator>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
 
		Collections.sort(al, new SizeComparator());
		for (HDTVComparator a : al) {
			System.out.println(a.getBrand());
		}
	}
}
 
class SizeComparator implements Comparator<HDTVComparator> {
	@Override
	public int compare(HDTVComparator tv1, HDTVComparator tv2) {
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) {
			return 1;
		} else if (tv1Size < tv2Size) {
			return -1;
		} else {
			return 0;
		}
	}

 
}
