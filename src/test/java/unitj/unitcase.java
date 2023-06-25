package unitj;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.base.baseclass;
import org.dd.datadriven;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class unitcase extends baseclass {
     
	@BeforeClass
	public static void start() {
		launchBrowser();
		windowMaximize();
		
	}
	@AfterClass
	public static void end() {
		Date d = new Date();
        System.out.println(d);
	}
	@Test
	public void tc1() {

		datadriven d = new datadriven();
		launchUrl("https://www.facebook.com/");
		String title = pageTitle();
		String url = pageUrl();
		passText("kayal", d.getEmail());
		Assert.assertEquals("check url", url, title.contains("fb"));
  		passText("123", d.getPasswrd());
		 
		System.out.println("test case 1");
	}
	@Test
	public void tc3() {
		System.out.println("test case 3");
		launchUrl("https://www.google.com/search?q=gmail+login&rlz=1C1CHBF_enIN1056IN1056&oq=gmail&aqs=chrome.0.35i39i650j69i57j0i433i512j0i131i433i512l2j69i61l2j69i60.2080j0j7&sourceid=chrome&ie=UTF-8");
		
	}
	@After
	public void tc6() {
		Date d = new Date();
        System.out.println(d);
	}
	@Before
	public void tc7() {
    System.out.println("before....");
	}
	@Test
	public void tc4() {
		System.out.println("test case 4");
		launchUrl("https://inmakesedu.com/");
	}
	@Test
	public void tc5() {
		System.out.println("test case 5");
		launchUrl("https://www.youtube.com/");
	}
	@Ignore
	public void tc2() {
		System.out.println("test case 2");
}
}