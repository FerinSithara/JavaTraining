package day16;

import java.io.File;
import java.io.IOException;

public class day16File {

	public static void main(String[] args) {
		
		File f1 = new File("D:\\Ferin\\Testing Course\\Selenium\\day3");
		
		if (f1.exists())
		{
			System.out.println("File exists");
		}
		else
		{
			
				f1.mkdir();
			
		}

	}

}
