package com.practice.mavenproject;

import java.util.HashMap;

/*
It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs, 
and you can access them by an index of another type (e.g. an Integer). 
One object is used as a key (index) to another object (value). If you try to insert the duplicate key, 
it will replace the element of the corresponding key.
It allows to store the null keys as well, but there should be only one null key object and there can be any number of null values.  
This class makes no guarantees as to the order of the map. To use this class and its methods, you need to import java.util.HashMap package or 
its superclass.*/

public class hashmap {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
    	map.put("Krishna", 10);
    	map.put("Binita",20);
    	map.put("Krishna", 30);
    	map.put("Naresh",null);
  
    	System.out.println("Size of the map is : "+map.size());
    	System.out.println("Content inside map : "+map);    	
    	if(map.containsKey("Krishna"))
    	{
    		int a = map.get("Krishna");
    		System.out.println("Index of Krishna "+a);
    	}    }


	}

