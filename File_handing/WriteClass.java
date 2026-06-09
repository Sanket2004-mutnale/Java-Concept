package com.File_handing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteClass {
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\admin\\Desktop\\file handling\\Text1.txt");
		
		f.write("Hellow,Welcome!!!!");
		f.close();
		System.out.println("Succesful ");
	}

}
