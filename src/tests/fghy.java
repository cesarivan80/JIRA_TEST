package tests;

import com.thoughtworks.selenium.*;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class fghy {
	private Selenium selenium;
	private HttpCommandProcessor proc;

	@Before
	public void setUp() throws Exception {
		proc = new HttpCommandProcessor("localhost", 4444, "*chrome", "http://www.gorillalogic.com/");
		selenium = new DefaultSelenium(proc);
		selenium.start();
		///////test git hub
		///////Fixed WEBAPPLICATION-469
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
		selenium.open("/userfiles/MonkeyContacts/MonkeyContacts.html");
		selenium.windowMaximize();
		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"SelectText\" value=\"inName\">   <arg value=\"0\"/>   <arg value=\"0\"/> </UIEvent>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		Thread.sleep(500);
		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"Input\" value=\"inName\"><arg value=\"test\"/></UIEvent>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		Thread.sleep(500);
		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"Open\" value=\"inType\"/>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"Select\" value=\"inType\"><arg value=\"Work\"/></UIEvent>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		Thread.sleep(500);
		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"SelectText\" value=\"inPhone\"><arg value=\"0\"/><arg value=\"0\"/></UIEvent>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"Input\" value=\"inPhone\"><arg value=\"555555555555\"/></UIEvent>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"Open\" value=\"inDate\"/>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		Thread.sleep(500);
		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"Change\" value=\"inDate\"><arg value=\"Tue Oct 9 2012\"/></UIEvent>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		Thread.sleep(500);
		for (int t = 0;; t++) {
			if (t >= 60) fail("timeout");
			try {
				if (proc.getBoolean("isFlexMonkey", new String[] {"<UIEvent command=\"Click\" value=\"Add\"/>"})) break;
			} catch (Exception e) { }
			Thread.sleep(500);
		}
		Thread.sleep(500);
	}
}
