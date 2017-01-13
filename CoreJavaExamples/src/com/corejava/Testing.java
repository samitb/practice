package com.corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class Testing{

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		int n,m,k;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number of elements and element to find");
		//n = scr.nextInt();
		//m = scr.nextInt();
		//System.out.println(n);
		
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("5", "E");
		map1.put("6", "F");
		map1.put("7", "G");
		map1.put("8", "H");
		map1.put("1", "A");
		map1.put("2", "B");
		map1.put("3", "C");
		map1.put("4", "D");
		
		List<String> list1 = new ArrayList<String>();
		list1.add("5");
		list1.add("6");
		list1.add("7");
		list1.add("8");
		list1.add("9");
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("10");
		list1.add("11");
		
		
		
		Collections.sort(list1);
		
		
		HashMap hMap = new HashMap();
		   
	    //add key value pairs to HashMap
	    hMap.put("1","One");
	    hMap.put("2","Two");
	    hMap.put("3","Three");
	   
	    /*
	      get Collection of values contained in HashMap using
	      Collection values() method of HashMap class
	    */
	    Collection c = hMap.entrySet();
	   
	    //obtain an Iterator for Collection
	    Iterator itr = c.iterator();
	   
	    //iterate through HashMap values iterator
	    while(itr.hasNext())
	      System.out.println(itr.next());
	    
	    //create Hashtable object
		Hashtable ht = new Hashtable();
	    
	    //add key value pairs to Hashtable
	    ht.put("1","One");
	    ht.put("2","Two");
	    ht.put("3","Three");
	   
	    /*
	      get Enumeration of values contained in Hashtable using
	      Enumeration elements() method of Hashtable class
	    */
	    Enumeration e = ht.elements();
	   
	    
	    //iterate through Hashtable values Enumeration
	    while(e.hasMoreElements())
	      System.out.println(e.nextElement());
	    
	    
	    Collection c2 =ht.values();
	    
	  //obtain an Iterator for Collection
	    Iterator itr2 = c.iterator();
	   
	    //iterate through HashMap values iterator
	    while(itr2.hasNext())
	      System.out.println(itr2.next());
	    
	  }
   
}
