package vignesh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public void arrayListExample()
	{
		List <String> arrayList= new ArrayList<String>();
		
		arrayList.add("BENTLY");
		arrayList.add("BENZ");
		arrayList.add("BMW");
		arrayList.add("FERRARI");
		arrayList.add("BENTLY");
		arrayList.add("BENTLY");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(1));
		
		System.out.println(arrayList.indexOf("BENTLY"));
		
		System.out.println(arrayList.indexOf("bently"));
		
		System.out.println(arrayList.lastIndexOf("BENTLY"));
		
		System.out.println("*************************************");
		
		List <String> copyList= new ArrayList<String>();
		copyList.addAll(arrayList);
		
		System.out.println(copyList);
		
		copyList.clear();
		
		System.out.println(copyList);
		System.out.println("*************************************");
		
		arrayList.remove(0);
		System.out.println(arrayList);
		arrayList.remove("BENTLY");
		
		System.out.println(arrayList);
		
		arrayList.add(null);
		
		System.out.println(arrayList);
		
		arrayList.set(2, "TATA");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.isEmpty());
		
		//ITERATE
		
		for(String string : arrayList )
		{
			System.out.println("using for each :"+string);
			
		}
		
		System.out.println("*************************************");
		
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println("using for loop :"+arrayList.get(i));
			
		}
		
		System.out.println("***********************************");
		
		ListIterator<String> it= arrayList.listIterator() ;
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			}
		System.out.println("***********************************");
		
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
			}
		System.out.println("***********************************");
		Iterator<String> iterator= arrayList.iterator() ;
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 ArrayListDemo examp= new ArrayListDemo();
 examp.arrayListExample();
 
	}

}
