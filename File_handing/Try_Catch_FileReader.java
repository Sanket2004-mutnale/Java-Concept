package com.File_handing;

import java.io.FileReader;
import java.io.IOException;

public class Try_Catch_FileReader {

	public static void main(String[] args) {
		FileReader f;
		try {
			 f= new FileReader("C:\\Users\\admin\\Desktop\\file handling\\Text1.txt");
			try {
				int i;
				while((i=f.read())!=-1) {
					System.out.print((char)i);
				}
			}finally {
				f.close();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
