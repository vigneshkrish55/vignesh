package com.test.SeliniumDemo2Maven;

import org.testng.annotations.Test;







public class NewDemo extends MainTest {
@Test
public void run() 
{
Webtable demoq=new Webtable();
demoq.demoqa(driver);
demoq.search();

}

}
