package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadConfig {

Properties prop = null;
	
	public void loadProperties() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("./src/test/java/config/project.properties");
		prop.load(fis);
	}
}
