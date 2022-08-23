package com.Numadic.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectRepo extends TestBase
{

	Properties prop;
	
	
	public ObjectRepo(String filePath)
	{
		
		try
		{
			FileInputStream loc = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(loc);
		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	public String getLocator(String ele) throws Exception
	{
		
		String data = prop.getProperty(ele);
		System.out.println(data);
		return data;
		
	}
	
	
}
