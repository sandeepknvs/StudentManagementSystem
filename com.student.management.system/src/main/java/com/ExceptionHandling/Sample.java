package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Line1");
		File f = new File("demo.txt");
		FileReader fr;
		BufferedReader bf = null;
		try {
			fr = new FileReader(f);
			bf = new BufferedReader(fr);
			String data = bf.readLine();
			System.out.println(data);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Line2");
		System.out.println("Line3");
		
		

	}

}
