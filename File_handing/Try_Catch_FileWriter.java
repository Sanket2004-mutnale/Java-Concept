package com.File_handing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.AccessException;

public class Try_Catch_FileWriter {
	public static void main(String[] args) {
		try {
			FileWriter f =new FileWriter("C:\\Users\\admin\\Desktop\\file handling\\text.txt");
			try {
				f.write("Hellow");
			}
			finally {
				f.close();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
