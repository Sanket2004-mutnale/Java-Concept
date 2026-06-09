package com.File_handing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Read_And_Write {
	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("C:\\Users\\admin\\Desktop\\file handling\\ForReader.txt");
		FileOutputStream fo = new FileOutputStream("C:\\Users\\admin\\Desktop\\file handling\\ForWriter.txt");
			int i;
			while((i=fi.read())!=-1) {
				fo.write((char)i);
			}
			System.out.println("Data copied");
	}

}
