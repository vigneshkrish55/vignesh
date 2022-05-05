package vignesh.Array;
import java.util.ArrayList;
import java.util.List;



public class ArrayListDemo1 {
	
	public void arraylistexam()
	{
		List<String> arraylist = new ArrayList<String>();
		
		arraylist.add("bmw");
		arraylist.add("ferrari");
		arraylist.add("bugati");
		arraylist.add("tata");
		
		System.out.println(arraylist);
		
		System.out.println(arraylist.get(1));
		
	  System.out.println("********************");
	  
	  for(int i=0; i<arraylist.size();i++)
	  {
		  System.out.println("using her loop:"+arraylist.get(i));
	  }
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ArrayListDemo1 exam=  new ArrayListDemo1();
  exam.arraylistexam();
  
	}

}
