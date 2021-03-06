package TestBase;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;

public class Base {
	public static Properties p;

	public static void loadproperty() {
		try {
File f = new File("C:\\Users\\abhishek khemariya\\Desktop\\Raghu-sir-programing-class\\com.PageLibary.com\\src\\main\\java\\configuration\\OR.properties");
			FileReader fr = new FileReader(f);

			p = new Properties();

			p.load(fr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static By getlocator(String key) {
		loadproperty();
		By loc = null;
		String elevalue = p.getProperty(key);
		String loctype = elevalue.split(":")[0];
		String locvalue = elevalue.split(":")[1];
		switch (loctype) {
		case "id":

			loc = By.id(locvalue);
			break;
		case "name":

			loc = By.name(locvalue);
			break;

		case "tagName":
			loc = By.tagName(locvalue);
			break;

		case "className":
			loc = By.className(locvalue);
			break;

		case "linkText":
			loc = By.linkText(locvalue);
			break;

		case "partialLinkText":
			loc = By.partialLinkText(locvalue);
			break;

		case "cssSelector":
			loc = By.cssSelector(locvalue);
			break;

		case "xpath":
			loc = By.xpath(locvalue);
			break;

		}
		return loc;
	}

	public static void config() {
		try {
			File f1 = new File( "C:\\Users\\abhishek khemariya\\Desktop\\Raghu-sir-programing-class\\com.PageLibary.com\\src\\main\\java\\configuration\\config.properties");

			FileReader fr = new FileReader(f1);

			p = new Properties();

			p.load(fr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String getconfig(String key) {
		config();

		String elevalue = p.getProperty(key);
		return elevalue;
	}
}
