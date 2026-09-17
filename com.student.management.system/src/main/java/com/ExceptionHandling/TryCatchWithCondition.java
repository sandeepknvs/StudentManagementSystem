package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchWithCondition {

	public static void main(String[] args) {
		File file = new File("demo.txt");
		FileReader fr;
		String data = null;
		try(BufferedReader bf = new BufferedReader(new FileReader(file)))
		{
			data = bf.readLine();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(data);
		

	}

}
