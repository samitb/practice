package com.corejava.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample  {
	 
	  public static void main(String[] args) {
	   
	    //create LinkedHashMap object
	    LinkedHashMap lHashMap = new LinkedHashMap();
	   
	    //add key value pairs to LinkedHashMap
	    lHashMap.put("1","One");
	    lHashMap.put("2","Two");
	    lHashMap.put("3","Three");
	   
	    /*
	      To check whether a particular key exists in LinkedHashMap use
	      boolean containsKey(Object key) method of LinkedHashMap class.
	      It returns true if the LinkedHashMap contains mapping for specified key
	      otherwise false.
	    */
	   
	    boolean blnExists = lHashMap.containsKey("3");
	    System.out.println("3 exists in LinkedHashMap ? : " + blnExists);
	    
	    
	    /*
	      To check whether a particular value exists in LinkedHashMap use
	      boolean containsValue(Object key) method of LinkedHashMap class.
	      It returns true if the value is mapped to one or more keys in the
	      LinkedHashMap otherwise false.
	    */
	   
	    boolean blnExists2 = lHashMap.containsValue("Two");
	    System.out.println("Two exists in LinkedHashMap ? : " + blnExists2);
	    
	    
	    
	    
	    /*
	      get Set of keys contained in LinkedHashMap using
	      Set keySet() method of LinkedHashMap class
	    */
	   
	    Set st = lHashMap.keySet();
	   
	    System.out.println("Set created from LinkedHashMap Keys contains :");
	    //iterate through the Set of keys
	    Iterator itr = st.iterator();
	    while(itr.hasNext())
	      System.out.println(itr.next());
	     
	    /*
	       Please note that resultant Set object is backed by the LinkedHashMap.
	       Any key that is removed from Set will also be removed from
	       original LinkedHashMap object. The same is not the case with the element
	       addition.
	    */
	   
	    //remove 2 from Set
	    st.remove("2");
	   
	    //check if original LinkedHashMap still contains 2
	    boolean blnExists3 = lHashMap.containsKey("2");
	    System.out.println("Does LinkedHashMap contain 2 ? " + blnExists3);
	  }
	}
