package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("./src/test/java/config/project.properties");
		
		prop.load(fis);
		
		System.out.println("My first name is: "+prop.getProperty("firstname"));
		System.out.println("My last name is: "+prop.getProperty("lastname"));
	}

}
