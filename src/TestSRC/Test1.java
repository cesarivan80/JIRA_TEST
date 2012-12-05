package TestSRC;

import com.thoughtworks.selenium.*;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class Test1 {
	private Selenium selenium;
	private HttpCommandProcessor proc;

	@Before
	public void setUp() throws Exception {
		proc = new HttpCommandProcessor("localhost", 4444, "*firefox", "https://addons.mozilla.org/");
		selenium = new DefaultSelenium(proc);
		selenium.start();
	}

	@After
	public void tearDown() throws Exception {
		if (selenium != null) {
			selenium.stop();
			selenium = null;
		}
	}

	@Test
	public void myTestMethod() throws Exception {
		selenium.open("file:///Users/imurillo/Documents/Adobe%20Flash%20Builder%204.6/FlexMonkiumTest/bin-debug/FlexMonkiumTest.html");
		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"SelectText\" value=\"txtPass\">   <arg value=\"0\"/>   <arg value=\"0\"/> </UIEvent>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		
		Thread.sleep(500);

		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"Input\" value=\"txtPass\"><arg value=\"test\"/></UIEvent>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		
		Thread.sleep(500);

		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"Click\" value=\"Click\"/>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		
		Thread.sleep(500);

		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"Click\" value=\"Yes or No\"/>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		
		Thread.sleep(500);

	}
}
