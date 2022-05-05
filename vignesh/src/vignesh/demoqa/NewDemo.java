package vignesh.demoqa;

import org.testng.annotations.Test;

import vignesh.demoqa.MainTest;







public class NewDemo extends MainTest {
@Test
public void run() 
{
Webtable demoq=new Webtable();
demoq.demoqa(driver);
demoq.search();

}

}
