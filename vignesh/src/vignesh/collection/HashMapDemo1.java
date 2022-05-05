package vignesh.collection;

import java.util.TreeMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeMap tm = new 	TreeMap();
     tm.put(101, "bmw");
     tm.put(102, "ferrari");
     tm.put(103, "bucati");
     
     System.out.println(tm);
     
     System.out.println();
     
     TreeMap tm1 = new TreeMap();
     tm1.putAll(tm);
     System.out.println(tm1);
     
     
     System.out.println();
     System.out.println(tm1.firstEntry());
     
     System.out.println();
     System.out.println(tm1.lastEntry());
     
	}

}
