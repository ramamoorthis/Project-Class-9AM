package org.comp;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample3 extends LibGlobal {
@BeforeClass
private void beforeClass() {
getDriver();
loadUrl("https://www.facebook.com/");
maximize();
}
	
@Test
private void tc1() {

WebElement username = locatorById("email");
skey(username, "hello");


String att = username.getAttribute("value");
Assert.assertEquals("hello", att);
System.out.println(att);

SoftAssert a=new SoftAssert();
a.assertEquals("hello", username);
System.out.println("Assert Pass");
System.out.println(username);
}


@AfterClass
private void tc2() {
driver.close();
}
}