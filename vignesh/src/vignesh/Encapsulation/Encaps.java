package vignesh.Encapsulation;

public class Encaps {
	private String name;
    private int rollno;
    String subject;

   public void setName(String name)
    {
    	this.name=name;
    	
    }
  public  String getName()
    {
    	return name;
    }
  
  public int getRollno()
  {
	  return rollno;
	  
  }
  public void SetRollno(int rollno)
  
  {
	  this.rollno= rollno;
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Encaps e = new Encaps();
          e.setName("abcd");
          System.out.println(e.getName());
          e.rollno=12;
          
          System.out.println(e.rollno=20);
          
          
                   
	}

}
