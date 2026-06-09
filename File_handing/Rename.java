package com.File_handing;

import java.io.File;

public class Rename {
	public static void main(String[] args) {
		File f =new File("C:\\Users\\admin\\Desktop\\file handling\\Text1.txt");
		File r =new File("C:\\Users\\admin\\Desktop\\file handling\\Sanket.txt");
		if(f.exists()) {
			System.out.println(f.renameTo(r));
		}else {
			System.out.println("File dosenot exsits...!");
		}
	}
}
