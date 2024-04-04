package com.prakya.file.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.prakya.file.read.ReadFile;

public class WriteFile {
	
	public void write(String str)
	{
		try {
	         File file= new File("E:\\MyFileCreationThroughFileHandling\\File3.txt");
		     FileWriter fileWriter = new FileWriter(file);
		     BufferedWriter bw = new BufferedWriter(fileWriter);
		     
		     if(str.equalsIgnoreCase("Santhosh"))
		     {
			     bw.append(str+" is a good boy");
			 }
		     else if(str.equalsIgnoreCase("Ravi Prakya"))
		     {
		    	 bw.append(str+" is a arrogant");
		     }
		     System.out.println("entered to file");
		     bw.newLine();
		     bw.flush();
		     if(file.exists())
		     {
		    	 Scanner sc = new Scanner(file);
		    	 while(sc.hasNext())
		    	 {
		    		 String data=sc.nextLine();
		    		 System.out.println(data);
		    	 }
		     }
		    
		    
		    }
		catch(Exception E)
		{
			E.printStackTrace();
		}
	}
	
	

}
