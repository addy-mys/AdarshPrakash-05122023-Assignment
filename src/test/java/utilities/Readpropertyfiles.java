package utilities;

 

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

 

public class Readpropertyfiles {

	public void main() throws IOException

 

	{
		FileReader frCong = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\SeleniumStart\\src\\test\\resources\\configfiles\\locators\\locator.properties");
		Properties p = new Properties();

		p.load(frCong);
	
	}

 

}