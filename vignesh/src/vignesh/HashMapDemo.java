package vignesh;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put("bmw",100);
		hm.put("ferrari",101);
		hm.put("bucati",102);
		
	    System.out.println(hm);
	    
		System.out.println();

	    System.out.println(hm.containsKey("bucati"));
	    System.out.println(hm.containsValue(101));
		
        System.out.println();
		
		Set s = hm.keySet();
		System.out.println("key are" + s);
		
		System.out.println();
		
		Collection c = hm.values();
		System.out.println("values are"+ c);
		
		System.out.println();
		
		Set s2 = hm.entrySet();
		System.out.println("entries are" +s2);
		
		System.out.println();
		
		Iterator i = s2.iterator();
		while(i.hasNext())
		{
			//System.out.println(i.next());
			
			System.out.println();
			
			Map.Entry me = (Map.Entry) i.next();
			// System.out.println(me.getKey() + ":" +me.getValue());
			
			//System.out.println();
			if(me.getKey().equals("bmw"))
				//System.out.println(me.getValue());
			
				me.setValue(200);
			
			System.out.print(me);
			}
		

	}

}
