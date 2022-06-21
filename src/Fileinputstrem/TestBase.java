package Fileinputstrem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	public Properties prop;
	
	public static void main(String[] args) {
		TestBase tb= new TestBase();
		tb.TestBase1();
	}
	
	
	public void TestBase1(){
	
		try {
			prop = new Properties();
			FileInputStream ip= new FileInputStream(System.getProperty("C:/Users/debmi/eclipse-workspace/restapitest/src/main/java/com/qa/config/config.propeties"));
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
