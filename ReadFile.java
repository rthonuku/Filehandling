package com.prakya.file.read;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.prakya.file.write.WriteFile;

public class ReadFile extends WriteFile {
	
	public void read()
	{
		//File file = new File("E:\\MyFileCreationThroughFileHandling\\File1.txt");
			
		     try {
		      	File file = new File("E:\\MyFileCreationThroughFileHandling\\File1.txt");
				Scanner read = new Scanner(file);
				int i=0;
				while(read.hasNext())
				{
					System.out.println(i);
					String data;
					data = read.nextLine();
					System.out.println("data ::"+data);
					WriteFile wr = new WriteFile();
					wr.write(data);
					System.out.println(data);
					i++;
				}
				
				read.close();
			      }
				
			catch(IOException E)
			{
				System.out.println("Error while reading the File or not exsist");
				E.printStackTrace();
			}
	}
	public static void main(String args[])
	
	{
		
	ReadFile rf = new ReadFile();
	rf.read();
	
		
		
	}

}
