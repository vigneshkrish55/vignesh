package vignesh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      Properties p = new Properties();
     // FileInputStream fis = new FileInputStream("test.properties");
      FileInputStream fis = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\vignesh\\src\\vignesh\\test.properties");
      p.load(fis);
      System.out.println(p);
      
     String ss = p.getProperty("bucati");
      System.out.println(ss);
      
      p.setProperty("ferrari", "1000");
      FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\eclipse-workspace\\vignesh\\src\\vignesh\\test.properties");
      p.store(fos, "update price");
      
      
	}

}





