package com.File_handing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
	
		FileReader f=new FileReader("C:\\Users\\admin\\Desktop\\file handling\\Text1.txt");
		
		int i;
		
		while((i=f.read())!=-1) {
			System.out.print((char)i);//TypeCasting number convert into char;
		}
	}

}
